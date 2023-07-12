package VendaDeImoveis;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Comprar casas");

            System.out.println("[1] - casa nova\n[2] - Casa velha");
            int escolha = scan.nextInt();
            if (escolha == 1) {
                Imovel novo = new Novo("Rua Firmino Rosa - 939", 72000);
                novo.imprimeDados();
            }
            else if (escolha == 2) {
                Imovel velho = new Velho("Joao Alves Martins - 799", 72000);
                velho.imprimeDados();
                
            }
        }



    }
    
}
