/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2.laboratorio.prc4;

import java.util.Scanner;

/**
 *
 * @author meev9
 */
public class Ejercicio2LaboratorioPRC4 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        // Programa del ejercicio 2
        
        
        //Declaramos las variable
        
        String EMPLEADO ="";
        
        float AFP = 0.03F;
        
       float ISSS = 0.02F;
                
       float RENTA = 0.05F;
       
       float SALARIO = 0;
       
  
       
       float SALARIOCONDESCUENTO;
        
         Scanner reader = new Scanner(System.in);
        
        
        System.out.println("Digite el nombre del empleado");
        
        //En esta parte hacemos la captura del empleado
        EMPLEADO = reader.nextLine();
        
        
        //Hacemos la condicion que si el salario es mayor a  50  y mayor que  0 ya que no puede tener numeros negativos 
        
        System.out.println("Digite el salario del empleado");
        
        SALARIO = reader.nextFloat();
        
        
        if(SALARIO>500)
        {
         //Hacemos los descuentos   
            
          SALARIOCONDESCUENTO = SALARIO-( (SALARIO*AFP)+(SALARIO*ISSS)+(SALARIO*RENTA));
          
          //imprimimos los resultados
          
            System.out.println("El nombre del empleado "+EMPLEADO+" con el sueldo $"+SALARIO+" se aplico correctamente los descuentos con un monto total de " +SALARIOCONDESCUENTO);
            System.out.println("--------");
            
        System.out.print(" AFP es: $"+SALARIO*AFP); 
        System.out.print(" ISSS es: $" +SALARIO*ISSS);
        System.out.print(" RENTA es: $" + SALARIO*RENTA);
            
            
        }
        
        else
        {
            //No se peude ingresar el salario
                  System.out.println("Error, el salario no puede ser menor que 0 ni menor que  $500");
        }
         
        
        
         
         
    }
    
}
