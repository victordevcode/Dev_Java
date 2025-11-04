import java.util.Scanner;

public class Exercio1 {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o 1° valor:");
        int valor1 = leitor.nextInt();

        System.out.println("Digite a nota 2:");
        int valor2 = leitor.nextInt();

        int soma = valor1 + valor2;

        System.out.println("A Soma dos valores é : "+soma);

        leitor.close();
    }
}
