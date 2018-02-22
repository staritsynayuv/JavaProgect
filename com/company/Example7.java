package com.company;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n = ");
        int n = scanner.nextInt();

        int i;
        for (i=1; i<=n; i++) {
            if ((n%i) == 0) {
                System.out.println(i);
            }
        }
    }
}
