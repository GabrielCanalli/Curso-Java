import java.util.Scanner;

public class aula02 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Me diga uma temperatura em fahrenheit: ");
        var tempf = scanner.nextInt();

        final var ajuste = 32;
        final var fator = 5/9.0;
        var C = (tempf - ajuste) * fator;

        System.out.println("A formula de conversão de fahrenheit para celsius é (°F - 32) x 5/9 = °C ");
        System.out.printf("De acordo com a formula os %s fahrenheit são %.2f celsius.\n", tempf, C);

    }
}
