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


## masyvai
