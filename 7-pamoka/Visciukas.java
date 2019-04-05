package pamoka.pirma;

public class Visciukas implements IKalbantis, ISpausdinantisInformacija {

    public float svoris;

    @Override
    public void kalbek() {
        System.out.println("Cyp cyp cyp");
    }

    @Override
    public void spausdinkInformacija() {
        System.out.println("As esu visciukas. Mano svoris: " + svoris);
    }
}
