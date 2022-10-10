
package classes;

import java.util.Scanner;

public class Main {
 
    
  public static void main(String[] args) {
        
        
        Pessoa objetoPessoa = new Pessoa(70.0f, 1.70f);//floatimc
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu peso");
        objetoPessoa.setPeso (leitor.nextFloat());
        System.out.println("Digite a altura da pessoa");
        objetoPessoa.setAltura (leitor.nextFloat());
           // imc = peso / (altura * altura);//
        System.out.println("IMC =" + objetoPessoa.calcularIMC());//imc);

    
     } 
  
  
  
}
