package boletin11_2;

/**
 *
 * @author DANIELCASTELAO\mmartinezcosta
 */
public class Boletin11_2 {

    
    public static void main(String[] args) {
        // TODO code application logic here
    
    Media objeto=new Media("Pepe","Juan", 200);
    String n=objeto.getNom();
    String a=objeto.getAutor();
    int d=objeto.getDurada();
        System.out.println(n+ "\n" +a+ "\n" +d);
    
        System.out.println("Ejecutando setters ...");
    objeto.setNom("Jose");
    objeto.setAutor("Manuel");
    objeto.setDurada(400);
        System.out.println("hecho");
    
    n=objeto.getNom();
    a=objeto.getAutor();
    d=objeto.getDurada();
        System.out.println("Ahora los valores son: \n"+n+ "\n" +a+ "\n" +d );
    }
    
}
