import javax.persistence.*;
import java.util.Collection;


@Table(name="compte_bancaire")
@Entity

public class CompteBancaire {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idCompteBancaire;

    private String numero;
    private float solde;
    private float dateOverture;
    private String nomClient;
    private String prenomClient;
    private String numeroAgence;
    private String numeroBanque;
}