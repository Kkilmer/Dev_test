package org.example;

public class Teste1 {
    public static void main(String[] args) {
        //int INDICE = 13, SOMA = 0, K = 0;
        //Enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; }
        //Imprimir(SOMA);
        //Ao final do processamento, qual será o valor da variável SOMA?

        int INDICE = 13, SOMA = 0, K = 0;
        if (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }
        System.out.println("SOMA é: " + SOMA);
    }
}