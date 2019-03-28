1. Parašyti programą, kuri atspausdina ekrane jūsų vardą, pavardę ir amžių iš naujų eilučių.

```java
System.out.println("Jonas");
System.out.println("Jonaitis");
System.out.println("29");
```

2. Parašyti programą, kuri nuskaito įvestą tekstą ir atspausdina jį ekrane. 

```java
Scanner in = new Scanner(System.in);
System.out.println("Koks jusu vardas?");
String vardas = in.nextLine();
System.out.println("Sveiki, " + vardas);
```

3. Parašyti programą, kuri ATSKIRAI prašo įvesti vardą, pavardę, amžių ir atspausdina juos ekrane. Naudoti kintamuosius.

```java
Scanner in = new Scanner(System.in);

System.out.println("Iveskite varda:");
String vardas = in.nextLine();

System.out.println("Iveskite pavarde:");
String pavarde = in.nextLine();

System.out.println("Iveskite amziu:");
int amzius = in.nextInt();

System.out.println(vardas + " " + pavarde + " " + amzius);
```

4. Parašyti programą, kuri prašo įvesti apskritimo spindulį ir pagal jį suskaičiuoja jo ilgį ir plotą.

```java
Scanner in = new Scanner(System.in);

System.out.println("Iveskite spinduli:");
int r = in.nextInt();

float ilgis = 2 * 3.14f * r;
double plotas = 3.14 * r * r;

System.out.println("Ilgis: " + ilgis);
System.out.println("Plotas: " + plotas);
```

5. Parašyti programą, kuri prašo įvesti atstumą (metrais) ir laiką (sekundėmis), o iš įvestų duomenų suskaičiuoja greitį km/h formatu.

```java
Scanner in = new Scanner(System.in);

System.out.println("Iveskite atstuma (m):");
float atstumasMetrais = in.nextFloat();

System.out.println("Iveskite laika (s):");
float laikasSekundemis = in.nextFloat();

float atstumasKm = atstumasMetrais / 1000;
float laikasH = laikasSekundemis / 60 /60;

float greitis = atstumasKm/laikasH;

System.out.println(greitis);
```

6. Parašyti programą, kuri prašo įvesti vardą, pavardę ir gimimo vietą ir atspausdina juos ekrane tokiu formatu:
“Jonas Jonaitis deginasi Palangoje” 

```java
Scanner in = new Scanner(System.in);

System.out.println("Koks jusu vardas?");
String vardas = in.nextLine();

System.out.println("Kokia jusu pavarde?");
String pavarde = in.nextLine();

System.out.println("Kur gimete?");
String gimVieta = in.nextLine();

System.out.println(vardas + " " + pavarde + " deginasi " + gimVieta);
```

7. Parašyti programą, kuri prašo įvesti du skaičius ir patikrina ar jie lygūs. Rezultatą išvesti tokiu formatu: 
“skaičius1 ir skaičius2 yra lygūs/nelygūs”

```java
Scanner in = new Scanner(System.in);

System.out.println("Iveskite pirma skaiciu:");
int sk1 = in.nextInt();

System.out.println("Iveskite antra skaiciu:");
int sk2 = in.nextInt();

if(sk1 == sk2){
    System.out.println(sk1 + " ir " + sk2 + " yra lygus.");
}
else {
    System.out.println(sk1 + " ir " + sk2 + " yra nelygus.");
}
```
ARBA galite naudoti trinarį operatorių
```java
System.out.println(sk1 + " ir " + sk2 + ((sk1 == sk2) ? " yra lygus." : " yra nelygus."));
```

8. Parašyti programą, kuri prašo įvesti 3 skaičius ir nustato didžiausią iš jų

```java
Scanner in = new Scanner(System.in);

System.out.println("Iveskite pirma skaiciu:");
int sk1 = in.nextInt();

System.out.println("Iveskite antra skaiciu:");
int sk2 = in.nextInt();

System.out.println("Iveskite trecia skaiciu:");
int sk3 = in.nextInt();

int didziausias;

if(sk1 > sk2 && sk1 > sk3){
    didziausias = sk1;
}
else if(sk2 > sk1 && sk2 > sk3){
    didziausias = sk2;
}
else {
    didziausias = sk3;
}

System.out.println(didziausias);
```

9. Parašyti programą, kuri prašo įvesti mokinio pažymį ir ekrane išspausdina jo apibūdinimą. (10 – puiku, 9-8 – labai gerai, 7-6 - gerai, 5 - vidutiniškai, 4 – bent teigiamas, 3-2-1 – labai blogai)

```java
Scanner in = new Scanner(System.in);

System.out.println("Iveskite pazymi:");
int paz = in.nextInt();

switch (paz) {
    case 10:
        System.out.println("Puiku");
        break;
    case 9:
    case 8:
        System.out.println("Labai gerai");
        break;
    case 7:
    case 6:
        System.out.println("Gerai");
        break;
    case 5:
        System.out.println("Viduitniškai");
        break;
    case 4:
        System.out.println("Bent teigiamas");
        break;
    case 3:
    case 2:
    case 1:
        System.out.println("Labai blogai");
        break;
    default:
        System.out.println("Tokio pazymio nera");
        break;
}
```

10. Parašyti programą, kuri nuskaito įvestą skaičių ir patikrintų ar jis yra lyginis ar nelyginis.

```java
Scanner in = new Scanner(System.in);

System.out.println("Iveskite skaiciu:");
int sk = in.nextInt();

if(sk  % 2 == 0){
    System.out.println("Lyginis");
} 
else {
    System.out.println("Neyginis");
}
```

11. Parašyti programą, kuri nuskaito savaitės dienos numerį ir atspausdina jos žodinį pavadinimą ekrane.

```java
Scanner in = new Scanner(System.in);

System.out.println("Iveskite savaites dienos numeri:");
int savDienosNr = in.nextInt();

switch (savDienosNr) {
    case 1:
        System.out.println("Pirmadienis");
        break;
    case 2:
        System.out.println("Antradienis");
        break;
    case 3:
        System.out.println("Treciadienis");
        break;
    case 4:
        System.out.println("Ketvirtadienis");
        break;
    case 5:
        System.out.println("Penktadienis");
        break;
    case 6:
        System.out.println("Sestadienis");
        break;
    case 7:
        System.out.println("Sekmadienis");
        break;
    default:
        System.out.println("Tokios savaites dienos nera!");
        break;
}
```

12. Parašyti programą kalkuliatorių, kuri nuskaito 2 skaičius, nuskaito matematinį veiksmą, atlieka veiksmą ir atspausdina rezultatą ekrane tokiu formatu:
“{pirmas skaicius} {matematinis veiksmas} {antras skaičius} = {rezultatas}”

```java
Scanner in = new Scanner(System.in);

System.out.println("Iveskite pirma skaiciu:");
int sk1 = in.nextInt();

System.out.println("Iveskite antra skaiciu:");
int sk2 = in.nextInt();

System.out.println("Iveskite operatoriu:");
char sk3 = in.nextChar();


```

13. Patikrinkite, ar įvesto keturženklio skaičiaus x pirmas skaitmuo yra lyginis.

```java
Scanner in = new Scanner(System.in);

System.out.println("Iveskite skaiciu:");
int sk = in.nextInt();


```
