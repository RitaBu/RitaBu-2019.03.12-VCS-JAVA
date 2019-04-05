package pamoka.pirma;

import java.util.Scanner;

public class ViktorinosKlausimas {

    private Scanner in = new Scanner(System.in);

    private String klausimas;
    private String[] galimiAtsakymai;
    private int teisingasAtsakymas;

    public ViktorinosKlausimas(String klausimas, String[] galimiAtsakymai, int teisingasAtsakymas) {
        this.klausimas = klausimas;
        this.galimiAtsakymai = galimiAtsakymai;
        this.teisingasAtsakymas = teisingasAtsakymas;
    }

    public void atspausdinkKlausima() {

        System.out.println(this.klausimas);

        for (int i = 0; i < galimiAtsakymai.length; i++) {
            System.out.println((i + 1) + ". " + galimiAtsakymai[i]);
        }
    }

    public boolean nuskaitykIrPatikrink() {
        int atsakymas = Integer.parseInt(in.nextLine());

        boolean arTeisingas = atsakymas - 1 == teisingasAtsakymas;

        if(arTeisingas) {
            System.out.println("Teisingas atsakymas!");
        }
        else {
            System.out.println("Neteisingas atsakymas!");
        }
        return arTeisingas;
    }
}
