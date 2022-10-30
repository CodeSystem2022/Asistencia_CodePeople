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
   //Daniela Armijo
    package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 1;
        aritmetica1.sumarNumeros();
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("resultado usando argumentos = "+resultado);
    }
    
}
//Beatriz Ramírez
package Operaciones;

public class Aritmetica {
        //Atributos de la clase
        int a;
        int b;
        
        //Metodo
        public void sumarNumeros(){
            int resultado = a + b;
            System.out.println("resultado = " + resultado);
        }
        
        public int sumarConRetorno(){
            //int resultado = a + b;
            return this.a + this.b;
        }
        
        public int sumarConArgumentos(int a, int b){
            this.a = a; //El argumento a se asigna el atributo this.a
            this.b = b; //El argumento b se asigna el atributo this.b
            //return a + b;  
            return this.sumarConRetorno();
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