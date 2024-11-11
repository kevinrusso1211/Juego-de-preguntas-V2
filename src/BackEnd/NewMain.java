/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BackEnd;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Kevin Russo Emiliany
 */
public class NewMain {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int menu = 1, cont = 1;
        String pregunta, a, b, c, oc, om;
        En_consola ec = new En_consola();
        Pregunta pre;
        int pb = 0;
        
        while(menu!=0){
            
            try{
                System.out.println("""

                                   1- Agregar
                                   2- Responder
                                   0- Salir

                                """);
                menu = leer.nextInt();

                switch(menu){
                    case 1:
                        while(cont != 0){
                            System.out.print("Pregunta: ");
                            pregunta = leer.nextLine();
                            pregunta = leer.nextLine();
                            System.out.print("opcion A: ");
                            a = leer.nextLine();
                            System.out.print("opcion B: ");
                            b = leer.nextLine();
                            System.out.print("opcion C: ");
                            c = leer.nextLine();
                            System.out.print("opcion correcta: ");
                            oc = leer.nextLine();
                            oc.toLowerCase();
                            
                            pre = new Pregunta(pregunta, a, b, c, oc);
                            ec.agregar(pre);

                            System.out.println("""

                                               1- otra
                                               0- salir

                                               """);
                            cont = leer.nextInt();
                        }
                        break;

                    case 2:
                        for(int i = 0; i < ec.bd.size(); i ++){

                            System.out.println(ec.bd.get(i).pregunta);
                            System.out.println("A) "+ec.bd.get(i).opA);
                            System.out.println("B) "+ec.bd.get(i).opB);
                            System.out.println("C) "+ec.bd.get(i).opC);
                            System.out.print("Tu opcion: ");
                            om = leer.next();
                            om.toLowerCase();
                            System.out.println("\n");

                            if(om.equals(ec.bd.get(i).opCorrecta)){
                                pb ++;
                            }
                        }
                        menu =0;
                        break;

                    default:
                        System.out.println("Opcion mala");
                }

                System.out.println("Su calificacion: "+ec.obtener_calificacion(pb));
        
            }catch (InputMismatchException e) {
                System.out.println("Caracter no valido");
                leer.nextLine();
            }
        }
    }
}
