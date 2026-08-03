/**
 * ------------------------------------------------------------------------
 * 🏫 Aula 03 - Tipos Primitivos em Java
 * ------------------------------------------------------------------------
 * 📌 Resumo da Aula:
 * - Estudo dos tipos primitivos numéricos inteiros (byte, short, int, long)
 *   e suas respectivas capacidades e tamanhos em bytes que dobram de escala
 *   (byte: 1, short: 2, int: 4, long: 8).
 * - Compreensão sobre os limites de armazenamento e a necessidade do sufixo 'L'
 *   em literais long para valores que extrapolam o padrão int.
 * - Estudo dos tipos numéricos reais (float e double), entendendo a inferência
 *   padrão do compilador para double e a necessidade do sufixo 'F' em floats.
 * - Uso de outros tipos primitivos essenciais como boolean (lógico) e char (caractere).
 * - Aplicação prática com operações e exibição de dados no console utilizando
 *   concatenação e formatação (`printf`).
 * ------------------------------------------------------------------------
 * 🇺🇸 Class 03 - Primitive Types in Java
 * ------------------------------------------------------------------------
 * 📌 Class Summary:
 * - Study of integer primitive types (byte, short, int, long) and their
 *   respective sizes and byte lengths doubling in scale (byte: 1, short: 2,
 *   int: 4, long: 8).
 * - Understanding storage limits and the necessity of the 'L' suffix on long
 *   literals for values exceeding the standard int range.
 * - Study of floating-point real types (float and double), understanding
 *   the compiler's default inference to double and the requirement of the 'F' suffix for floats.
 * - Use of other essential primitive types such as boolean (logical) and char (character).
 * - Practical application with operations and console output display using
 *   string concatenation and formatting (`printf`).
 * ------------------------------------------------------------------------
 * Autor / Author: Gabriel Canalli
 * ------------------------------------------------------------------------
 */

public class aula03 {

    public static void main(String[] args) {
        // Informação do funcionario

        // Tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoss = 542;
        int id = 56789;
        long pontosAcumulados = 3_234_845_223L;

        // Tipos numéricos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipos booleano
        boolean estaDeFerias = false;  // true

        // Tipo caractere
        char status = 'A'; // ativo

        // Dias de Empresa
        System.out.println("Eu tenho "+anosDeEmpresa * 365+" dias trabalhados nessa empresa!");  //exemplo

        // Número de Viagens
        System.out.printf("Eu fiz "+numeroDeVoss / 2+" viagens com %s voos!\n", numeroDeVoss); //exemplo

        // Pontos por real
        System.out.println("Para cada venda que eu faço eu ganho " +pontosAcumulados / vendasAcumuladas); //exemplo

        // Folha de pagamento

        System.out.println(id + ": ganha ->" + salario); //exemplo

        // Férias
        System.out.println("Férias? " + estaDeFerias); //exemplo

        // Apenas para tirar a advertência do meu projeto
        System.out.println("Status: " + status);
    }
}