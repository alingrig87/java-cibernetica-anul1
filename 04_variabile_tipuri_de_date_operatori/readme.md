
## 📌 Introducere
Java este un **limbaj puternic tipizat**, ceea ce înseamnă că fiecare variabilă trebuie să fie declarată cu un tip de date specific. În acest document, vom explora:
- **Variabile și scopul acestora**.
- **Tipuri de date primitive** și dimensiunea lor în biți.
- **Operatori în Java**.
- **Exemple detaliate de cod** pentru fiecare concept.

---

## 🔹 1. Variabile în Java
O variabilă este o **zonă de memorie** unde putem stoca date. În Java, fiecare variabilă trebuie să fie declarată cu un tip de date.

### ✅ Declarația și inițializarea variabilelor
```java
int varsta = 25;
String nume = "Alex";
boolean esteStudent = true;
```

### ✅ Tipuri de variabile
1. **Variabile locale** – Declarație în interiorul unei metode (nu sunt vizibile în afara metodei).
2. **Variabile de instanță** – Declarate în interiorul unei clase, dar în afara metodelor (specifice fiecărui obiect).
3. **Variabile statice** – Declarate cu `static`, partajate între toate instanțele clasei.

---

## 🔹 2. Tipuri de Date Primitive în Java
Java are **8 tipuri de date primitive**:

| Tip | Dimensiune | Valoare minimă | Valoare maximă |
|-----|-----------|----------------|----------------|
| `byte`  | 8 biți  | -128  | 127  |
| `short` | 16 biți | -32,768 | 32,767 |
| `int`   | 32 biți | -2,147,483,648 | 2,147,483,647 |
| `long`  | 64 biți | -9,223,372,036,854,775,808 | 9,223,372,036,854,775,807 |
| `float` | 32 biți | 1.4E-45 | 3.4E+38 |
| `double` | 64 biți | 4.9E-324 | 1.8E+308 |
| `char`  | 16 biți | 0 | 65,535 (un caracter Unicode) |
| `boolean` | 1 bit | `true` sau `false` | `true` sau `false` |

### ✅ Exemplu de utilizare a tipurilor de date primitive
```java
public class TipuriPrimitive {
    public static void main(String[] args) {
        byte varByte = 100;
        int varInt = 10000;
        float varFloat = 5.75f;
        char varChar = 'A';
        boolean varBool = true;

        System.out.println("Byte: " + varByte);
        System.out.println("Int: " + varInt);
        System.out.println("Float: " + varFloat);
        System.out.println("Char: " + varChar);
        System.out.println("Boolean: " + varBool);
    }
}
```

**Output:**
```
Byte: 100
Int: 10000
Float: 5.75
Char: A
Boolean: true
```

---

## 🔹 3. Operatori în Java
Operatorii sunt simboluri speciale utilizate pentru **efectuarea operațiilor** asupra variabilelor și valorilor.

### ✅ Tipuri de operatori
1. **Operatori aritmetici** (`+`, `-`, `*`, `/`, `%`)
2. **Operatori de atribuire** (`=`, `+=`, `-=`, `*=`, `/=`, `%=`, `&=`, `|=`, `^=`, `>>=`, `<<=`)
3. **Operatori de comparație** (`==`, `!=`, `>`, `<`, `>=`, `<=`)
4. **Operatori logici** (`&&`, `||`, `!`)
5. **Operatori bitwise** (`&`, `|`, `^`, `~`, `<<`, `>>`, `>>>`)

### ✅ Exemplu cu operatori aritmetici
```java
public class Operatori {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("Suma: " + (a + b));
        System.out.println("Diferența: " + (a - b));
        System.out.println("Înmulțire: " + (a * b));
        System.out.println("Împărțire: " + (a / b));
        System.out.println("Rest: " + (a % b));
    }
}
```

**Output:**
```
Suma: 15
Diferența: 5
Înmulțire: 50
Împărțire: 2
Rest: 0
```

### ✅ Exemplu cu operatori logici
```java
public class OperatoriLogici {
    public static void main(String[] args) {
        boolean x = true, y = false;
        System.out.println("AND: " + (x && y));
        System.out.println("OR: " + (x || y));
        System.out.println("NOT x: " + (!x));
    }
}
```

**Output:**
```
AND: false
OR: true
NOT x: false
```

---