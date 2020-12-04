import javax.persistence.*;
import java.util.Collection;


@Table(name="agence")
@Entity

public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idAgence;

    @JoinColumn(name = "idBanque")
    private Banque banque;

    @OneToMany
    private Collection <Employe> employe;
    private Collection <Client> client;


    private String numero;
    private String nom;
    private String adresse;
    private String ville;
    private String codePostal;
    private String nomDirecteur;
    private String nomBanque;

    //Methodes de la class


    public Agence(long idAgence, String numero, String nom, String adresse, String ville, String codePostal, String nomDirecteur, String nomBanque) {
        this.idAgence = idAgence;
        this.numero = numero;
        this.nom = nom;
        this.adresse = adresse;
        this.ville = ville;
        this.codePostal = codePostal;
        this.nomDirecteur = nomDirecteur;
        this.nomBanque = nomBanque;
    }

    public long getIdAgence() {
        return idAgence;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getNomDirecteur() {
        return nomDirecteur;
    }

    public void setNomDirecteur(String nomDirecteur) {
        this.nomDirecteur = nomDirecteur;
    }

    public String getNomBanque() {
        return nomBanque;
    }

    public void setNomBanque(String nomBanque) {
        this.nomBanque = nomBanque;
    }
}
