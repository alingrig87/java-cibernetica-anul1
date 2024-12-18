# Introducere în Java

## Ce este Java?
Java este un limbaj de programare orientat pe obiecte, robust, portabil și independent de platformă. Creat inițial de Sun Microsystems în 1995 și acum dezvoltat de Oracle Corporation, Java este folosit pe scară largă pentru aplicații desktop, web, mobile și embedded.

### Caracteristicile cheie ale Java:
1. **Orientat pe obiecte**: Totul în Java este tratat ca un obiect, facilitând reutilizarea codului.
2. **Portabil**: Codul Java este compilat în bytecode, care poate fi rulat pe orice platformă care are o Java Virtual Machine (JVM).
3. **Robust**: Include gestionare avansată a erorilor și verificarea strictă a tipurilor.
4. **Securizat**: Java are funcții integrate pentru a proteja datele de atacuri.
5. **Multithreading**: Java suportă execuția mai multor fire de execuție simultan.
6. **Performanță ridicată**: Cu optimizări precum Just-In-Time (JIT) compilation.

---

## Beneficiile utilizării limbajului Java

1. **Independența platformei**: Scrii codul o dată și îl rulezi oriunde (principiul "Write Once, Run Anywhere").
2. **O comunitate vastă**: Numeroase resurse, biblioteci și suport comunitar.
3. **Suport pentru programare distribuită**: Ideal pentru aplicații complexe distribuite.
4. **Scalabilitate**: Potrivit atât pentru aplicații mici, cât și pentru sisteme enterprise de mari dimensiuni.
5. **Ecosistem vast**: Incluzând cadre (frameworks) populare precum Spring, Hibernate și Apache Struts.

---

## Java Virtual Machine (JVM), Java Runtime Environment (JRE) și Java Development Kit (JDK)

### **JVM (Java Virtual Machine)**
JVM este componenta care execută bytecode-ul Java. Este platforma care face posibilă independența platformei.

**Funcții principale ale JVM:**
- Începe și gestionează execuția programelor Java.
- Realizează compilarea la timp (Just-In-Time Compilation).
- Gestionează memorie prin Garbage Collection.

### **JRE (Java Runtime Environment)**
JRE este mediul necesar pentru a rula aplicații Java. Include JVM și biblioteci de clase esențiale.

**Ce conține JRE?**
- JVM.
- Biblioteci standard (Java API).
- Fisiere de configurare necesare pentru rularea aplicațiilor Java.

### **JDK (Java Development Kit)**
JDK este un set complet de instrumente pentru dezvoltarea aplicațiilor Java. Include JRE, JVM, și unele instrumente suplimentare, cum ar fi:
- **Compilatorul (javac)** pentru conversia codului sursă în bytecode.
- **Instrumente de depanare**, cum ar fi jdb.
- **Javadoc**, pentru generarea documentației din comentarii.

---

## Primul Program Java

### Codul sursă: "Hello, World!"
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Explicație:
1. **`public class HelloWorld`**: Declarația unei clase publice numite `HelloWorld`. Numele fișierului trebuie să fie `HelloWorld.java`.
2. **`public static void main(String[] args)`**: Punctul de intrare al programului. Această metodă este apelată de JVM la execuția aplicației.
3. **`System.out.println("Hello, World!");`**: Imprimă textul pe consolă.

---

## Cum se compilează și execută un program Java

1. **Compilare:**
   ```
   javac HelloWorld.java
   ```
   Acest comandă generează un fișier `HelloWorld.class`, care conține bytecode.

2. **Execuție:**
   ```
   java HelloWorld
   ```
   JVM execută bytecode-ul din fișierul `HelloWorld.class`.

---

## Arhitectura Java

1. **Codul sursă:** Este scris de programator într-un fișier `.java`.
2. **Compilatorul:** Converteste codul sursă în bytecode (`.class`).
3. **JVM:** Interpretează bytecode-ul și îl execută.
4. **Bibliotecile standard:** Acestea furnizează funcții esențiale pentru dezvoltare.

---

