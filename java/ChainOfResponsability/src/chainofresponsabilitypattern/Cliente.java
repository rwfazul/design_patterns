package chainofresponsabilitypattern;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rhau
 */
public class Cliente {
    
    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();
        
        do {
            machine.exibeMenu();
            leMoedaUser(machine);
        } while ( rodarNovamente() );
        
        System.out.println("< Bye!");
    }

    private static void leMoedaUser(CoffeeMachine machine) {
        Scanner in = new Scanner(System.in);
        do {
            try {
                System.out.print("> Moeda a ser inserida (0.01, 0.05, 0.10, 0.25, 0.50, 1.0): ");
                Double valor = in.nextDouble();
                machine.adicionaMoeda(MoedasEnum.getMoeda(valor));
            } catch (InputMismatchException ex) {
                System.out.println("*** Valor inválido (deve ser um valor de moeda válido) ***");
                in.nextLine();
            } catch (Exception ex) {
                System.out.println( ex.getMessage() );
            }
        } while ( machine.getCafeSelecionado() != null ); // enquanto o café não for dispensado
    }

    private static Boolean rodarNovamente() {
        Scanner in = new Scanner(System.in);
        System.out.print("\n> Executar novamente ('s' ou 'S')? ");
        String resposta = in.next();
        System.out.print("\n");
        return resposta.toLowerCase().startsWith("s");
    }
    
}