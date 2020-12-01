import javax.persistence.*;


@Table(name="compte_bancaire_interet")
@Entity

public class CompteAvecInterets extends CompteBancaire {

    private float taux;
}
