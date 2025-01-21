## 📌 Introducere
Java este un limbaj de programare orientat pe obiecte, cunoscut pentru portabilitatea și securitatea sa. În acest document, vom explora:
- Cum să scrii și să rulezi primul program Java.
- Detalii despre metoda `main`.
- Cum funcționează `System.out.println`.
- Procesul de compilare și execuție al unui program Java.

---

## 🔹 Scrierea primului program Java
Un program simplu în Java care afișează `Hello, World!` poate arăta astfel:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

Acest program conține:
- **Declarația clasei `HelloWorld`**: Java este un limbaj orientat pe obiecte, astfel că orice program Java trebuie să fie într-o clasă.
- **Metoda `main`**: Este punctul de intrare al aplicației Java.
- **Instrucțiunea `System.out.println`**: Afișează un mesaj în consola standard.

---

## 🔹 Detalii despre metoda `main`
Metoda `main` este esențială în orice program Java, deoarece este punctul de start al execuției.

### ✅ Structura metodei `main`
```java
public static void main(String[] args)
```
Explicația fiecărei componente:
- **`public`** – Face metoda accesibilă de oriunde.
- **`static`** – Permite apelarea metodei fără a crea o instanță a clasei.
- **`void`** – Indică faptul că metoda nu returnează niciun rezultat.
- **`main`** – Numele metodei speciale recunoscute de JVM.
- **`String[] args`** – Permite primirea argumentelor din linia de comandă.

---

## 🔹 `System.out.println` – Cum funcționează?
Instrucțiunea `System.out.println` este utilizată pentru afișarea unui mesaj în consolă.

### ✅ Explicație componentă cu componentă
```java
System.out.println("Mesaj de test");
```
- **`System`** – Este o clasă din pachetul `java.lang`.
- **`out`** – Este un obiect static al clasei `PrintStream`, responsabil de ieșirea standard.
- **`println`** – Este o metodă care afișează un mesaj și adaugă automat un rând nou (`\n`).

---

## 🔹 Compilarea și rularea unui program Java
Java este un limbaj **compilat și interpretat**, ceea ce înseamnă că un program Java trebuie mai întâi compilat în **bytecode**, apoi interpretat de JVM.

### ✅ Pași pentru compilare și rulare
1. **Scrie codul sursă Java** într-un fișier cu extensia `.java`.
2. **Compilare** folosind comanda `javac`.
3. **Executare** folosind comanda `java`.

🔹 **Exemplu:**
```sh
javac HelloWorld.java  # Compilează programul
java HelloWorld        # Rulează programul
```
**Output:**
```
Hello, World!
```

---

## 🔹 Erori frecvente și soluții

### ❌ Eroare: `Main method not found`
```sh
Error: Main method not found in class HelloWorld
```
✅ **Soluție:** Asigură-te că metoda `main` este corect scrisă:
```java
public static void main(String[] args)
```

### ❌ Eroare: `Could not find or load main class`
```sh
Error: Could not find or load main class HelloWorld
```
✅ **Soluție:**
- Asigură-te că **numele fișierului și al clasei coincid** (`HelloWorld.java` → `HelloWorld`).
- Rulează comanda din directorul corect.
