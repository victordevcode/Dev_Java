import java.util.Scanner;

public class Exercio2 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor : ");
        double valor = ler.nextDouble();

        double resultado = valor * valor;

        System.out.println("O quadrado de "+valor +" é : "+resultado);

        ler.close();


    }
}
