import javax.persistence.*;
import java.util.Collection;


@Table(name="agence")
@Entity

public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idAgence;

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
}
