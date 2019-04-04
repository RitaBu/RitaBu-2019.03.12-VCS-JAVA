package pamoka.pirma;

public class Staciakampis {

    public int a;
    public int b;

    public Staciakampis(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void paskaiciuokPlota() {

        System.out.println("Plotas: " + a * b);
    }

    public int paskaiciuokPerimetra() {
       return (a + b) * 2;
    }
}
