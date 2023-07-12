package SistemaDePagamento;

public class Assistente extends Funcionario {

    protected String numero_de_matricula;

    public Assistente(String nome, double salario, String numero_de_matricula) {
        super(nome, salario);
        this.numero_de_matricula = numero_de_matricula;
    }

    public String getNumero_de_matricula() {
        return numero_de_matricula;
    }

    public void setNumero_de_matricula(String numero_de_matricula) {
        this.numero_de_matricula = numero_de_matricula;
    }

    @Override
    public void imprimeDados() {
        // TODO Auto-generated method stub
        
        super.imprimeDados();
        
    }

    
    

    

    
    
}
