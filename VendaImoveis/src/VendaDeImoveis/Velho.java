package VendaDeImoveis;

public class Velho extends Imovel{

    public Velho(String endereco, double preco) {
        super(endereco, preco -= 15000);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void imprimeDados() {
        // TODO Auto-generated method stub
        System.out.println("Imovel Velho");
        super.imprimeDados();
    }

    


    
}
