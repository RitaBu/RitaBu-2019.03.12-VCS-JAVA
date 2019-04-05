package pamoka.pirma;

public class Kvadratas implements IFigura {

    private int krastinesIlgis;

    public Kvadratas(int krastinesIlgis) {
        this.krastinesIlgis = krastinesIlgis;
    }

    @Override
    public float paskaiciuokIlgi() {
        return krastinesIlgis * 4;
    }

    @Override
    public float paskaiciuokPlota() {
        return krastinesIlgis * krastinesIlgis;
    }

    @Override
    public void isveskInformacija() {
        System.out.println("Aš esu kvadratas, mano kraštinės ilgis: " + krastinesIlgis);
    }
}
