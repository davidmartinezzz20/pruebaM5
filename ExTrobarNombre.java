
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumneT
 */
public class ExTrobarNombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner lector = new Scanner (System.in);
        
        int nombre, solucio=9;
        
        System.out.println("Introdueix un nombre entre 1 i 20: ");
        nombre = lector.nextInt();
        
        if (nombre>20 || nombre<0) {
            System.out.println("El nombre introduït no està entre 1 i 20.");
        }
        else if (nombre==solucio) {
            System.out.println("Enhorabona, has encertat el nombre secret!");
        }
        else{
            System.out.println("Aquest nombre no es correcte.");
        }
    }
}
// Esto es una modificación realizada por Sergi Maya Ramos.
