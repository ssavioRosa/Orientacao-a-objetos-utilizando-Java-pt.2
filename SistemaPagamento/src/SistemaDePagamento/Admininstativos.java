package SistemaDePagamento;

public class Admininstativos extends Assistente{

    protected boolean noturno;

    public Admininstativos(String nome, double salario, String numero_de_matricula, boolean noturno) {
        super(nome, salario, numero_de_matricula);
        this.noturno = noturno;
    }

    public boolean isNoturno() {
        return noturno;
    }

    public void setNoturno(boolean noturno) {
        this.noturno = noturno;
    }

    @Override
    public void imprimeDados() {
        // TODO Auto-generated method stub
       
        if (this.noturno == true) {

            super.salario += 1500;
            System.out.println("***Adminstrativos Noturno***");
            super.imprimeDados();
        }

        else{
            System.out.println("***Adminstrativos Diurno***");
            super.imprimeDados();
        }
    }
    

    
    
}