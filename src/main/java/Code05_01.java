import java.util.Scanner;

public class Code05_01 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        if (num < 100) {
            System.out.print("100보다 ");
            System.out.print("작습니다.");
        }
   }
}

