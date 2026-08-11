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