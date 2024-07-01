package org.example;

import java.util.Scanner;

public class Quiz0416 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        int [] array = new int[num];

        for (int i = 0 ; i < array.length ; i++) {
            array[i] = s.nextInt();
        }


        for (int j = 0 ; j < array.length - 1 ; j++) {
            if (array[j] > array[j+1]) {
                int temp = array[j+1];
                array[j+1] = array[j];
                array[j] = temp;
            }
        }

        for (int k : array) {
            System.out.print(k + " ");
        }
    }
}
