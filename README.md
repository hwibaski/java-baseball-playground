# 숫자 야구 게임 구현 - [NEXTSTEP 플레이그라운드](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

## 숫자 야구 기본 규칙

- 기본적으로 1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 맞추는 게임
- 같은 수가 같은 자리에 있으면 스트라이크, 다른 자리에 있으면 볼, 같은 수가 전혀 없으면 포볼 또는 낫싱이란 힌트를 얻고, 그 힌트를 이용해서 먼저 상대방(컴퓨터)의 수를 맞추면 승리한다.
    - e.g. 상대방(컴퓨터)의 수가 425일 때
        - 123을 제시한 경우 : 1스트라이크
        - 456을 제시한 경우 : 1볼 1스트라이크
        - 789를 제시한 경우 : 낫싱
- 위 숫자 야구 게임에서 상대방의 역할을 컴퓨터가 한다. 컴퓨터는 1에서 9까지 서로 다른 임의의 수 3개를 선택한다. 게임 플레이어는 컴퓨터가 생각하고 있는 3개의 숫자를 입력하고, 컴퓨터는 입력한 숫자에 대한
  결과를 출력한다.
- 이 같은 과정을 반복해 컴퓨터가 선택한 3개의 숫자를 모두 맞히면 게임이 종료된다.
- 게임을 종료한 후 게임을 다시 시작하거나 완전히 종료할 수 있다.

## 프로그래밍 요구 사항

- 자바 코드 컨벤션을 지키면서 프로그래밍한다.
    - 기본적으로 Google Java Style Guide을 원칙으로 한다.
    - 단, 들여쓰기는 '2 spaces'가 아닌 '4 spaces'로 한다.

- indent(인덴트, 들여쓰기) depth를 2가 넘지 않도록 구현한다. 1까지만 허용한다.
    - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
    - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메소드)를 분리하면 된다.

- else 예약어를 쓰지 않는다.
    - 힌트: if 조건절에서 값을 return하는 방식으로 구현하면 else를 사용하지 않아도 된다.
    - else를 쓰지 말라고 하니 switch/case로 구현하는 경우가 있는데 switch/case도 허용하지 않는다.

- 모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외
    - 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
    - UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.

- 3항 연산자를 쓰지 않는다.

- 함수(또는 메소드)가 한 가지 일만 하도록 최대한 작게 만들어라.

## 구현할 기능 목록

- [x] 컴퓨터가 1부터9까지의 서로 다른 수로 이루어진 3자리 수를 가진다
    -  [x] 랜덤한 수 생성
- [x] 플레이어 3자리 수 입력 받기
    - [x] 플레이어 입력 예외처리
        - [x] 숫자가 아닐 경우
        - [x] 3자리보다 더 많이 입력한 경우
- [x] 컴퓨터가 가진 수와 플레이어 입력 수 비교 및 판별
    - [x] 같은 수가 같은 자리에 있으면 스트라이크
    - [x] 컴퓨터가 가진 수와 정확히 일치하는 수를 입력하면 3스트라이크
    - [x] 같은 수가 다른 자리에 있으면 볼
    - [x] 같은 수가 전혀 없으면 포볼 또는 낫싱
    - [x] 판별 결과를 콘솔에 출력한다.
- [x] 만들어진 객체로 게임 진행
    - [x] 게임을 종료한 후 게임을 다시 사작하거나 완전히 종료할 수 있다.

