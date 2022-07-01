# #1. 220627

### 강의자료 다운로드 주소

`````
http://naver.me/GoBQbptw
`````



### **Java**

`SE`: 독자적실행(stand alone방식)  예)컴퓨터상에서 프로그램 실행할때 `더블클릭`으로 실행하는 것

`EE`: 독자적으로 실행 X(<->SE)

SERVLET <- 컨테이너/서버/엔진(SC) <- 실행

JSP <- JC <- 실행

WEB -> HTTP -> 웹서버 -> SC(SERVLET)/  JC(JSP) -> 웹서버 -> WEB

WAS: TOMCAT(WEB  SERVER 제공)

`ME` : 모바일기반. 서비스 미지원



### 개발환경구축(JDK8 - TOMCAT8)

`TOMCAT8`: S.C/ J.C 웹서버 제공

1. JDK 8 설치

2. 환경변수설정(시스템변수)
   - JAVA_HOME=자바설치폴더
   - path= %JAVA_HOME%\bin

3. `TOMCAT 8` 설치(`WAS HOME`)
   - 서버확인법: http://127.0.0.1:8080/ (내 ip에서 8080 port 호출 확인)
   - SERVLET 작성, JSP 작성
     - 이클립스
   - TOMCAT8.0>  webapps > edu
   - 웹서버는 웹 어플리케이션 단위로 제공
   - `tomcat` 서버 실행중인지 확인방법: `windows` 키 > `configure tomcat`> `general`> `service status: started`
   - `context`: `web application`이랑 관련이 있다

4.  `eclipse` 

   - `WebContent` : 디렉토리, 여기에 작업파일 만들면 된다

   - 흐름도: client -> 웹서버(WS) ->  SC -> SERVLET -> SC -> WS -> client

   - WebContent -> WEB-INF -> classes / lib 

     

### `Servlet`이란?

 `web browser`에서 실행 요청 가능한 유일한 자바 프로그램

- `servlet` 작업할 때 필요한 라이브러리(`tomcat` 라이브러리)
  - `javax.servlet: ServletContext`
  - `javax.servlet.http :  HttpServletRequest`

- `servelet` 실행순서: `servlet` 은 `servlet container`에 의해 실행됨
  - 최초요청? 
    - Y: 메모리로딩 -> 객체생성 -> init() -> service()
    - N: service()

##### `HttpServet`

1. 서블릿 구현

2. 서블릿 논리 url 설정

   (1) web.xml

   (2) 서블릿소스(어노테이션)

   - 간단하되 디버깅이 어렵다	

     - 남이 만든 라이브러리 사용시 어노테이션으로 표현하기 어렵다

# #2. 220628

##### HttpServletRequest

1. ##### []

   	- 같은타입
   	- 사이즈x

2. ##### `collection` 객체: `java.util`

   - set, list, map

   - enumeration, iterator

     

### 4장. 질의문자열

##### `charset` 표현방식

`````markdown
1. 8859_1: 영문
2. UTF-8: 다국어, 3byte
3. EUC-KR: 영문, 한글, 2byte
`````



##### `get` 과 `post` 방식 차이(method="GET", method="POST")

- `GET`
  - HEADER에 있는 데이터 전송
  - URL 뒤에 정보 노출
- `POST`
  - BODY에 있는 데이터 전송
  - URL 뒤에 정보 노출  X

`````markdown
# CRUD
CREATE
READ
UPDATE
DELETE

//생성, 수정-> POST
//READ -> GET 
`````



### 6장. 상태정보 유지기술

#### 저장소(`scope`)

1. `ServletContext`

   - 서버 시작시

   - 서버 중지시

   - `web app` 

2. `HttpSession` : 로그인/로그아웃, 장바구니

   - `client` 접속시: `HttpServletRequest` 의  `getSession()` 또는 `getSession(True)`실행시

   - `client` 종료시: 웹브라우저 종료, `invalidate()`, 유효시간 경과

   - `client`

3. `HttpServletRequest`

   - 요청시

   - 응답시

   - `request`

     

##### 저장: `setAttribute`(String name, Object value)

##### 추출: `getAttribute`(String name)

##### 삭제: `removeAttribute`(String name)



##### servletContext 기능

1. `web app` 단위로 데이터 공유

2. `web app` 변수 사용

3. 서버정보추출(잘 쓰지 않는 기능)

   

##### servlet context 추출

​	`ServletConfig`의 `getServletContext()`



##### 서블릿 변수

지역변수: 사용자들이 독자적으로 사용하는 데이터

멤버변수: 사용자들이 공유하는 데이터



##### HttpSession 기능

`client` 단위로 데이터 공유



# #3. 220629

##### `HttpSession` 추출

`````markdown
HttpServletRequest 의 getSession()
					  getSession(True)  존재하지 않으면 새로 생성해서 리턴
==================================getSession(), getSession(True) 은 결과값 동일
					  getSession(False) 존재하지 않으면 `null` 리턴			
`````



##### isNew() 메소드

```markdown
`getSession()`, `getSession(True)` 로 새로 만들어서 리턴해서 받은 건지 기존에 리턴받은 값인지 알 수 있는 메소드
```



##### 로그인처리

1. ID, 비밀번호 추출

2. 유효성검사(필수입력, 입력패턴, 값 정합성여부) => 부적합시 입력페이지 `RELOAD`

3. DB 데이터

4. (선택)현재 로그인 상태여부 판단 => 로그인상태인데 로그인 시도시 로그아웃안내

5. 로그인작업

   

##### 로그아웃

1. 현재 로그인 상태여부 판단 
2. 로그아웃작업



### 7장. 고급기능

##### Filter

1. 필터구현

2. 필터등록

   ```xml
   1. 예시
   <filter>
       <filter-name>flow1</filter-name>
       <filter-class>com.edu.test.FlowFilter1</filter-class>
   </filter>
   
   2. 예시
   <filter>
       <filter-name>flow2</filter-name>
       <filter-class>com.edu.test.FlowFilter2</filter-class>
       <init-param>
           <param-name>charset</param-name>
           <param-value>utf-8</param-value>
       </init-param>
   </filter>
   ```

3. 필터매핑: 등록한 필터가 어떤 페이지에 연결시킬지 정하는 작업



# # 220630

##### url-pattern에서 *의 의미

```xml
1. <url-pattern>*.do</url-pattern>
<예시>
http://localhost:8080/edu/a.do
http://localhost:8080/edu/b.do
http://localhost:8080/edu/shop/index.do
http://localhost:8080/edu/board/list.do

.do로 끝나는 것들에 대한 요청이 들어왔을 때 처리
    
2. <url-pattern>/*</url-pattern>
<예시>
http://localhost:8080/edu/test.html

/ 뒤에 어떤 요청이 들어와도 처리한다
```



##### ~Listener

1. `interface`

2. `callback method`

   

### 8장. JSP

##### JSP=SERVLET



##### 태그 

- `HTML`

- `JSP`

  - 스크립트 기반 태그

    ```	jsp
    <%@ %> 
    <% %> 
    <%= %> 
    <%! %>
    ```

  - `XML` 기반 태그

    - 표준 액션 태그: 표준

      ````jsp
      <jsp:forward>	<jsp:include>
      <jsp:useBean>	<jsp:getProperty>	<jsp:setProperty>
      ````
    
    - 커스텀 태그: 개발자가 만들어서 사용하는 태그
    
      `````jsp
      <output></output>
      표준액션태그? 커스텀태그?
      
      tag library 등장 
      `````
    
      

# # 220701

### 10장. 표준액션태그와 JSP 자바빈즈



##### INCLUDE 지시자 사용방식

`````JSP
1.
<jsp:include page="exam02.jsp" />

2.
<%@ include file="exam02.jsp" %>

결과는 값다. 하지만, 
2. 는 자바 실행하면서 INCLUDE
1. 은 자바 실행후 결과값 도출할 때 INCLUDE 한다.
`````



##### BEAN? BEANS?

- `BEAN` = 서버에 의해 사용되는 자바 객체

  - 자바 객체를 사용하려면,

    1. 객체선언

    2. 객체생성(메모리에 할당)

    3. 객체사용

       

### 15장. 디자인패턴

##### VIEW

```markdown
HTML, CSS, JS(JQuery, react, vue.is, ...), JSP
```



##### CONTROLLER

`VIEW`의 요청 받는 객체, 서블릿(모델2)으로 개발

1. `parameter` 추출
2. 유효성 검사
3. 서비스 메소드 호출
4. 출력부 이동



##### Model: POJO

- `service`(`Biz`)
- `DAO`: `DB`



##### 서비스처리절차(3-TIER)

`````markdown
VIEW -> CONTROLLER -> BIZ -> DAO -> DB -> DAO -> BIZ -> CONTROLLER -> VIEW 순

각 프로세스를 세 부분으로 나눌 수 있는데,
VIEW -> CONTROLLER  ; Presentation(struits, Spring MVC)
-> BIZ ; Biz(Spring ADP, Spring IDC)
-> DAO -> DB ; Persistent(myBatis, Hibernate, Spring JDBC)
`````