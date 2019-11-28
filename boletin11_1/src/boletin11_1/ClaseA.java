package boletin11_1;

public class ClaseA {

        private int valorPrimario;
        private int valorSecundario;

    public ClaseA(){
    valorPrimario =5;
    valorSecundario =10;
}
    public ClaseA(int vp){
        valorPrimario=vp;
        valorSecundario=10;
    }
    public ClaseA(int vp, int vs){
        valorPrimario=vp;
        valorSecundario=vs;
    }

    public int getValorPrimario() {
        return valorPrimario;
    }

    public void setValorPrimario(int valorPrimario) {
        this.valorPrimario = valorPrimario;
    }

    public int getValorSecundario() {
        return valorSecundario;
    }

    public void setValorSecundario(int valorSecundario) {
        this.valorSecundario = valorSecundario;
    }
}