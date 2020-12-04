import javax.persistence.*;

@Table(name="compte_bancaire")
@Entity


public class CompteBancaire {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idCompteBancaire;

    @JoinColumn(name = "idClient")
    private Client c;

    private String numero;
    private float solde;
    private float dateOverture;
    private String nomClient;
    private String prenomClient;
    private String numeroAgence;
    private String numeroBanque;

    
    
    
    //Methodes de la class



    public long getIdCompteBancaire() {
        return idCompteBancaire;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public float getDateOverture() {
        return dateOverture;
    }

    public void setDateOverture(float dateOverture) {
        this.dateOverture = dateOverture;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getPrenomClient() {
        return prenomClient;
    }

    public void setPrenomClient(String prenomClient) {
        this.prenomClient = prenomClient;
    }

    public String getNumeroAgence() {
        return numeroAgence;
    }

    public void setNumeroAgence(String numeroAgence) {
        this.numeroAgence = numeroAgence;
    }

    public String getNumeroBanque() {
        return numeroBanque;
    }

    public void setNumeroBanque(String numeroBanque) {
        this.numeroBanque = numeroBanque;
    }

    public CompteBancaire(String numero, float solde, float dateOverture, String nomClient, String prenomClient, String numeroAgence, String numeroBanque) {
        this.numero = numero;
        this.solde = solde;
        this.dateOverture = dateOverture;
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        this.numeroAgence = numeroAgence;
        this.numeroBanque = numeroBanque;
    }
}