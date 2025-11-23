import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero : ");
        int valor = leitor.nextInt();

        if (valor>0){
            System.out.println("O "+valor +" é possitivo!");
        } else {
            System.out.println("O " +valor +" o valor é negativo!");
        }

        leitor.close();
    }
}
