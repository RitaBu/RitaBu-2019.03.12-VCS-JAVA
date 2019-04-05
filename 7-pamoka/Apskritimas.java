package pamoka.pirma;

public class Apskritimas implements IFigura {
    public float spindulys;

    public Apskritimas() {
    }

    public Apskritimas(float spindulys) {
        this.spindulys = spindulys;
    }

    public float paskaiciuokIlgi() {
        return 2 * 3.14f * spindulys;
    }

    public float paskaiciuokPlota() {
        return 3.14f * spindulys * spindulys;
    }

    @Override
    public void isveskInformacija() {
        System.out.println("Aš esu apskritimas, mano spindulio ilgis: " + spindulys);
    }
}
