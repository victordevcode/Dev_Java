import java.util.Scanner;

public class CalculaMedia {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a nota 1:");
        int nota1 =teclado.nextInt();

        System.out.println("Digite a nota 2:");
        int nota2 =teclado.nextInt();

        System.out.println("Digite a nota 3:");
        int nota3 =teclado.nextInt();

        double media = (nota1+nota2+nota3) / 3;

        System.out.println("A media da Auluna é: "+media);

teclado.close();
    }

}
