package VendaDeIngresso;

public class Ingresso {
    protected double valor_reais;

    public Ingresso(double valor_reais) {
        this.valor_reais = valor_reais;
    }
    
    public void imprimeValor() {
        System.out.println("Valor ingresso: " + this.valor_reais);
        
    }
    
    
}