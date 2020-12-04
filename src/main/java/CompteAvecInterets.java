import javax.persistence.*;


@Table(name="compte_bancaire_interet")
@Entity

public class CompteAvecInterets extends CompteBancaire {

    private float taux;

    public CompteAvecInterets(String numero, float solde, float dateOverture, String nomClient, String prenomClient, String numeroAgence, String numeroBanque) {
        super(numero, solde, dateOverture, nomClient, prenomClient, numeroAgence, numeroBanque);
    }
}
