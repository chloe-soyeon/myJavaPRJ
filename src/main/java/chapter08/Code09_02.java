package chapter08;

import java.util.Scanner;

public class Code09_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numAry = new int[4]; //나는 4개 숫자를 저장한다
        int hap = 0;

        System.out.print("숫자 : ");
        numAry[0] = s.nextInt();
        System.out.print("숫자 : ");
        numAry[1] = s.nextInt();
        System.out.print("숫자 : ");
        numAry[2] = s.nextInt();
        System.out.print("숫자 : ");
        numAry[3] = s.nextInt();

//방법 1        hap = numAry[0] + numAry[1] + numAry[2] + numAry[3];

//방법 2
        for (int i = 0 ; i < numAry.length ; i++) {
            hap += numAry[i];
        }

//방법 3
        for (int i : numAry) {
            hap += 1;
        }

        System.out.println("합계 ==> " + hap);

        s.close();
    }
}
