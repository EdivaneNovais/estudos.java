/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package exercioCarros;

import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        
       int anoFabricacao = 0;
       float valorVeiculo = 0.0f;
       float valorDesconto = 0.0f;
       float porcentagemDesconto = 0.00f;
       float ValorPagar = 0.0f;
       
       int totalCarrosSemiNovos = 0;
       int totalCarros = 0;
       
       Scanner leitor = new Scanner(System.in);
       
       char desejaRepetir = 's'; //porque vai ler um s ou n ua só letra
       
       while (desejaRepetir == 's' || desejaRepetir == 'S'){//condicao de para {// variavel enquanto, para repetir n vezes
     //operador logico OU com os doia PIPES      
            System.out.println("Digite a data da fabricação");
            anoFabricacao = leitor.nextInt();

            System.out.println("diite o valor do veiculo");
            valorVeiculo = leitor.nextFloat();

            
            if(anoFabricacao <= 2000){
                porcentagemDesconto =0.12f;
                 
            }else {
                porcentagemDesconto = 0.07f;
                totalCarrosSemiNovos++;// quando for falso, ouseja o ano maior que dois mil ai incrementa
            }
            totalCarros++;// incrementa 
            
            valorDesconto = valorVeiculo * porcentagemDesconto;
            System.out.println("deseja fazer mais cadastro? S -sim / N - Nao");
            
            desejaRepetir = leitor.next().charAt(0);// vai pegar apenas o primeiro caracter que foi digitado
            // no fim da repeticao esta a leitura do while
       }  //final do while com fechamento da chave
      
    System.out.println("total de carros seminovos:" + totalCarrosSemiNovos);
    System.out.println("total de carros:" + totalCarros);
    }
}
