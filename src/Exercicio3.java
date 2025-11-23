import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor1 = valor.nextInt();

        System.out.println("Digite um valor: ");
        int valor2 = valor.nextInt();

        System.out.println("Digite um valor: ");
        int valor3 = valor.nextInt();

        double resultado = (valor1+valor2+valor3)/3;

        System.out.println("A media dos valores :" +valor1 +" ,"+valor2 +" e "+ valor3 +" é :" +resultado);

        valor.close();

    }
}
