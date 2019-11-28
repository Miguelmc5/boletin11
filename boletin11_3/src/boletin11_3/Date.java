package boletin11_3;

/**
 *
 * @author DANIELCASTELAO\mmartinezcosta
 */
public class Date {
    
    private int dia;
    private int mes;
    private int any;
    
    public Date(int d, int m, int a){
        // Si se intentan asignar valores erróneos, se asigna un valor predeterminado
    // Si no se hiciera nada, quedaría el valor 0, que no es correcto para día y mes
    if  ( anyCorrecte ( a ) )
      any = a ;
    else
      any =  2000 ;
    if  ( mesCorrecte ( m ) )
      mes = m ;
    else
      mes =  1 ;
    if  ( diaCorrecte ( d ) )
      dia = d ;
    else
      dia =  1 ;
  }
 
  public  int getDia ( )  {
    return dia ;
  }
 
  public  int getMes ( )  {
    return mes ;
  }
 
  public  int getAny ( )  {
    return any ;
  }
 
  // Si se intentan asignar valores erróneos no se hace nada
 
  public  void setDia ( int d )  {
    if  ( diaCorrecte ( d ) )
      dia = d ;
  }
 
  public  void setMes ( int m )  {
    if  ( mesCorrecte ( m ) )
      mes = m ;
  }
 
  public  void setAny ( int a )  {
    if  ( anyCorrecte ( a ) )
      any = a ;
  }
 
  // Dice si, dado un día, es correcto de acuerdo al mes de esta fecha
  private  boolean diaCorrecte ( int d )  {
    if  ( d <  1 )  return  false ;
    int [ ] MAXDATA =  { 31 , 28 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31 } ;
    // Año bisiesto?
    if ( any % 400 ==  0  ||  ( any % 100 !=  0  && any % 4 ==  0 ) )  {
      MAXDATA [ 1 ]  =  29 ;
    }
    if  ( d > MAXDATA [ mes -  1 ] )  
        return  false ;
    else
        return  true ;
  }
 
  private  boolean mesCorrecte ( int m )  {
    if  ( ( m >  12 ) || ( m <  1 ) )  
        return  false ;
    else
        return  true ;
  }
 
  private  boolean anyCorrecte ( int a )  {
    if  ( a <  0 )
        return  false ;
    else
        return  true ;
  }

}
