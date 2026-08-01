/**
 * ------------------------------------------------------------------------
 * 🏫 Aula 02 - Desafio Variáveis e Constantes
 * ------------------------------------------------------------------------
 * 📌 Resumo da Aula:
 * - Aplicação prática de um desafio de conversão de temperatura (Fahrenheit para Celsius).
 * - Uso da classe `Scanner` (aprendida no bootcamp) para entrada de dados via console.
 * - Utilização de variáveis mutáveis (`tempf`, `C`) para armazenar dados e resultados.
 * - Fixação de constantes imutáveis com a palavra-chave `final` (`ajuste`, `fator`),
 *   seguindo a exigência do professor do curso.
 * - Atenção ao comportamento da divisão em Java: uso de `.0` em `5/9.0` para evitar
 *   a divisão inteira e garantir o resultado decimal correto.
 * - Formatação de saída de dados utilizando `System.out.printf()` com duas casas decimais.
 * ------------------------------------------------------------------------
 * 🇺🇸 Class 02 - Variables and Constants Challenge
 * ------------------------------------------------------------------------
 * 📌 Class Summary:
 * - Practical application of a temperature conversion challenge (Fahrenheit to Celsius).
 * - Use of the `Scanner` class (learned in bootcamp) for console input.
 * - Utilization of mutable variables (`tempf`, `C`) to store data and results.
 * - Enforcement of immutable constants using the `final` keyword (`ajuste`, `fator`),
 *   following the course instructor's requirements.
 * - Attention to Java's division behavior: using `.0` in `5/9.0` to prevent
 *   integer division and ensure the correct decimal result.
 * - Output formatting using `System.out.printf()` with two decimal places.
 * ------------------------------------------------------------------------
 * Autor / Author: Gabriel Canalli
 * ------------------------------------------------------------------------
 */

import java.util.Scanner;

public class aula02 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Me diga uma temperatura em fahrenheit: ");
        var tempf = scanner.nextInt();

        final var ajuste = 32;
        final var fator = 5/9.0;
        var C = (tempf - ajuste) * fator;

        System.out.println("A fórmula de conversão de fahrenheit para celsius é (°F - 32) x 5/9 = °C ");
        System.out.printf("De acordo com a fórmula os %s fahrenheit são %.2f celsius.\n", tempf, C);

    }
}
