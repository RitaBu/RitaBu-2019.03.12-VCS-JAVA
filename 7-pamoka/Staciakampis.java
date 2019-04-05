package pamoka.pirma;

public class Staciakampis implements IFigura {

    private int krastineA;
    private int krastineB;

    public Staciakampis(int krastineA, int krastineB) {
        this.krastineA = krastineA;
        this.krastineB = krastineB;
    }

    @Override
    public float paskaiciuokIlgi() {
        return (krastineA + krastineB) * 2;
    }

    @Override
    public float paskaiciuokPlota() {
        return krastineA * krastineB;
    }

    @Override
    public void isveskInformacija() {
        System.out.println("Aš esu staciakampis, mano kraštinių ilgiai: " + krastineA + " ir " + krastineB);
    }
}
