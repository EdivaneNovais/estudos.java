
package EstruturaFor21;

        import java.util.Scanner;
        
public class App {
  
    

    public static void main (String[] args) {
    

String nomeProduto;
    float precoCusto;
    float precoVenda;
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;
        
        Scanner leitor = new Scanner(System.in);

        int i  = 0; // porque eu vou usar ela fora do for, se nao ella poderia ficar dentro do for somnte
        for (; i < 3; i++){//icremento

            System.out.println("digite o nome do produto");
            nomeProduto = leitor.nextLine();
        

            System.out.println("digite o preco de custo");
            precoCusto = leitor.nextFloat();
        
        
            System.out.println("digite o preco de venda");
            precoVenda = leitor.nextFloat(); 

    totalCusto = totalCusto + precoCusto;
    totalVenda = totalVenda + precoVenda;
        
    if(precoCusto == precoVenda){
    System.out.println("Houve um empate");

    } else {  
    if(precoCusto > precoVenda){
    System.out.println("prejuizo");

    } else {
    System.out.println("lucro");
    }
}

      System.out.println(nomeProduto + ",preco de Custo = " + precoCusto + ", preco de venda = " + precoVenda);
        
}

System.out.println("total do media de custo é de:" + (totalCusto / i));
System.out.println("total do media de venda é de:" + (totalVenda / i));        
    }
}
