package pamoka.pirma;

import java.util.ArrayList;

public class Daugiakampis {

    public ArrayList<Taskas> taskai = new ArrayList<>();

    public void spausdinkTaskus() {
        for(Taskas t: taskai) {
            t.spausdinti();
        }
    }
}
