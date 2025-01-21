## 📌 Introducere
Java este un **limbaj de programare orientat pe obiecte (OOP)**, ceea ce înseamnă că majoritatea aplicațiilor sale sunt construite în jurul **claselor și obiectelor**. 

În acest document, vom explora:
- **Clase și obiecte** în Java.
- **Modificatori de acces**.
- **Cuvântul cheie `static`**.
- **Cuvântul cheie `new`**.
- **Cuvântul cheie `this`**.
- **Metode în Java**.
- **Exemple detaliate de cod** pentru fiecare concept.

---

## 🔹 1. Ce este o clasă?
O **clasă** este un șablon (template) care definește structura unui obiect. Aceasta conține **atribute (variabile)** și **metode** care definesc comportamentul obiectului.

### ✅ Definirea unei clase în Java
```java
class Masina {
    // Atribute (variabile de instanță)
    String marca;
    int anFabricatie;

    // Metodă
    void afiseazaDetalii() {
        System.out.println("Marca: " + marca + ", An fabricație: " + anFabricatie);
    }
}
```

---

## 🔹 2. Ce este un obiect?
Un **obiect** este o instanță a unei clase. Cu ajutorul `new`, putem crea obiecte și utiliza metodele și atributele definite în clasă.

### ✅ Crearea unui obiect
```java
public class TestMasina {
    public static void main(String[] args) {
        Masina masina1 = new Masina(); // Creare obiect
        masina1.marca = "Toyota";
        masina1.anFabricatie = 2022;

        masina1.afiseazaDetalii(); // Apelare metodă
    }
}
```

**Output:**
```
Marca: Toyota, An fabricație: 2022
```

---

## 🔹 3. Cuvântul cheie `new`
Cuvântul cheie **`new`** este utilizat pentru **alocarea dinamică a memoriei** și pentru crearea unei **noi instanțe a unei clase**. Atunci când utilizăm `new`, JVM alocă memorie pentru obiect și returnează o referință la acesta.

### ✅ Exemplu cu `new`
```java
class Student {
    String nume;
    int varsta;
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(); // Creare obiect
        student1.nume = "Alex";
        student1.varsta = 20;

        System.out.println("Student: " + student1.nume + ", Vârsta: " + student1.varsta);
    }
}
```

**Output:**
```
Student: Alex, Vârsta: 20
```

🔹 **Ce face `new`?**
1. **Alocă memorie** pentru obiect în heap.
2. **Inițializează obiectul** (folosind constructorul dacă există).
3. **Returnează o referință** către obiectul creat.

---

## 🔹 4. Cuvântul cheie `this`
Cuvântul cheie **`this`** este utilizat pentru a referi **obiectul curent**. Se folosește pentru a evita ambiguitatea între variabilele de instanță și parametrii metodelor sau constructorilor.

### ✅ Exemplu cu `this`
```java
class Angajat {
    String nume;
    int salariu;

    Angajat(String nume, int salariu) {
        this.nume = nume; // `this` face referire la variabila de instanță
        this.salariu = salariu;
    }

    void afiseazaDetalii() {
        System.out.println("Nume: " + this.nume + ", Salariu: " + this.salariu);
    }
}

public class Test {
    public static void main(String[] args) {
        Angajat angajat1 = new Angajat("Maria", 5000);
        angajat1.afiseazaDetalii();
    }
}
```

**Output:**
```
Nume: Maria, Salariu: 5000
```

🔹 **Utilizări comune ale `this`:**
- **Referirea variabilelor de instanță** când parametrii metodei sau constructorului au același nume.
- **Apelarea altor constructori** din aceeași clasă folosind `this()`.
- **Returnarea obiectului curent** dintr-o metodă.

---

## 🔹 5. Metode în Java
O **metodă** este un bloc de cod care realizează o acțiune specifică și poate returna un rezultat. Metodele pot fi **instanță** (aparțin obiectelor) sau **statice** (aparțin clasei).

### ✅ Definirea unei metode
```java
class Calculator {
    int aduna(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int suma = calc.aduna(5, 10);
        System.out.println("Suma este: " + suma);
    }
}
```

**Output:**
```
Suma este: 15
```

🔹 **Tipuri de metode:**
1. **Metode fără parametri și fără return**
   ```java
   void afiseazaMesaj() {
       System.out.println("Salut!");
   }
   ```
2. **Metode cu parametri și return**
   ```java
   int inmulteste(int x, int y) {
       return x * y;
   }
   ```
3. **Metode statice**
   ```java
   static void metodaStatica() {
       System.out.println("Aceasta este o metodă statică.");
   }
   ```

---
