import javax.persistence.*;
import java.util.Collection;


@Table(name="banque")
@Entity

public class Banque {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idBanque;

    @OneToMany
    private Collection <Agence> agence;

    private String numero;
    private float capital;
    private String adresseSiege;
    private int[] numSalaries;
    private String[] villesAgences;
}
