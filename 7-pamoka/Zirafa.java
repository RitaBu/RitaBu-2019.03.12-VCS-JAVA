package pamoka.pirma;

public class Zirafa implements IKalbantis, ISpausdinantisInformacija {

    public float kakloIlgis;

    @Override
    public void kalbek() {
        System.out.println("mu mu mu");
    }

    @Override
    public void spausdinkInformacija() {
        System.out.println("As esu zirafa. Mano kaklo ilgis: " + kakloIlgis);
    }
}
