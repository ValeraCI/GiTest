package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toHexString(x));
    }
}
