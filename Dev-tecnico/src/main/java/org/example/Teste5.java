package org.example;

public class Teste5 {
    public static void main(String[] args) {

        String org = "desenvolvimento";
        String invt = "";


        for (int i = org.length() - 1; i >= 0; i--) {
            invt += org.charAt(i);
        }

        System.out.println("Original: " + org);
        System.out.println("Invertida: " + invt);
    }
}

