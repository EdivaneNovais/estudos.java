/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package exercicio.POO;

public class App {
   
  
    

    public static void main(String[] args) {
        
        
        //VAMOS CRIAR UMA VARIAVEL DO TIPO INVOICE E VE SE ESTA OK
        Invoice inv = new Invoice (1, "mousepd", 10, 50.0f);
        //tenho que passar quatro valores, o codigo1, descricao, quantidade, e o valor unitario 50.0
        //posso pedir pra imprimir o valor 
        System.out.println("valor total =" + inv.getInvoiceAmount());
     
    }
}