1. **Care este semnătura corectă a metodei `main` în Java?**  
   a) `void main(String args)`  
   b) `public static void main(String[] args)`  
   c) `public void main(String args[])`  
   d) `static int main(String args[])`

2. **De ce metoda `main` este declarată `static`?**  
   a) Pentru a permite apelarea sa fără instanțierea unei clase  
   b) Pentru a putea fi moștenită de alte clase  
   c) Pentru a avea acces la variabile statice  
   d) Pentru a fi utilizată doar în metodele private

3. **Ce se întâmplă dacă omitem `static` în declarația metodei `main`?**  
   a) Programul va rula fără probleme  
   b) Va apărea o eroare de compilare  
   c) JVM va încerca să creeze o instanță implicită a clasei  
   d) JVM va ignora metoda `main` și va căuta alta

4. **Ce va afișa următorul cod?**

   ```java
   public class TestMain {
       public static void main(String[] args) {
           System.out.println("Hello, Java!");
       }
   }
   ```

   a) Hello, Java!  
   b) Eroare de compilare  
   c) NullPointerException  
   d) JVM nu poate executa acest cod

5. **Putem avea mai multe metode `main` într-o clasă?**  
   a) Da, dacă au parametri diferiți (overloading)  
   b) Nu, Java permite doar o singură metodă `main`  
   c) Da, dar doar dacă sunt `private`  
   d) Da, dacă sunt în clase diferite

6. **Ce va afișa următorul cod?**

   ```java
   public class OverloadMain {
       public static void main(String[] args) {
           System.out.println("Main cu parametru String[]");
       }
       public static void main(int args) {
           System.out.println("Main cu parametru int");
       }
   }
   ```

   a) Main cu parametru String[]  
   b) Main cu parametru int  
   c) Eroare de compilare  
   d) JVM va apela automat metoda `main(int args)`

7. **Ce tip de parametru primește metoda `main`?**  
   a) `String`  
   b) `String[]`  
   c) `char[]`  
   d) `Object[]`

8. **Ce se întâmplă dacă schimbăm `String[] args` cu `String args[]` în metoda `main`?**  
   a) Programul nu va compila  
   b) Programul va rula fără probleme  
   c) JVM nu va putea găsi metoda `main`  
   d) Va apărea o eroare de execuție

9. **Ce va afișa următorul cod?**

   ```java
   public class MainArgs {
       public static void main(String[] args) {
           System.out.println("Primul argument: " + args[0]);
       }
   }
   ```

   Dacă executăm programul cu `java MainArgs Hello`, ce se va afișa?  
   a) Primul argument: Hello  
   b) Primul argument: null  
   c) Eroare la execuție (ArrayIndexOutOfBoundsException)  
   d) JVM ignoră argumentele

10. **Este posibilă apelarea metodei `main` din altă metodă a aceleiași clase?**  
    a) Da, ca orice altă metodă statică  
    b) Nu, metoda `main` este specială și nu poate fi apelată manual  
    c) Da, dar doar dacă îi trecem un argument valid  
    d) Nu, JVM gestionează apelul metodei `main`

11. **Ce va afișa următorul cod?**

    ```java
    public class RecursiveMain {
        public static void main(String[] args) {
            System.out.println("Apel Recursiv!");
            main(args);
        }
    }
    ```

    a) Apel Recursiv! (infinit)  
    b) Eroare de compilare  
    c) Apel Recursiv! (de câteva ori, apoi StackOverflowError)  
    d) JVM va preveni execuția recursivă

12. **Putem returna o valoare din metoda `main`?**  
    a) Da, dacă schimbăm `void` cu `int`  
    b) Nu, metoda `main` trebuie să fie `void`  
    c) Da, dar doar în metode statice  
    d) Da, dar trebuie apelată din altă metodă

13. **Putem avea metoda `main` cu un alt modificator de acces decât `public`?**  
    a) Da, `protected` și `private` sunt permise  
    b) Nu, JVM caută doar metode `public`  
    c) Da, dar nu va fi apelată automat  
    d) Nu, metoda `main` trebuie să fie `public static void`

14. **Ce va afișa următorul cod?**

    ```java
    public class HiddenMain {
        private static void main(String[] args) {
            System.out.println("Metoda main este privată.");
        }
    }
    ```

    a) Metoda main este privată.  
    b) Eroare de compilare  
    c) JVM va găsi și executa metoda `main`  
    d) JVM va ignora metoda `main`

15. **Ce se întâmplă dacă metoda `main` nu este definită într-un program Java?**  
    a) JVM va căuta altă metodă pentru a începe execuția  
    b) Programul nu va compila  
    c) JVM va genera o eroare `NoSuchMethodError`  
    d) Programul va rula fără probleme

16. **Ce diferență există între `String[] args` și `String... args` în metoda `main`?**  
    a) `String... args` permite un număr variabil de argumente  
    b) `String[] args` permite doar un singur argument  
    c) Nu există nicio diferență  
    d) `String... args` nu este permis în metoda `main`

17. **Putem folosi un alt nume pentru metoda `main`?**  
    a) Da, dar JVM nu o va recunoaște  
    b) Da, dacă folosim `@Override`  
    c) Nu, metoda `main` trebuie să fie exact `main`  
    d) Da, dar doar în clase abstracte

18. **Ce se întâmplă dacă metoda `main` este declarată fără `public`?**  
    a) JVM va genera o eroare `NoSuchMethodError`  
    b) Programul va rula fără probleme  
    c) JVM va încerca să o apeleze din altă clasă  
    d) JVM va ignora metoda `main`

19. **Putem declara metoda `main` într-o clasă abstractă?**  
    a) Da, și poate fi apelată de JVM  
    b) Nu, clasele abstracte nu pot avea metode `main`  
    c) Da, dar trebuie implementată în subclase  
    d) Da, dar nu poate fi executată direct

20. **Ce va afișa următorul cod?**

    ```java
    public class MainExperiment {
        static {
            System.out.println("Bloc static executat!");
        }
        public static void main(String[] args) {
            System.out.println("Metoda main executată!");
        }
    }
    ```

    a) Bloc static executat!  
     Metoda main executată!  
    b) Metoda main executată!  
     Bloc static executat!  
    c) Eroare de compilare  
    d) JVM ignoră blocurile statice