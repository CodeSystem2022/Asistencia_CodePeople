package caja;
package caja;

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
