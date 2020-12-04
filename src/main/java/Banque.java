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

    //Methodes de la class


    public Banque(String numero, float capital, String adresseSiege, int[] numSalaries, String[] villesAgences) {
        this.numero = numero;
        this.capital = capital;
        this.adresseSiege = adresseSiege;
        this.numSalaries = numSalaries;
        this.villesAgences = villesAgences;
    }

    public long getIdBanque() {
        return idBanque;
    }


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public float getCapital() {
        return capital;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public String getAdresseSiege() {
        return adresseSiege;
    }

    public void setAdresseSiege(String adresseSiege) {
        this.adresseSiege = adresseSiege;
    }

    public int[] getNumSalaries() {
        return numSalaries;
    }

    public void setNumSalaries(int[] numSalaries) {
        this.numSalaries = numSalaries;
    }

    public String[] getVillesAgences() {
        return villesAgences;
    }

    public void setVillesAgences(String[] villesAgences) {
        this.villesAgences = villesAgences;
    }
}
