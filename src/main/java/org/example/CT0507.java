package org.example;

import java.util.Scanner;

public class CT0507 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] array = new int[5];

        for (int i = 0; i < 5; i++) {
            array[i] = s.nextInt();
        }

        int minIndex = 0;
        int temp = 0;
        for (int k = 0; k < 4; k++) {
            minIndex= k;
            for (int j = k+1; j < 5; j++) {
                if ((array[j] < array[k])) {
                    minIndex = j;
                }
            }
            temp = array[minIndex];
            array[minIndex]= array[k];
            array[k]=temp;


        }
        for (int k=0 ; k<5; k++){
            System.out.print(array[k]+ " ");
        }
    }
}
