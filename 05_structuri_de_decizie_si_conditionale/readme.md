
## 📌 Introducere
În Java, structurile de control sunt utilizate pentru a decide **fluxul execuției** în funcție de anumite condiții. Cele mai utilizate structuri sunt:

- `if-else` – Permite execuția condiționată a unor blocuri de cod.
- `while` – Execută un bloc de cod cât timp o condiție este adevărată.
- `for` – Permite iterarea pe un număr fix de pași.

Acest document explică fiecare dintre aceste structuri cu exemple detaliate.

---

## 🔹 1. `if-else` în Java
`if-else` este utilizat pentru **luarea deciziilor** în program.

### ✅ Sintaxa `if-else`
```java
if (conditie) {
    // Cod executat dacă condiția este adevărată
} else {
    // Cod executat dacă condiția este falsă
}
```

🔹 **Exemplu de utilizare:**
```java
public class ExempluIfElse {
    public static void main(String[] args) {
        int varsta = 18;

        if (varsta >= 18) {
            System.out.println("Ești major.");
        } else {
            System.out.println("Ești minor.");
        }
    }
}
```
**Output:**
```
Ești major.
```

---

## 🔹 2. `while` în Java
`while` este utilizat pentru **executarea repetată a unui bloc de cod** cât timp o condiție este adevărată.

### ✅ Sintaxa `while`
```java
while (conditie) {
    // Cod repetat cât timp condiția este adevărată
}
```

🔹 **Exemplu de utilizare:**
```java
public class ExempluWhile {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            System.out.println("Număr: " + i);
            i++;
        }
    }
}
```
**Output:**
```
Număr: 1
Număr: 2
Număr: 3
Număr: 4
Număr: 5
```

---

## 🔹 3. `for` în Java
`for` este utilizat atunci când **știm exact de câte ori trebuie executat un bloc de cod**.

### ✅ Sintaxa `for`
```java
for (initializare; conditie; incrementare/decrementare) {
    // Cod repetat cât timp condiția este adevărată
}
```

🔹 **Exemplu de utilizare:**
```java
public class ExempluFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iterația: " + i);
        }
    }
}
```
**Output:**
```
Iterația: 1
Iterația: 2
Iterația: 3
Iterația: 4
Iterația: 5
```

---

## 🔹 Erori comune și soluții

### ❌ Eroare: Buclă infinită
**Cod greșit:**
```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    // Lipsă incrementare → Buclă infinită
}
```
✅ **Soluție:** Adaugă `i++` în interiorul buclei.

### ❌ Eroare: Accesare greșită a unui array în `for`
**Cod greșit:**
```java
int[] numere = {10, 20, 30};
for (int i = 0; i <= numere.length; i++) { // `<=` greșit
    System.out.println(numere[i]);
}
```
✅ **Soluție:** Folosește `i < numere.length`.
