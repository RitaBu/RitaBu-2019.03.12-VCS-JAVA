## ```while``` ciklas

1. Parašykite programą naudojant while ciklą, kuri išvestų 10 pirmų natūraliųjų skaičių.

```java
int i = 1;
while(i <= 10)
{
    System.out.println(i);
    i++;
}
```

2. Parašyti programą naudojant while ciklą, kuri nuskaitinėja įvestus skaičius tol, kol jų suma nėra daugiau 50.

```java
int suma = 0;

while(suma <= 50){
    System.out.println("Iveskite skaiciu");
    int sk = in.nextInt();
    suma = suma + sk;
}
```

3. Sukurkite program, kuri nuskaito skaičių ir naudojant while ciklą, kuri apskaičiuotų dvejeto laipsnį 2n. 
Pvz.: Jei a = 4, tai turi būti išvesta 2. Jei a = 16, tai turi būti išvesta 4.

```java
System.out.println("Iveskite skaiciu");
int sk = in.nextInt();

int laipsnis = 0;

while (sk > 1){
    sk = sk / 2;
    laipsnis++;
}
```

## ```do while``` ciklas

4. Parašykite programą, kuri išvestų 10 pirmų natūraliųjų skaičių.

```java
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 10);
```

5. Parašykite programą, kuri suskaičiuotų, kiek skaitmenų turi duotas skaičius a.

```java
System.out.println("Iveskite skaiciu");
int sk = in.nextInt();

int skaitmenuSkaicius = 0;

do {
   sk = sk / 10;
   skaitmenuSkaicius++;
} while(sk != 0);

System.out.println("Skaicius turi " + skaitmenuSkaicius + " skaitmenu.");
```

## ```for``` ciklas

6. Parašyti programą naudojant for ciklą, kuri suskaičiuoja pirmų 10 natūraliųjų skaičių sumą.

```java
int suma = 0;
for (int i = 1; i <= 10; i++) {
    suma += i;
}
System.out.println(suma);
```

7. Parašyti programą naudojant for ciklą, kuri prašo įvesti natūralųjį skaičių ir atspausdina visus žemesnius natūraliuosius skaičius mažėjančia tvarka.

```java
System.out.println("Iveskite skaiciu");
int sk = in.nextInt();

for (int i = sk; i > 0; i--) {
    System.out.println(i);
}
```

8. Parašyti programą naudojant for ciklą, kuri prašo įvesti skaičių ir atspausdina jo daugybos lentelę.

```java
System.out.println("Iveskite skaiciu");
int skaicius = in.nextInt();

for (int i = 1; i <= 10; i++) {
    System.out.println(skaicius + "x" + i + "=" + skaicius * i);
}
```

9. Parašyti programą naudojant for ciklą, kuri prašo įvesti piramidės aukštį ir atspausdina skaičių piramidę tokiu formatu:
```
1
2 3
4 5 6
7 8 9 10
```

```java
System.out.println("Iveskite piramides auksti:");
int piramidesAukstis = in.nextInt();

int skaicius = 1;

for (int i = 1; i <= piramidesAukstis; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(skaicius + " ");
        skaicius++;
    }
    System.out.println();
}
```
## ```break``` ir ```continue```

10. Parašykite programą, kuri iteruoja per pirmus 20 natūraliųjų skaičių, skaičiuoja jų sumą ir išeina iš ciklo, kai suma tampa didesnė už 15. (```break```)

```java
int suma = 0;

for (int i = 1; i < 20; i++) {
    if(suma > 15){
        break;
    }
    suma += i;
    System.out.println(i + ": " + suma);
}
```

11. Parašykite programą, kuri išves visus skaičius nuo 1 iki 17, išskyrus 7 ir 13. (```continue```)

```java
for (int i = 1; i <= 17; i++) {
    if(i == 7 || i == 13) {
        continue;
    }
    System.out.println(i);
}
```
#Masyvai

12. Parašyti programą, kuri nuskaito 10 elementų į masyvą ir jį atspausdina.

```java
int[] masyvas = new int[10];

for (int i = 0; i < 10; i++) {
    System.out.println("Iveskite skaiciu: ");
    int sk = in.nextInt();
    masyvas[i] = sk;
}

for(int masyvoElementas : masyvas){
    System.out.println(masyvoElementas);
}
```

13. Parašyti programą, kuri prašo įvesti masyvo dydį ir tada nuskaito n elementų į masyvą ir atspausdina jį atvirkščiai.

```java
System.out.println("Iveskite masyvo dydi:");
int n = in.nextInt();

int[] masyvas = new int[n];

for (int i = 0; i < n; i++) {
    System.out.println("Iveskite skaiciu: ");
    int sk = in.nextInt();
    masyvas[i] = sk;
}

for (int i = n - 1; i >= 0; i--) {
    System.out.println(masyvas[i]);
}
```

14. Apibrėžkite savo skaičių masyvą su 10 elementų. Atspausdinkite kiekvieno elemento kvadratą, pvz.: masyvą su elementasi 2, 5, 6, turėtų atspausdinti taip - 4, 25, 36

```java
int[] skaiciai = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

for (int sk : skaiciai) {
    System.out.println(sk*sk);
}
```

15. Apibrėžti ir priskirti reikšmes dvimačiam bool masyvui, kuris turi 4 eilutes ir 7 stulpelius ir atspausdinti jį ekrane 
(Jei elemento reikšmė true - tai *, jei false, tai -)

```java
boolean[][] manoMasyvas =
{
    { false, false, false, true, false, false, false },
    { false, false, true, false, true, false, false },
    { false, true, false, true, false, true, false },
    { true, false, true, false, true, false, true}
};

for (int i = 0; i < 4; i++){
    for (int j = 0; j < 7; j++)
    {
        System.out.print((manoMasyvas[i][j] ? "*": "-"));
    }
    System.out.println();
}
```
