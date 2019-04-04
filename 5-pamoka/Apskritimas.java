package pamoka.pirma;

public class Apskritimas {
    public float spindulys;

    public Apskritimas() {
    }

    public Apskritimas(float spindulys) {

        this.spindulys = spindulys;
    }

    public void paskaiciuokIlgi() {
        float ilgis = 2 * 3.14f * spindulys;
        System.out.println("Apskritimo ilgis: " + ilgis);
    }

    public void paskaiciuokPlota() {
        float plotas = 3.14f * spindulys * spindulys;
        System.out.println("Apskritimo plotas: " + plotas);
    }
}
