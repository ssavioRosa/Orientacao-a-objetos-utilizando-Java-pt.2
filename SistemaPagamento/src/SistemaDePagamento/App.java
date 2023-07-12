package SistemaDePagamento;

public class App {
    public static void main(String[] args) {
        


        

        Funcionario tecnico = new Tecnico("Giovane Souza",4500 , "785693", 500);

        tecnico.imprimeDados();

        Funcionario assistenteAdmdiurno = new Admininstativos("Pedro Raul", 7900, "256398", false);

        assistenteAdmdiurno.imprimeDados();

        Funcionario assisnteAdmNoturno = new Admininstativos("Andrey Santos", 7900, "789546", true);

        assisnteAdmNoturno.imprimeDados();



    }
    
}
