package SistemaDePagamento;

public class Tecnico extends Assistente {

    protected double bonus_salarial;

    public Tecnico(String nome, double salario, String numero_de_matricula, double bonus_salarial) {
        super(nome, salario += bonus_salarial, numero_de_matricula);
        this.bonus_salarial = bonus_salarial;
    }

    public double getBonus_salarial() {
        return bonus_salarial;
    }

    public void setBonus_salarial(double bonus_salarial) {
        this.bonus_salarial = bonus_salarial;
    }

    @Override
    public void imprimeDados() {
        // TODO Auto-generated method stub

        System.out.println("***Tecnico***");
        super.imprimeDados();
        
    }

    

    

    

    
}
