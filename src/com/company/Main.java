package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i ;
        int fackt=1;
        for ( i =1; i <=number; i++) {
            fackt=fackt * i;
        }
        System.out.println(number+"n "+"="+fackt);

    }
}
