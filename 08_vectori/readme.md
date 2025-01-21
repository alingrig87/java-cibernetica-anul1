# 📘 Ghid Detaliat: Vectori (Array-uri) în Java

## 📌 Introducere
Vectorii (array-urile) în Java sunt structuri de date care permit stocarea unui număr fix de elemente de același tip. Aceștia sunt foarte utili pentru gestionarea colecțiilor de date într-o manieră eficientă.

În acest document, vom explora:
- **Declararea și inițializarea vectorilor**.
- **Parcurgerea vectorilor**.
- **Vectori multidimensionali**.
- **Operațiuni comune asupra vectorilor**.
- **Exemple detaliate de cod** pentru fiecare concept.

---

## 🔹 1. Declararea și Inițializarea unui Vector
În Java, un vector trebuie declarat și inițializat înainte de utilizare. Există mai multe moduri de a face acest lucru.

### ✅ Declarația unui vector
```java
int[] numere;
```
Aceasta este doar o **declarație**. Pentru a putea folosi vectorul, trebuie inițializat.

### ✅ Inițializarea unui vector cu o dimensiune fixă
```java
int[] numere = new int[5];
```
Aceasta creează un vector care poate stoca **5** elemente de tip `int`. Valoarea implicită pentru fiecare element va fi `0`.

### ✅ Inițializarea unui vector cu valori specifice
```java
int[] numere = {10, 20, 30, 40, 50};
```
Aceasta creează un vector cu valori predefinite.

---

## 🔹 2. Accesarea Elementelor dintr-un Vector
Elementele unui vector pot fi accesate folosind **indicele** acestora (începând de la `0`).

### ✅ Exemplu de accesare a unui element
```java
int[] numere = {5, 10, 15, 20};
System.out.println("Primul element: " + numere[0]);
```
**Output:**
```
Primul element: 5
```

### ❌ Eroare Comună: `ArrayIndexOutOfBoundsException`
Dacă încerci să accesezi un indice care nu există:
```java
System.out.println(numere[10]); // Va arunca o eroare
```
**Soluție:** Asigură-te că indicele este valid (`0` până la `numere.length - 1`).

---

## 🔹 3. Parcurgerea unui Vector
Pentru a parcurge elementele unui vector, putem folosi **bucle**.

### ✅ Parcurgerea cu `for`
```java
int[] numere = {10, 20, 30, 40};
for (int i = 0; i < numere.length; i++) {
    System.out.println("Element la index " + i + ": " + numere[i]);
}
```

### ✅ Parcurgerea cu `for-each`
```java
for (int num : numere) {
    System.out.println("Element: " + num);
}
```

---

## 🔹 4. Vectori Multidimensionali
Vectorii multidimensionali sunt **vectori care conțin alți vectori**.

### ✅ Exemplu de vector bidimensional (matrice)
```java
int[][] matrice = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
System.out.println("Elementul de pe linia 1, coloana 2: " + matrice[0][1]);
```
**Output:**
```
Elementul de pe linia 1, coloana 2: 2
```

### ✅ Parcurgerea unei matrice
```java
for (int i = 0; i < matrice.length; i++) {
    for (int j = 0; j < matrice[i].length; j++) {
        System.out.print(matrice[i][j] + " ");
    }
    System.out.println();
}
```
**Output:**
```
1 2 3
4 5 6
7 8 9
```

---

## 🔹 5. Operațiuni Comune asupra Vectorilor

### ✅ Calcularea sumei elementelor unui vector
```java
int[] numere = {10, 20, 30, 40};
int suma = 0;
for (int num : numere) {
    suma += num;
}
System.out.println("Suma elementelor: " + suma);
```

### ✅ Găsirea celui mai mare element
```java
int[] numere = {5, 8, 12, 3, 19};
int max = numere[0];
for (int num : numere) {
    if (num > max) {
        max = num;
    }
}
System.out.println("Cel mai mare element: " + max);
```

### ✅ Sortarea unui vector
```java
import java.util.Arrays;
int[] numere = {30, 10, 50, 20, 40};
Arrays.sort(numere);
System.out.println("Vector sortat: " + Arrays.toString(numere));
```

**Output:**
```
Vector sortat: [10, 20, 30, 40, 50]
```

---