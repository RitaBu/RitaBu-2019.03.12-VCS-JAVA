package pamoka.pirma;

public class Main {

    public static void main(String[] args) {
        pasisveikink();
        pasisveikink("Labas, kitoks pasisveikinimas!");

        patikrinkSkaiciu(3);
        patikrinkSkaiciu(-2);
        patikrinkSkaiciu(0);

        int kvadratas = pakelkKvadartu(2);
        System.out.println(kvadratas);

        int suma = suma(10, 2);
        System.out.println(suma);

        int[] m1 = {1, 9, 0, 12, -1, -2};
        int[] m2 = {100, 1000, 0, 12};

        atspausdinkMasyva(m1);
        atspausdinkMasyva(m2);

        int max1 = max(m1);
        System.out.println(max1);

        int max2 = max(m2);
        System.out.println(max2);

        nustatykZmogausBukle(1.79f, 68);

        //iš ManoMetodai.java
        ManoMetodai.pasisveikink("Jonas");

        ManoMetodai.suma(m1);
        ManoMetodai.suma(m2);

        int[] m3 = ManoMetodai.sukurkMasyva(10);

        int skaiciuSuma1 = ManoMetodai.suma(m1);
        System.out.println(skaiciuSuma1);

        int skaiciuSuma2 = ManoMetodai.suma(m2);
        System.out.println(skaiciuSuma2);

        int[] m4 = ManoMetodai.nunulinkElementa(m2, 1);
    }

    //1. Parašykite metodą pasisveikink, kuris nepriima jokių parametrų, nieko negrąžina, tiesiog išveda į Console pasisveikinimą.
    public static void pasisveikink() {
        System.out.println("Labas, as krabas!");
    }

    //2. Patobulinkite metodą pasisveikink, kuris priimtų pasisveikinimo tekstą ir jį išvestų.
    public static void pasisveikink(String pasisveikinimoTekstas) {
        System.out.println(pasisveikinimoTekstas);
    }

    //3. Parašykite metodą patikrinkSkaiciu, kuris priima skaičių ir išveda į Console, ar jis teigiamas, ar neigiamas, ar nulinis.
    public static void patikrinkSkaiciu(int sk) {
        if (sk > 0) {
            System.out.println("Teigiamas");
        } else if (sk < 0) {
            System.out.println("Neigiamas");
        } else {
            System.out.println("Lygus nuliui");
        }
    }

    //4. Parašykite metodą pakelkKvadartu, kuris priimtų skaičių ir grąžintų jo kvadratą.
    public static int pakelkKvadartu(int sk) {
        return sk * sk;
    }

    //5. Parašykite metodą suma, kuris priima du skaičius ir grąžina jų sumą.
    public static int suma(int sk1, int sk2) {
        return sk1 + sk2;
    }

    //6. Parašykite metodą, kuris atspausdina gautą skaičių masyvą į vieną eilutę su tarpais.
    public static void atspausdinkMasyva(int[] masyvas) {
        for (int skaicius : masyvas) {
            System.out.print(skaicius + " ");
        }
        System.out.println();
    }

    //7. Parašykite metodą max, kuris priima skaičių masyvą ir grąžiną didžiausią skaičių. (reikės naudoti for ciklą ir sąlygas)
    public static int max(int[] masyvas) {
        int max = Integer.MIN_VALUE;

        for (int skaicius : masyvas) {
            if (skaicius > max) {
                max = skaicius;
            }
        }

        return max;
    }

    //8. Parašyti metodą, kuris suskaičiuoja žmogaus kūno masės indeksą ir grąžina. Priima du parametrus - svorį ir ūgį. Formulė: svoris kg / (ūgis metrais) ^ 2).
    public static float kmi(float ugisM, float svorisKg) {
        return svorisKg / (ugisM * ugisM);
    }

    //9. Papildyti 6-o pratimo programą parašant metodą, kuris pagal gautą KMI nustato žmogaus fizinę būseną (Šis metodas savyje turi iškviesti KMI skaičiuojantį metodą)
    public static void nustatykZmogausBukle(float ugisM, float svorisKg) {
        float kmi = kmi(ugisM, svorisKg);

        if(kmi <= 15) {
            System.out.println("Badaujantis žmogus");
        } else if(kmi <= 18.5) {
            System.out.println("Liesas žmogus");
        } else if(kmi <= 25){
            System.out.println("Normalus žmogus");
        } else if(kmi <= 30) {
            System.out.println("Turintis viršsvorio žmogus");
        } else if(kmi <= 40) {
            System.out.println("Nutukęs žmogus");
        } else {
            System.out.println("Ligotai nutukęs žmogus");
        }
    }
}
