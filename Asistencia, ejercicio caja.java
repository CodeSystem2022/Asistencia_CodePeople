//Daniela Armijo
//Ejercicio Ciclos 11 - Clase 7 - 14 de octubre
import javax.swing.JOptionPane;

/*
Ejercicio 11: Diseñar un programa que muestre el producto de los 10 primeros 
números impares.
Hacerlo con JOptionpane
*/
public class Ciclos11 {//Estoy tratando de memorizar los pasos, así es que voy 
                        // a documentar paso a paso
    //Lo primero es llamar al método main
    public static void main(String[] args) {
        //Como vamos a usar JOptionPane, definimos las variables. En principio
        //se necesitan tres: número, producto y un contador, todos de clase entero
        //El int se coloca una sola vez. Se inicializan las variables:
        int numero = 1, producto = 1, contador = 0;
        //Imprimimos una línea que explicará qué hace el código con una ventana
        JOptionPane.showMessageDialog(null, "El siguiente programa calculará el producto de los "
                + "diez primeros números impares ");
        
        //Hacemos un bucle con do-while para que el código repita la operación hasta
        //que el contador llegue a un valor menor a 10.
        do{
            producto *= numero;
            contador +=1;
            numero +=2;
            
            }while(contador <10);
        
//La ventana de mensaje mostrará el resultado de la operación:        
        JOptionPane.showMessageDialog(null, "el producto de los diez primeros números "
                + "impares es: "+producto);
                }
        }

//Beatriz Ramírez
//EjercicioCiclos12 - Clase 7 - 14 de octubre
/*
Ejercicio 12: Pedir un número y calcular su factorial
Hacerlo con las dos clases, Scanner y JOptionPane
 */
package ciclos12;

//import java.util.Scanner;

import javax.swing.JOptionPane;



public class Ciclos12 {
    public static void main(String[] args) {
        //Scanner entrada = new Scanner(System.in);
        long factorial = 1;
        //System.out.println("Digite un número: ");
        int numero = Integer.parseInt("Digite un número: ");
        for(int i=1; i<=numero; i++){
            factorial *= i;
        }
        //System.out.println("\nEl factorial del número ingresado es:"+factorial);
        JOptionPane.showInternalMessageDialog(null, "El factorial del número es: "+factorial);
    }
    
}

//Nicolas Calvo

package caja;
package caja;

import Operaciones.Aritmetica;

public class Caja(
int ancho;
int alto;
int profundo;

public Caja() {

    }

public Caja ( int ancho, int alto, int profundo) {
    this.ancho = ancho;
    this.alto=alto;
    this.profundo= profundo;
)

public int calcularVolumen () {
    return ancho*alto*profundo
}

    public class PruebaCaja {
    public static void main (String arg [])´{

        int medidaAncho=3;
        int medidaAlto=2:
        int medidaProf =6;

        Caja caja1= new Caja();
        caja1.ancho =medidaAncho;
        caja.alto=medidaAlto;
        caja1.profundo=medidaProf;
        int resultado = caja1.calvularVolumen();
        

        System.out.println("resultado volumen de caja 1:"+ resultado)

        Caja caja2= new Caja ( 2,4,6);

        System.out.println("resultado volumen caja 2:"+caja.cacularVolumen());
        
    }
}
   

// Marianela Orozco
// Ejercicio 11: Diseñar un programa que muestre el producto
// de los 10 primeros numeros impares
// Hacerlo con JOptionPane
package ciclos11;

import javax.swing.JOptionPane;

public class Ciclos11 {
    public static void main(String[] args) {
        long producto = 1;
        for(int i = 1; i<=20;i+=2){ 
            producto *= i;
        }
        JOptionPane.showMessageDialog(null, "El producto de los números impares es: "+producto);
    }
}
