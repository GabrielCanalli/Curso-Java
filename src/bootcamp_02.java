/**
 * ------------------------------------------------------------------------
 * 🏫 Bootcamp 02 - Estruturas Condicionais e Entrada de Dados
 * ------------------------------------------------------------------------
 * 📌 Resumo da Aula:
 * - Utilização da classe `Scanner` para capturar dados inseridos pelo
 *   usuário via console (`next()` para String e `nextInt()` para inteiro).
 * - Emprego da inferência de tipos com a palavra-chave `var` para
 *   declaração de variáveis locais.
 * - Aplicação de estruturas condicionais (`if-else`) para verificar regras
 *   de negócio baseadas na idade informada (maioridade ou menoridade).
 * - Formatação de saídas no console utilizando `System.out.printf()`
 *   com especificadores como `%s` para textos e `%d` para números inteiros.
 * ------------------------------------------------------------------------
 * 🇺🇸 Bootcamp 02 - Conditional Structures and User Input
 * ------------------------------------------------------------------------
 * 📌 Class Summary:
 * - Use of the `Scanner` class to capture user input from the console
 *   (`next()` for Strings and `nextInt()` for integers).
 * - Implementation of local variable type inference using the `var` keyword.
 * - Application of conditional structures (`if-else`) to evaluate business
 *   rules based on the provided age (legal age vs. minor).
 * - Formatting console output using `System.out.printf()` with format
 *   specifiers such as `%s` for strings and `%d` for integers.
 * ------------------------------------------------------------------------
 * Autor / Author: Gabriel Canalli
 * ------------------------------------------------------------------------
 */

import java.util.Scanner;

public class bootcamp_02 {

    public static void main(String[] args) {

                var scanner = new Scanner(System.in);
                System.out.println("Qual é o seu nome? ");
                var name = scanner.next();
                System.out.print("Qual é a sua idade? ");
                var age = scanner.nextInt();

                if (age >= 18){
                    System.out.printf("Olá %s, você tem %d anos e é maior de idade.",name, age);
                }

                else{
                    System.out.printf("Olá %s, com %d você é menor de idade!",name, age);
                }
            }
        }
