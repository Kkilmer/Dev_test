package org.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Teste3 {
    public static void main(String[] args) {

        //Dado um vetor que guarda o valor de faturamento diário de uma distribuidora,
        // faça um programa, na linguagem que desejar, que calcule e retorne:
        //• O menor valor de faturamento ocorrido em um dia do mês;
        //• O maior valor de faturamento ocorrido em um dia do mês;
        //• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.
        //
        //IMPORTANTE:
        //a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
        //b) Podem existir dias sem faturamento, como nos finais de semana e feriados.
        // Estes dias devem ser ignorados no cálculo da média;

        List<Double> valores = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("/home/kkilmer//job/workspace-linux-UNIESP/2025.1-project/BACKEND-AV/Dev-tecnico/src/main/java/org/example/dados.json"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                if (linha.contains("\"valor\":")) {
                    String valorStr = linha.split(":")[1].replace(",", "").trim();
                    double valor = Double.parseDouble(valorStr);
                    if (valor > 0.0) {
                        valores.add(valor);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!valores.isEmpty()) {
            double menorValor = valores.stream().min(Double::compareTo).orElse(0.0);
            double maiorValor = valores.stream().max(Double::compareTo).orElse(0.0);
            double media = valores.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
            long diasAcimaDaMedia = valores.stream().filter(v -> v > media).count();

            System.out.println("Menor faturamento dia: " + menorValor);
            System.out.println("Maior faturamento dia: " + maiorValor);
            System.out.println("Dias acima da média: " + diasAcimaDaMedia);
        } else {
            System.out.println("Nenhum dado encontrado.");
        }
    }
}