package boletin11_2;

/**
 *
 * @author DANIELCASTELAO\mmartinezcosta
 */
public class Media {

    private String nom;
    private String autor;
    private int duradaSegons;

    public Media(String n, String a, int d) {
        nom = n;
        autor = a;
        duradaSegons = d;
    }

    public String getNom() {
        return nom;
    }

    public String getAutor() {
        return autor;
    }

    public int getDurada() {
        return duradaSegons;
    }

    public void setNom(String n) {
        this.nom = n;
    }

    public void setAutor(String a) {
        this.autor = a;
    }

    public void setDurada(int d) {
        this.duradaSegons = d;
    }

}
