package org.example;

import java.util.Scanner;

public class Teste2 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite um valor: ");
            int numero = sc.nextInt();
            sc.close();

            if (isFibonacci(numero)) {
                System.out.println(numero + " é da sequência de Fibonacci.");
            } else {
                System.out.println(numero + " não da sequência de Fibonacci.");
            }
        }

    public static boolean isFibonacci(int n) {
        int a = 0, b = 1;
        while (b < n) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b == n || n == 0;
    }

}

