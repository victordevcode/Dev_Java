import org.w3c.dom.CDATASection;

import java.text.DateFormat;
import java.text.spi.DateFormatProvider;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        Scanner idade = new Scanner(System.in);

        System.out.println("Digite o  ano de Nascimento :");
        int anoNasc = idade.nextInt();

        int anosAtual = 2025;

        int vota = anosAtual - anoNasc;

        if(vota <16){
            System.out.println("Você NÃO PODE votar ainda ! Você tem apenas : "+vota);
        } else if(vota>16 & vota<60){
            System.out.println("Voce pode votar! Você tem "+vota +"anos"+". Sua idade é maior que 16 anos" );
        } else{
            System.out.println("Voce não é Obrigado a votar! Você ja tem "+vota+"anos"+". Sua idade é superior a 60 anos");
        }

        idade.close();




    }
}
