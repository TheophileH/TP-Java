import javax.persistence.*;
import java.util.Collection;


@Table(name="employe")
@Entity

public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEmploye;

    private String nom;
    private String prenom;
    private String adresse;
    private float salaire;
    private int   numINSEE;
    private String nomBanque;

}