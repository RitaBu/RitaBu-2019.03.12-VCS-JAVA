package pamoka.trecia; //nepamirškit pakeist į savo package'o pavadinimą

public class ManoMetodai {

    //10. Aprašykite metodą, kuris nieko negrąžina, tiesiog priima string parametrą - vardą ir išveda tokią žinutę - “Labas, [vardas]”
    public static void pasisveikink(String vardas) {
        System.out.println("Labas, " + vardas);
    }

    //11. Aprašykite metodą, kuris kaip parametrą priima skaičių masyvą, naudodamas foreach ciklą visus skaičius iš masyvo susumuoja ir grąžina sumą.
    public static int suma(int[] skaiciai) {
        int suma = 0;

        for(int sk: skaiciai){
            suma += sk;
        }

        return suma;
    }

    //12. Aprašykite metodą, kuris priima skaičių int kaip parametrą - masyvo dydį ir grąžiną sukurtą tokio dydžio masyvą.
    public static int[] sukurkMasyva(int masyvoDydis) {
        return new int[masyvoDydis];
    }

    //13. Aprašykite metodą, kuris priima skaičių int - indeksą bei masyvą int[] kaip parametrus ir grąžina masyvą su nunulintu skaičiumi tuo indeksu.
    public static int[] nunulinkElementa(int[] m, int i) {
        if(i < m.length)
            m[i] = 0;
        return m;
    }
}
