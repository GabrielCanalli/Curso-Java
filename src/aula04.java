/**
 * ------------------------------------------------------------------------
 * 🏫 Aula 04 - Console
 * ------------------------------------------------------------------------
 * 📌 Resumo da Aula:
 * - Estudo das formas de saída de dados no console utilizando
 * `System.out.print()`, `System.out.println()` e `System.out.printf()`.
 * - Compreensão da diferença entre `print` (sem quebra de linha),
 * `println` (com quebra de linha) e `printf` (saída formatada).
 * - Uso de especificadores de formatação como `%d`, `%.1f` e `%s`
 * para exibir inteiros, números decimais e textos.
 * - Introdução à entrada de dados pelo teclado utilizando a classe
 * `Scanner`.
 * - Leitura de diferentes tipos de dados com `nextLine()` (String)
 * e `nextInt()` (inteiro).
 * - Utilização da inferência de tipos com a palavra-chave `var`
 * para declarar variáveis locais.
 * - Aplicação prática combinando entrada e saída de dados para
 * solicitar nome, sobrenome e idade do usuário e exibir uma
 * mensagem personalizada.
 * - Encerramento do objeto `Scanner` com `scanner.close()` para
 * liberar os recursos utilizados.
 * ------------------------------------------------------------------------
 * 🇺🇸 Class 04 - Console
 * ------------------------------------------------------------------------
 * 📌 Class Summary:
 * - Study of console output using `System.out.print()`,
 * `System.out.println()`, and `System.out.printf()`.
 * - Understanding the differences between `print` (no line break),
 * `println` (with line break), and `printf` (formatted output).
 * - Use of format specifiers such as `%d`, `%.1f`, and `%s`
 * for displaying integers, floating-point numbers, and strings.
 * - Introduction to keyboard input using the `Scanner` class.
 * - Reading different data types with `nextLine()` (String)
 * and `nextInt()` (integer).
 * - Use of local variable type inference with the `var` keyword.
 * - Practical application combining user input and formatted output
 * to display a personalized greeting.
 * - Closing the `Scanner` object with `scanner.close()` to
 * properly release system resources.
 * ------------------------------------------------------------------------
 * Autor / Author: Gabriel Canalli
 * ------------------------------------------------------------------------
 */


import java.util.Scanner;

public class aula04 {

    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.println(" dia!!!");

        System.out.println("Bom dia!!!");

        System.out.printf("Megasena: %d %d %d %d %d %d\n", 1, 2, 3, 4, 5, 6);

        System.out.printf("Salário: %.1f\n", 1234.5678);

        System.out.printf("Nome: %s\n", "João");

        var scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        var nome = scanner.nextLine();

        System.out.println("Digite o seu sobrenome: ");
        var sobrenome = scanner.nextLine();

        System.out.println("Digite a sua idade: ");
        var idade = scanner.nextInt();

        System.out.printf("Olá %s %s tem %d anos", nome, sobrenome, idade);

        scanner.close();


    }
}
