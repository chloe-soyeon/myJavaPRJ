public class Quiz0521 {
    public static void main(String[] args) {
        int a = 2; //a를 전역 변수로 선언
        int b = 1; //b 또한 전역 변수로 선언

        for (int i = 0; i < 9 * 8; i++) { // 총 72번 반복되도록 반복문 설정
            if (a < 10) { //구구단의 row 개념
                System.out.printf("%d x %d = %d \t", a, b, a * b);
                a++; // 2단에서 하나씩 증가
            }

            if (a == 10) { //다음 행으로 넘어가는 용도
                a = 2; // a를 초기화하고
                b++; // b를 증가
                System.out.println(); // 줄바꾸는 역할
            }
        }
    }
}
