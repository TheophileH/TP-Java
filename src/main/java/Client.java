import javax.persistence.*;
import java.util.Collection;

@Table(name="client")
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long  idClient;

    @JoinColumn(name = "idAgence")
    private Agence agence;

    @OneToMany
    private Collection <CompteAvecInterets> compteAvecInterets;
    private Collection <CompteBancaire> compteBancaires;
    private String numero;
    private String nom;
    private String prenom;
    private String adresse;
    private String nomConseiller;




    //Methodes de la class
    public long getIdClient() {
        return idClient;
    }

    public void setIdClient(long idClient) {
        this.idClient = idClient;
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

    public String getNomConseiller() {
        return nomConseiller;
    }

    public void setNomConseiller(String nomConseiller) {
        this.nomConseiller = nomConseiller;
    }


    public Client(String numero, String nom, String prenom, String adresse, String nomConseiller) {
        this.numero = numero;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.nomConseiller = nomConseiller;
    }
}
