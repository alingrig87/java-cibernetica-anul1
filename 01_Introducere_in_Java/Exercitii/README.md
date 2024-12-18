

## Exercițiul 1: Primul Program - "Hello, World!"

### Obiectiv:
Scrie și execută un program simplu Java.

### Pași:
1. **Creează un director pentru proiect**:
   - Numește folderul `HelloWorldProject`.
2. **Creează fișierul sursă**:
   - Lansează un editor de text (de exemplu, Visual Studio Code, IntelliJ IDEA sau Notepad++).
   - Salvează fișierul ca `HelloWorld.java` în folderul `HelloWorldProject`.
3. **Scrie codul**:
   ```java
   // Declarația clasei publice HelloWorld. Numele clasei trebuie să corespundă cu numele fișierului.
   public class HelloWorld {
       // Metoda main este punctul de intrare al programului Java.
       public static void main(String[] args) {
           // Afișează mesajul "Hello, World!" pe consolă.
           System.out.println("Hello, World!");
       }
   }
   ```
4. **Compilare**:
   - Deschide terminalul și navighează la folderul `HelloWorldProject`:
     ```
     cd path/to/HelloWorldProject
     ```
   - Rulează comanda de compilare:
     ```
     javac HelloWorld.java
     ```
5. **Execuție**:
   - Execută programul:
     ```
     java HelloWorld
     ```
   - Ar trebui să vezi mesajul: `Hello, World!`.

---

## Exercițiul 2: Explorarea JVM, JRE și JDK

### Obiectiv:
Înțelege funcționalitatea JVM, JRE și JDK.

### Pași:
1. **Descompune procesul de compilare și execuție:**
   - Creează un fișier numit `ReadMe.txt` în folderul `HelloWorldProject`.
   - Notează următorii pași explicați:
     1. Rolul compilatorului (`javac`) în generarea fișierelor `.class` (bytecode).
     2. Rolul JVM în interpretarea și executarea bytecode-ului.
2. **Observă fișierul bytecode:**
   - Deschide `HelloWorld.class` într-un editor hex sau verifică mărimea fișierului pentru a vedea diferența față de codul sursă.

---

## Exercițiul 3: Crearea unei Clase și Metode Adiționale

### Obiectiv:
Extinde programul pentru a introduce metode adiționale și interacțiune cu utilizatorul.

### Pași:
1. **Modifică programul**:
   - Creează un fișier nou numit `Greeting.java` în același folder.
   - Scrie codul următor:
     ```java
     // Importă clasa Scanner pentru a permite citirea de la tastatură.
     import java.util.Scanner;

     // Declarația clasei publice Greeting.
     public class Greeting {
         // Metoda main, punctul de intrare al programului.
         public static void main(String[] args) {
             // Creează un obiect Scanner pentru a citi input-ul utilizatorului.
             Scanner scanner = new Scanner(System.in);
             // Afișează un mesaj pentru a cere numele utilizatorului.
             System.out.print("Enter your name: ");
             // Citește numele utilizatorului și îl stochează într-o variabilă de tip String.
             String name = scanner.nextLine();
             // Afișează un mesaj personalizat de întâmpinare.
             System.out.println("Hello, " + name + "!");
         }
     }
     ```
2. **Compilare și Execuție:**
   - Folosește aceiași pași ca în Exercițiul 2.
   - Introdu un nume la execuție și observă răspunsul personalizat.

---

## Exercițiul 4: Crearea unei Clase Separate pentru Calcul

### Obiectiv:
Creează o clasă separată care efectuează operații matematice.

### Pași:
1. **Creează fișierul MathOperations.java:**
   - Adaugă următorul cod:
     ```java
     // Declarația clasei publice MathOperations.
     public class MathOperations {
         // Metodă statică pentru adunarea a două numere întregi.
         public static int add(int a, int b) {
             // Returnează suma numerelor a și b.
             return a + b;
         }

         // Metodă statică pentru înmulțirea a două numere întregi.
         public static int multiply(int a, int b) {
             // Returnează produsul numerelor a și b.
             return a * b;
         }
     }
     ```
2. **Actualizează Greeting.java:**
   - Importează clasa `MathOperations` și adaugă acest cod:
     ```java
     // Calculează suma a două numere folosind metoda add din MathOperations.
     int sum = MathOperations.add(5, 10);
     // Calculează produsul a două numere folosind metoda multiply din MathOperations.
     int product = MathOperations.multiply(5, 10);
     // Afișează suma pe consolă.
     System.out.println("Sum: " + sum);
     // Afișează produsul pe consolă.
     System.out.println("Product: " + product);
     ```
3. **Compilare și Execuție:**
   - Asigură-te că ambele fișiere sunt în același folder.
   - Compilează tot proiectul:
     ```
     javac *.java
     ```
   - Rulează `Greeting`.

---
