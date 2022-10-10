
package classes;


public class Pessoa {
    
    //atributos privados 
    private float peso;
    private float altura;
    
    public Pessoa(float peso, float altura){
       this.peso = peso;
       this.altura = altura;// System.out.println("executando método construtor");
        
    }
    
    public float calcularIMC(){
        float imc = peso / (altura * altura);
        return imc;
    }
    
    //metodos acessores
    public void setPeso (float peso){
        this.peso=peso;
    }
    
    public float getPeso(){
        return peso;
    }
    
    public void setAltura (float altura){
        this.altura = altura;
    }
    
    public float getAltura(){
        return altura;
    }
    
}
