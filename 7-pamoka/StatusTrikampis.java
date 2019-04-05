package pamoka.pirma;

public class StatusTrikampis implements IFigura {
    private int krastineA;
    private int krastineB;
    private int izambine;

    public StatusTrikampis(int krastineA, int krastineB, int izambine) {
        this.krastineA = krastineA;
        this.krastineB = krastineB;
        this.izambine = izambine;
    }

    @Override
    public float paskaiciuokIlgi() {
        return (krastineA + krastineB + izambine);
    }

    @Override
    public float paskaiciuokPlota() {
        return krastineA * krastineB / 2;
    }

    @Override
    public void isveskInformacija() {
        System.out.println("Aš esu status trikampis, mano statinių ilgiai: " + krastineA + " ir " + krastineB);
    }
}
