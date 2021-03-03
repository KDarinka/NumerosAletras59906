/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosaletras59906;
import java.util.Scanner;
/**
 *
 * @author carri
 */
public class NumerosAletras59906 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        int número = 0;
        
        System.out.println("ingrese un número de 0 al 99");
        número = entrada.nextInt();
        
       
        int unidad = (número % 10);
        int decena = ((número /10) % 10);
        String unidad1 = "";
        String decena1 = "";
        
        if ( número <10  && número >= 0){
            switch(número) {
              case 0: 
                  unidad1= "cero";
                  break;
              case 1:
                  unidad1 = "uno";
                  break;
              case 2:
                  unidad1 = "dos";;
                  break;
              case 3:
                  unidad1 = "tres";
                  break;
              case 4:
                  unidad1 = "cuatro";
                  break;
              case 5:
                  unidad1 = "cinco";
                  break;
              case 6:
                  unidad1 = "seis";
                break;
              case 7:
                  unidad1 = "siete";
                  break;
              case 8:
                  unidad1 = "ocho";
                  break;
              case 9:
                  unidad1 = "nueve";
                  break;
            default: 
                throw new AssertionError();
         }      
           System.out.println(""+ unidad); 
        }
        else{
           switch(unidad) {
            case 0: 
                unidad1 = "cero";
                break;
            case 1:
                unidad1 = "uno";
                break;
            case 2:
                unidad1 = "dos";
                break;
            case 3:
                unidad1 = "tres";
                break;
            case 4:
                unidad1 = "cuatro";
                break;
            case 5:
                unidad1 = "cinco";
                break;
            case 6:
                unidad1 = "seis";
                break;
            case 7:
                unidad1 = "siete";
                break;
            case 8:
                unidad1 = "ocho";
                break;
            case 9:
                unidad1 = "nueve";
                break;
            default: 
                throw new AssertionError();
        }
        switch(decena) {
             case 1: 
                 decena1 = "Diez";
                    switch(unidad) {
                      case 0:
                         decena1 = "diez";
                         unidad1 = "";
                        break;
                      case 1:
                         decena1 = "once";
                         unidad1 = "";
                         break;
                      case 2:
                         decena1 = "doce";
                         unidad1 = "";
                         break;
                      case 3: 
                         decena1 = "trece";
                         unidad1 = "";
                        break;
                      case 4: 
                          decena1 = "catorce";
                          unidad1 = "";
                          break;  
                      case 5: 
                          decena1 = "quince";
                          unidad1 = "";
                          break;
                    default:
                          decena1 = "dieci";
                     }
                     break;
              case 2 :
                 decena1 = "veinte";
                 switch(unidad) {
                       case 0: 
                          decena1 = "veinte";
                          unidad1= "";
                          break;
                    default:
                          decena1 = "veinti";
                     }
                     break;
              case 3 :
                  decena1 = "treinta";
                  switch(unidad) {
                       case 0: 
                         decena1 = "treinta";
                         unidad1 = "";
                         break;
                   default:
                      decena1 = "treinta y ";
                     }
                     break;
              case 4 :
                  decena1 = "cuarenta";
                  switch(unidad) {
                       case 0: 
                         decena1 = "cuarenta";
                         unidad1 = "";
                         break;
                   default:
                      decena1 = "Cuarenta y ";
                     }
                     break;
              case 5 :
                  decena1 = "cincuenta";
                  switch(unidad) {
                       case 0: 
                         decena1 = "cincuenta";
                         unidad1 = "";
                         break;
                   default:
                      decena1 = "cincuenta y ";
                     }
                     break;
              case 6 :
                  decena1 = "sesenta";
                  switch(unidad) {
                      case 0: 
                         decena1 = "sesenta";
                         unidad1 = "";
                         break;
                   default:
                       decena1 = "sesenta y ";
                     }
                     break;
              case 7 :
                  decena1 = "setenta";
                  switch(unidad) {
                      case 0: 
                         decena1 = "setenta";
                         unidad1 = "";
                         break;
                   default:
                       decena1 = "setenta y" ;
                     }
                     break;
              case 8 :
                  decena1 = "ochenta";
                  switch(unidad) {
                      case 0: 
                         decena1 = "ochenta";
                         unidad1 = "";
                         break;
                  default:
                       decena1 = "ochenta y ";
                     }
                     break;
              case 9 :
                  decena1 = "noventa";
                  switch(unidad) {
                       case 0: 
                          decena1 = "noventa";
                          unidad1 = "";
                          break;
                   default:
                       decena1 = "noventa y ";
                     }
                     break;
                   default: 
                      throw new AssertionError();
             }
             System.out.println(decena1 + ""+ unidad1);          
                 
        }
        }
}


         
 
