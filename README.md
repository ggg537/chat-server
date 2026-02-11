# 실시간 채팅 서비스 프로젝트
ㅤ   
### 프로젝트 소개
 - Spring Boot와 WebSocket(STOMP), OAuth2, Docker, MySQL을 활용한 실시간 채팅 웹 애플리케이션입니다.  
카카오/구글 로그인으로 채팅방에 입장할 수 있으며, 사용자는 채팅방 생성, 입장, 퇴장, 메시지 송수신, 과거 채팅 내역 조회가 가능합니다.  
관리자는 전체 채팅방과 모든 메시지를 확인할 수 있습니다. 
    
    
- 개발인원 : 1명
- 개발기간: 25.01


## 개발 환경

* Intellij IDEA 
* Java 17
* Spring Boot 3.4.1


## 기술 세부 스택

| 구분       | 사용 기술                                      |
|------------|-----------------------------------------------|
| Backend    | Java 17, Spring Boot, Spring Security, STOMP  |
| Frontend   | JavaScript                                    |
| Auth       | OAuth2 (Google, Kakao)                        |
| DB         | MySQL (Docker 컨테이너 기반)                   |
| Infra      | Docker                                        |
| Protocol   | WebSocket (STOMP)                             |
| Build Tool | Gradle                                        |


## 주요기능

✅ **Spring Security & OAuth2**

- 카카오 및 구글 OAuth2 기반 로그인 및 회원가입 기능 구현
- 사용자 인증 및 권한 관리

✅ **실시간 채팅 시스템**

- STOMP(WebSocket) 프로토콜 기반 채팅방 생성 및 입장
- 사용자의 채팅방 입장/퇴장 기능 처리
- 과거 채팅 내역 조회 기능 제공
- 신규 메시지 수신 시 알림 기능 구현

✅ **관리자 기능**

- 관리자 권한으로 전체 채팅방 목록 및 메시지 확인 가능

✅ **Docker 환경**

- Docker 기반 MySQL 컨테이너 사용
- 안정적인 데이터 저장 및 관리 구현
