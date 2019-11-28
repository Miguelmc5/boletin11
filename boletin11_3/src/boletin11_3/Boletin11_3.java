package boletin11_3;

/**
 *
 * @author DANIELCASTELAO\mmartinezcosta
 */
public class Boletin11_3 {

    
    public static void main(String[] args) {
        // TODO code application logic here
    
    Date fecha=new Date(1,1,2019);
     System . out . println ("La fecha es:"  + fecha.getDia ( )  +
                                  "/"  + fecha.getMes ( )  +  "/"  + fecha.getAny ( ) ) ;
    // Cambio de mes
    fecha.setMes(2 ) ;
    System . out . println ("La fecha es:"  + fecha.getDia ( )  +
                                  "/"  + fecha.getMes ( )  +  "/"  + fecha.getAny ( ) ) ;
 
    // Erróneo, 2011 no es bisiesto. Nada debe cambiar
    fecha.setDia(29 ) ;
    System . out . println ("La fecha es:"  + fecha.getDia ( )  +
                                  "/"  + fecha.getMes ( )  +  "/"  + fecha.getAny ( ) ) ;
 
    // Cambio de año
    fecha.setAny ( 2012 ) ;
    System . out . println ("La fecha es:"  + fecha.getDia ( )  +
                                  "/"  + fecha.getMes ( )  +  "/"  + fecha.getAny ( ) ) ;
 
    // Erróneo 2012 sí es de traspaso
    fecha.setDia ( 29 ) ;
    System . out . println ("La fecha es:"  + fecha.getDia ( )  +
                                  "/"  + fecha.getMes ( )  +  "/"  + fecha.getAny ( ) ) ;
 
    // Cambio de año erróneo
    fecha.setAny ( - 23 ) ;
    System . out . println ("La fecha es:"  + fecha.getDia ( )  +
                                  "/"  + fecha.getMes ( )  +  "/"  + fecha.getAny ( ) ) ;
 
    // Cambio de mes erróneo
    fecha.setMes(15 ) ;
    System . out . println ("La fecha es:"  + fecha.getDia ( )  +
                                  "/"  + fecha.getMes ( )  +  "/"  + fecha.getAny ( ) ) ;
 
  }
 
}

