import javax.persistence.*;
import java.util.Collection;


@Table(name="client")
@Entity

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idClient;

    @OneToMany
    private Collection <CompteAvecInterets> compteAvecInterets;
    private Collection <CompteBancaire> compteBancaires;

    private String numero;
    private String nom;
    private String prenom;
    private String adresse;
    private String nomConseiller;
}
