package VendaDeIngresso;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Compra de ingressos");
            System.out.println("[1] - ingresso normal\n[2] - ingresso Vip");
            int escolha = scan.nextInt();
            if (escolha == 1) {
                Ingresso normal = new Normal(250);
                normal.imprimeValor();
            }
            else if (escolha == 2) {
                System.out.println("[1] - camarote superior\n[2] - camarote inferior: ");
                int escolha2 = scan.nextInt();
                if (escolha2 == 1) {
                    Ingresso superior = new CamaroteSuperior(250, 40, 50);
                    superior.imprimeValor();
                    
                }
                else if (escolha2 == 2) {
                    Ingresso inferior = new CamaroteInferior(250, 40);
                    inferior.imprimeValor();
                }
                
            }
        }


    }
    
}
