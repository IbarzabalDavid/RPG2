package personnage;

public abstract class Personnage {
    private int ptsVie;
    private int ptsDef;
    private String nom;



    //getters
    public int getPtsDef() { return ptsDef; }

    public int getPtsVie() { return ptsVie; }

    public String getNom() { return nom; }

    //setters
    public void setPtsDef(int ptsDef) { this.ptsDef = ptsDef; }

    public void setPtsVie(int ptsVie) { this.ptsVie = ptsVie; }

    public void setNom(String nom) { this.nom = nom; }

    public abstract void attaquer(Personnage personnage);

    public abstract int getDegat();
}
