## 📌 Introducere

Programarea Orientată pe Obiecte (**POO**) este un model de programare care organizează codul în jurul obiectelor și claselor, facilitând reutilizarea codului și întreținerea acestuia. Java este un limbaj de programare **pur obiectual**, ceea ce înseamnă că majoritatea funcționalităților sunt bazate pe **obiecte și clase**.

Acest document oferă o explicație detaliată a paradigmei POO în Java, incluzând conceptele de **încapsulare, moștenire, polimorfism și abstractizare**, alături de exemple practice.

---

## 🔹 Principalele concepte ale POO în Java

Programarea orientată pe obiecte în Java se bazează pe patru concepte fundamentale:

1. **Încapsulare**
2. **Moștenire**
3. **Polimorfism**
4. **Abstractizare**

Vom analiza fiecare concept în detaliu mai jos.

---

## 🔹 1. Încapsularea

Încapsularea este procesul de **ascundere a detaliilor implementării** și de **restricționare a accesului** la anumite date ale obiectului. Aceasta se realizează prin:

- **Atribute private** (`private`)
- **Metode publice pentru acces** (`getters` și `setters`)

🔹 **Exemplu de încapsulare:**

```java
class ContBancar {
    private double sold;

    public ContBancar(double soldInitial) {
        this.sold = soldInitial;
    }

    public double getSold() {
        return sold;
    }

    public void depune(double suma) {
        if (suma > 0) {
            sold += suma;
        }
    }
}
```

🔹 **Avantajele încapsulării:**

- Protejează datele împotriva modificărilor neautorizate.
- Crește securitatea codului.
- Permite o mai bună organizare a codului.

---

## 🔹 2. Moștenirea

Moștenirea este mecanismul prin care o clasă poate **extinde** o altă clasă, preluând comportamentul și proprietățile acesteia. Aceasta ajută la **reutilizarea codului** și **reducerea redundanței**.

🔹 **Exemplu de moștenire:**

```java
class Animal {
    void faceSunet() {
        System.out.println("Animalul scoate un sunet");
    }
}

class Caine extends Animal {
    void faceSunet() {
        System.out.println("Câinele latră");
    }
}

public class Test {
    public static void main(String[] args) {
        Caine caine = new Caine();
        caine.faceSunet(); // Output: Câinele latră
    }
}
```

🔹 **Avantajele moștenirii:**

- Permite reutilizarea codului.
- Crește modularitatea și scalabilitatea aplicației.
- Facilitează întreținerea codului.

---

## 🔹 3. Polimorfismul

Polimorfismul permite utilizarea unei **aceleiași metode** în moduri diferite, fie prin **suprascriere (override)**, fie prin **supraincarcare (overload)**.

### ✅ Suprascriere (Method Overriding)

Permite unei subclase să modifice comportamentul unei metode moștenite din superclasă.

🔹 **Exemplu de suprascriere:**

```java
class Vehicul {
    void porneste() {
        System.out.println("Vehiculul pornește");
    }
}

class Masina extends Vehicul {
    @Override
    void porneste() {
        System.out.println("Mașina pornește");
    }
}
```

### ✅ Supraincarcare (Method Overloading)

Permite declararea mai multor metode cu **același nume**, dar cu **parametri diferiți**.

🔹 **Exemplu de supraincarcare:**

```java
class Calculator {
    int aduna(int a, int b) {
        return a + b;
    }

    double aduna(double a, double b) {
        return a + b;
    }
}
```

🔹 **Avantajele polimorfismului:**

- Permite reutilizarea codului într-un mod flexibil.
- Facilitează întreținerea și extinderea aplicațiilor.

---

## 🔹 4. Abstractizarea

Abstractizarea este procesul de **ascundere a detaliilor implementării** și **expunere a funcționalităților esențiale**. Acest lucru se realizează prin **clase abstracte** și **interfețe**.

### ✅ Clase Abstracte

O clasă abstractă nu poate fi instanțiată și conține metode **abstracte (fără implementare)**.

🔹 **Exemplu de clasă abstractă:**

```java
abstract class Vehicul {
    abstract void porneste();
}

class Masina extends Vehicul {
    void porneste() {
        System.out.println("Mașina pornește");
    }
}
```

### ✅ Interfețe

Interfețele definesc un **set de metode** care trebuie implementate de clasele care le folosesc.

🔹 **Exemplu de interfață:**

```java
interface Animal {
    void faceSunet();
}

class Pisica implements Animal {
    public void faceSunet() {
        System.out.println("Pisica miaună");
    }
}
```

🔹 **Avantajele abstractizării:**

- Permite separarea între **ce face** un obiect și **cum face**.
- Facilitează menținerea codului prin reducerea dependențelor.
- Crește flexibilitatea aplicației.

---


