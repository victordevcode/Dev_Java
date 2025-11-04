import java.util.Scanner;

public class CalculadoraIMC {
    public static void main (String[] args) {
        //peso dividido pela Altura * Altura

        Scanner leitorTeclado = new Scanner(System.in);

        System.out.println("Digite seu peso em Kilos : ");
        double peso = leitorTeclado.nextDouble();

        System.out.println("Digite sua altura em cm : ");
        double altura = leitorTeclado.nextDouble();

        double IMC = (peso / (altura*altura));

        System.out.println("O seu IMC é " +IMC + " Kg");

        leitorTeclado.close();
    }
}
