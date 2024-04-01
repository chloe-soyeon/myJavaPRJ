import java.util.Scanner;

public class Ex0401 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

//        if ((num%3==0)&&!(num%5==0)) {
//            System.out.println("3의 배수입니다.");
//        }
//        else if ((num%5==0)&&!(num%3==0)) {
//            System.out.println("5의 배수입니다.");
//        }
//        else if ((num%5==0)&&(num%3==0)) {
//            System.out.println("3의 배수, 5의 배수 모두 만족합니다.");
//        }

        int a = num % 3;
        int b = num % 5;

        //3의 배수 5의 배수 모두 만족할때, 15의 배수로 해도 됨. => 연산의 횟수가 줄어듦. 센스!!!!!!!!!
        if ((a==0)&&(b==0)) {
            System.out.println("3의 배수, 5의 배수 모두 만족합니다");
        }
        else if (a==0) {
            System.out.println("3의 배수입니다.");
        }
        else if (b==0) {
            System.out.println("5의 배수입니다.");
        }
        else {
            System.out.println("아무것도 아님");
        }

        s.close();
    }
}
