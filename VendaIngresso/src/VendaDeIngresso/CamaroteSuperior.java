package VendaDeIngresso;

public class CamaroteSuperior extends Vip{

    protected double valorAdc_reaisVip;

    public CamaroteSuperior(double valor_reais, double valorAdc_reais, double valorAdc_reaisVip) {
        super(valor_reais += (valorAdc_reaisVip + valorAdc_reais), valorAdc_reais);
        this.valorAdc_reaisVip = valorAdc_reaisVip;
    }

    public double getValorAdc_reaisVip() {
        return valorAdc_reaisVip;
    }

    public void setValorAdc_reaisVip(double valorAdc_reaisVip) {
        this.valorAdc_reaisVip = valorAdc_reaisVip;
    }

    @Override
    public void imprimeValor() {
        // TODO Auto-generated method stub
        System.out.println("***Camarote Superior***\n");
        super.imprimeValor();
    }

    
    
}
