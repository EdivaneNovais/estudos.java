/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.POO;


public class Invoice {///exercicio 4

    //int é o nome do atributo ou string e o nome do atributo
    private int codigoItem;// private porque eu quero que cada objeto cuide de seus dados, podendo só acessalos atraves do metodo acessores get e set
    private String descricao;
    private int quantidade;
    private float precoUnitario;
    // definimos os atributos e seus parametros

    //definir metodo construtor, aperto o alt insert para que o codigo seja gerado, 
    //vai em construtores e escolhe quais eu quero
    public Invoice(int codigoItem, String descricao, int quantidade, float precoUnitario) {
        this.setCodigoItem(codigoItem);
        this.setDescricao(descricao);
        this.setQuantidade(quantidade);//se usa o this pra caso tenha situacoes que tenhamos que usar heranca
        this.setPrecoUnitario(precoUnitario);
    }
    //agora vamos criar um metodo publico que retorna um valor double e o nome dele é getIv...

    public double getInvoiceAmount() {
        return quantidade * precoUnitario;                       //agora faco o calculo total da fatura
    }
    //agora vou gerar os gters e setrs qu vao chamar os atributos, posso fazer tudo
    //na mao ou apertar o alt insert e gerar, metodo acessoreos

public int getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }
//validacao sempre dentro dos metodos acessores nos setrs 
    public void setQuantidade(int quantidade) {
       //faco a validacao dos dados no metedo acessore, que posso mudar depois 
        if (quantidade < 0 ){// a validacao dentro do metodo construtor nao funciona quando quero mudar a qualquer momento o dado
            this.quantidade = 0;// se a quantidade for menos que zero eu zero o valor 
        } else {
            this.quantidade = quantidade;//senao atirbui o valor do parametro pro valor do objeto
        }
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
         if (precoUnitario < 0){
            this.precoUnitario = 0;//
        } else {
            this.precoUnitario = precoUnitario;
        }
        
        
    }
    
    
}
