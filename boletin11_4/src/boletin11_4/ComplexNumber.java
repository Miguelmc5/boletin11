package boletin11_4;

/**
 *
 * @author DANIELCASTELAO\mmartinezcosta
 */
public class ComplexNumber {

    public static final ComplexNumber CERO = new ComplexNumber(0.0, 0.0);
    private double real;
    private double Imaginary;

    public ComplexNumber(double r, double y) {
        this.real = r;
        this.Imaginary = y;
    }

    public Double getReal() {
        return this.real;
    }

    public Double getImaginary() {
        return this.Imaginary;
    }

    public ComplexNumber add(ComplexNumber c) {
        ComplexNumber resultado = new ComplexNumber(this.real + c.getReal(), this.Imaginary + c.getImaginary());
        return resultado;
    }

    @Override
    public String toString() {
        String resultado = this.real + "";
        if (this.Imaginary >= 0.0) {
            resultado += "+" + this.Imaginary + "y";
        }
        else  {
            resultado += this.Imaginary + "y";
        }
        return resultado;
    }
}
