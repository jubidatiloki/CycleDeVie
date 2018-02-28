package procorp.cycledevie;

/**
 * Created by benja on 28/02/2018.
 */

public class Livre {

    private String titre;
    private String Auteur;
    private int nbrePages;

    public Livre(){}

    public Livre(String titre, String auteur, int nbrePages) {
        this.titre = titre;
        Auteur = auteur;
        this.nbrePages = nbrePages;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return Auteur;
    }

    public int getNbrePages() {
        return nbrePages;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        Auteur = auteur;
    }

    public void setNbrePages(int nbrePages) {
        this.nbrePages = nbrePages;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", Auteur='" + Auteur + '\'' +
                ", nbrePages=" + nbrePages +
                '}';
    }
}
