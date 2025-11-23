import java.util.Scanner;

public class LoopComWhile {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int contador = leitor.nextInt();
        int valor = 1;

        while (valor <= contador){
            System.out.println(valor);
            valor = valor+1;
        }

        leitor.close();

}
}

