# #1. 220627

## **Java**

`SE`: 독자적실행(stand alone방식)  예)컴퓨터상에서 프로그램 실행할때 `더블클릭`으로 실행하는 것

`EE`: 독자적으로 실행 X(<->SE)

SERVLET <- 컨테이너/서버/엔진(SC) <- 실행

JSP <- JC <- 실행

WEB -> HTTP -> 웹서버 -> SC(SERVLET)/  JC(JSP) -> 웹서버 -> WEB

WAS: TOMCAT(WEB  SERVER 제공)

`ME` : 모바일기반. 서비스 미지원



## 개발환경구축(JDK8 - TOMCAT8)

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

   - `client` 접속시

   - `client` 종료시

   - `client`

3. `HttpServletRequest`

   - 요청시

   - 응답시

   - `request`

     

##### 저장: setAttribute(String name, Object value)

##### 추출: getAttribute(String name)

##### 삭제: removeAttribute(String name)



##### `servletContext` 기능

1. `web app` 단위로 데이터 공유
2. `web app` 변수 사용
3. 서버정보추출(잘 쓰지 않는 기능)

##### `servlet context` 추출

​	`ServletConfig`의 `getServletContext()`



##### 서블릿 멤버 변수시 주의사항

지역변수: 사용자들이 독자적으로 사용하는 데이터

멤버변수: 사용자들이 공유하는 데이터