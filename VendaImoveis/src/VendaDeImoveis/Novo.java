package VendaDeImoveis;

public class Novo extends Imovel{

    public Novo(String endereco, double preco) {
        super(endereco, preco += 80000);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void imprimeDados() {
        // TODO Auto-generated method stub
        System.out.println("Imovel novo");
        super.imprimeDados();
    }

    
    
    
}
