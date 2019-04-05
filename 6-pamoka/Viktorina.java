package pamoka.pirma;

import java.util.ArrayList;

public class Viktorina {

    private ArrayList<ViktorinosKlausimas> klausimai;
    private int taskai;

    public Viktorina(ArrayList<ViktorinosKlausimas> klausimai) {
        this.klausimai = klausimai;
        this.taskai = 0;
    }

    public void pradetiZaidima() {
        for(ViktorinosKlausimas kl : klausimai) {

            kl.atspausdinkKlausima();

            var arTeisingas = kl.nuskaitykIrPatikrink();
            if(arTeisingas)
                taskai++;
        }
    }

    public void parodykRezultata(){
        System.out.println("Surinkote taškų: " + this.taskai);
    }
}
