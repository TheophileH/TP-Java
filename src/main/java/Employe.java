import javax.persistence.*;


@Table(name="employe")
@Entity

public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEmploye;

    @JoinColumn(name = "idAgence")
    private Agence agence;

    private String nom;
    private String prenom;
    private String adresse;
    private float salaire;
    private int   numINSEE;
    private String nomBanque;



    //Methodes de la class


    public Employe(String nom, String prenom, String adresse, float salaire, int numINSEE, String nomBanque) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.salaire = salaire;
        this.numINSEE = numINSEE;
        this.nomBanque = nomBanque;
    }

    public long getIdEmploye() {
        return idEmploye;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public float getSalaire() {
        return salaire;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }

    public int getNumINSEE() {
        return numINSEE;
    }

    public void setNumINSEE(int numINSEE) {
        this.numINSEE = numINSEE;
    }

    public String getNomBanque() {
        return nomBanque;
    }

    public void setNomBanque(String nomBanque) {
        this.nomBanque = nomBanque;
    }
}