package pamoka.pirma;

public class Zmogus {

    public String vardas;
    public String pavarde;
    public String telefonas;

    public Zmogus(String v, String p, String t) {
        vardas = v;
        pavarde = p;
        telefonas = t;
    }

    public String grazinkInformacija(){
         return vardas +  " " + pavarde
                + " " + telefonas;
    }
}
