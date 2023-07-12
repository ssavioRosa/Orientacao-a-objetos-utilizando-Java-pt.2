package VendaDeIngresso;

public class Vip extends Ingresso{

    protected double valorAdc_reais;

    public Vip(double valor_reais, double valorAdc_reais) {
        super(valor_reais += valorAdc_reais);
        this.valorAdc_reais = valorAdc_reais;
    }

    public double getValorAdc_reais() {
        return valorAdc_reais;
    }

    public void setValorAdc_reais(double valorAdc_reais) {
        this.valorAdc_reais = valorAdc_reais;
    }

    @Override
    public void imprimeValor() {
        // TODO Auto-generated method stub
        System.out.println("***Ingresso vip***");
        super.imprimeValor();
    }

    
    

    
    
}
