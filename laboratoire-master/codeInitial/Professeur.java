package codeInitial;

public class Professeur {

    private static Professeur professeur;
    private String cip;
    private String nom;

    private Professeur(String cip, String nom) {
        this.cip = cip;
        this.nom = nom;
    }

    public static Professeur getProfesseur(String cip, String nom) {
        if (professeur == null) {
            professeur = new Professeur(cip, nom);
        }
        return professeur;
    }

    @Override
    public String toString() {
        return "Professeur{" +
                "hash code=" + this.hashCode() + " \n"+
                "cip='" + cip + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }
}
