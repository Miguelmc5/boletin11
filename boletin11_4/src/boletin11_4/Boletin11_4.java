package boletin11_4;

/**
 *
 * @author DANIELCASTELAO\mmartinezcosta
 */
public class Boletin11_4 {

    public static void main(String[] args) {
        // TODO code application logic here

        ComplexNumber c1 = new ComplexNumber(1.0, 2.0);
        ComplexNumber c2 = new ComplexNumber(2.0, -3.0);

        ComplexNumber cero = ComplexNumber.CERO;

        System.out.println("Hemos creado el Número Complejo C1:");
        System.out.println(" \t Parte real =" +c1.getReal());
        System.out.println(" \t Parte imaginaria =" + c1.getImaginary());

        System.out.println(" \n Hemos creado el Número Complejo C2:");
        System.out.println(" \t Parte real =" + c2.getReal());
        System.out.println(" \t Parte imaginaria =" + c2.getImaginary());

        System.out.println(" \n Operación de suma (C1 + CERO):");
        
        ComplexNumber nada = c1.add(ComplexNumber.CERO);
        
        System.out.println(" \t Parte real =" + nada.getReal());
        System.out.println(" \t Parte imaginaria =" + nada.getImaginary());

        System.out.println(" \n Operación de suma (C1 + C2):");
        nada = c1.add(c2);
        System.out.println(" \t Parte real =" + nada.getReal());
        System.out.println(" \t Parte imaginaria =" + nada.getImaginary());

        System.out.println(" \n Última suma llevada a cabo:");
        System.out.print("(" + c1 + ") + (" + c2 + ") = (" + nada + ")");
    }
}
