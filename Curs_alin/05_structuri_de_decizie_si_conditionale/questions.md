### Întrebări if else

1. **Ce reprezintă instrucțiunea `if-else` în Java?**  
   a) O structură de control pentru bucle  
   b) O declarație de variabilă  
   c) O structură de decizie care execută codul în funcție de o condiție  
   d) O metodă de inițializare a obiectelor

2. **Ce va afișa următorul cod?**

   ```java
   public class Test {
       public static void main(String[] args) {
           int x = 5;
           if (x > 3) {
               System.out.println("Mai mare decât 3");
           } else {
               System.out.println("Mai mic sau egal cu 3");
           }
       }
   }
   ```

   a) Mai mare decât 3  
   b) Mai mic sau egal cu 3  
   c) NullPointerException  
   d) Eroare de compilare

3. **Ce se întâmplă dacă `if` nu este urmat de un `else`?**  
   a) Va apărea o eroare de compilare  
   b) Codul va funcționa, dar `else` este obligatoriu  
   c) Codul va funcționa normal, `else` este opțional  
   d) Programul se va opri imediat după `if`

4. **Ce va afișa următorul cod?**

   ```java
   public class Test {
       public static void main(String[] args) {
           int num = 10;
           if (num < 5)
               System.out.println("Mai mic decât 5");
               System.out.println("Această linie se execută mereu!");
       }
   }
   ```

   a) Mai mic decât 5  
   b) Această linie se execută mereu!  
   c) Ambele mesaje  
   d) Eroare de compilare

5. **Cum se scrie corect un `if-else` cu mai multe condiții?**  
   a) `if (x > 0) else (x < 0)`  
   b) `if (x > 0) { } else if (x < 0) { } else { }`  
   c) `if (x > 0) { } else (x < 0) { }`  
   d) `if-else (x > 0) { }`

6. **Ce va afișa următorul cod?**

   ```java
   public class Test {
       public static void main(String[] args) {
           int a = 3, b = 5;
           if (a > b)
               System.out.println("A este mai mare");
           else if (a < b)
               System.out.println("B este mai mare");
           else
               System.out.println("Sunt egale");
       }
   }
   ```

   a) A este mai mare  
   b) B este mai mare  
   c) Sunt egale  
   d) NullPointerException

7. **Ce se întâmplă dacă folosim `else if` fără `if` înainte?**  
   a) Va apărea o eroare de compilare  
   b) Programul va ignora `else if`  
   c) `else if` devine automat un `switch-case`  
   d) Programul va compila, dar se va comporta imprevizibil

8. **Cum poate fi folosit `if-else` pentru a verifica mai multe condiții?**  
   a) Prin utilizarea `else if` pentru condiții multiple  
   b) Prin scrierea mai multor `if` separate  
   c) Prin înlocuirea `if-else` cu un `for`  
   d) `if-else` nu permite verificarea mai multor condiții

9. **Ce va afișa următorul cod?**

   ```java
   public class Test {
       public static void main(String[] args) {
           int x = 10;
           if (x < 0)
               System.out.println("Negativ");
           else if (x > 0)
               System.out.println("Pozitiv");
           else
               System.out.println("Zero");
       }
   }
   ```

   a) Negativ  
   b) Pozitiv  
   c) Zero  
   d) NullPointerException

10. **Ce simbol logic trebuie folosit pentru a verifica două condiții simultan într-un `if`?**  
    a) `&&`  
    b) `||`  
    c) `==`  
    d) `!=`

11. **Cum putem verifica dacă un număr este par folosind `if-else`?**  
    a) `if (num % 2 == 0)`  
    b) `if (num / 2 == 1)`  
    c) `if (num + 2 == 0)`  
    d) `if (num == 2)`

12. **Ce va afișa următorul cod?**

    ```java
    public class Test {
        public static void main(String[] args) {
            int x = 4;
            if (x % 2 == 0)
                System.out.println("Par");
            else
                System.out.println("Impar");
        }
    }
    ```

    a) Par  
    b) Impar  
    c) Eroare de compilare  
    d) NullPointerException

13. **Care dintre următoarele este un exemplu corect de `if-else` imbricat?**  
    a) `if (x > 0) { if (x < 10) { System.out.println("OK"); } }`  
    b) `if (x > 0) else { if (x < 10) }`  
    c) `if (x > 0) && (x < 10) { }`  
    d) `if (x > 0) then { if (x < 10) { } }`

14. **Ce caracter poate fi folosit pentru a scrie o expresie `if-else` într-o singură linie?**  
    a) `? :`  
    b) `->`  
    c) `==`  
    d) `!!`

15. **Cum putem verifica dacă o variabilă `x` NU este egală cu 5 într-un `if`?**  
    a) `if (x != 5)`  
    b) `if (x == 5)`  
    c) `if (!x)`  
    d) `if (x <> 5)`

16. **Ce se întâmplă dacă scriem `if (true) { } else { }`?**  
    a) Doar blocul `if` se va executa  
    b) Doar blocul `else` se va executa  
    c) Ambii vor fi ignorați  
    d) Va apărea o eroare de compilare

17. **Ce va afișa următorul cod?**

    ```java
    public class Test {
        public static void main(String[] args) {
            boolean flag = false;
            if (!flag)
                System.out.println("False condition met");
            else
                System.out.println("True condition met");
        }
    }
    ```

    a) False condition met  
    b) True condition met  
    c) NullPointerException  
    d) Eroare de compilare

18. **Care este alternativa la `if-else` pentru verificări multiple de egalitate?**  
    a) `switch-case`  
    b) `for`  
    c) `while`  
    d) `do-while`

19. **Ce operator poate înlocui `if-else` pentru atribuiri simple?**  
    a) `? :`  
    b) `->`  
    c) `@Override`  
    d) `&&`

20. **Ce instrucțiune poate fi folosită în loc de `else` pentru a opri execuția?**  
    a) `break`  
    b) `return`  
    c) `continue`  
    d) `switch`

### Întrebări cu while

1. **Ce reprezintă instrucțiunea `while` în Java?**  
   a) O structură de control utilizată pentru a repeta o secvență de cod atâta timp cât o condiție este adevărată  
   b) O instrucțiune de atribuire  
   c) O metodă care inițializează variabile  
   d) Un operator logic

2. **Ce va afișa următorul cod?**

   ```java
   public class Test {
       public static void main(String[] args) {
           int x = 0;
           while (x < 3) {
               System.out.println(x);
               x++;
           }
       }
   }
   ```

   a) 0 1 2  
   b) 1 2 3  
   c) 0 1 2 3  
   d) Eroare de compilare

3. **Ce se întâmplă dacă condiția `while` nu devine niciodată `false`?**  
   a) Se va produce o eroare de compilare  
   b) Programul va intra într-o buclă infinită  
   c) JVM va opri automat execuția după câteva repetări  
   d) Programul nu va rula

4. **Ce va afișa următorul cod?**

   ```java
   public class Test {
       public static void main(String[] args) {
           int num = 5;
           while (num > 0) {
               System.out.print(num + " ");
               num--;
           }
       }
   }
   ```

   a) 5 4 3 2 1  
   b) 1 2 3 4 5  
   c) 4 3 2 1 0  
   d) NullPointerException

5. **Care este diferența dintre `while` și `do-while`?**  
   a) `while` verifică condiția înainte de execuție, `do-while` după execuție  
   b) `do-while` verifică condiția înainte, `while` după  
   c) Ambele funcționează identic  
   d) `while` este utilizat doar pentru structuri recursive

6. **Cum putem ieși dintr-o buclă `while` în mod forțat?**  
   a) Folosind `return`  
   b) Folosind `break`  
   c) Folosind `continue`  
   d) Nu putem opri o buclă `while`

7. **Ce simbol logic trebuie folosit pentru a verifica două condiții simultan într-un `while`?**  
   a) `&&`  
   b) `||`  
   c) `==`  
   d) `!=`

8. **Ce se întâmplă dacă folosim `continue` într-un `while`?**  
   a) Se întrerupe complet bucla  
   b) Se sare la următoarea iterație  
   c) Se termină execuția metodei  
   d) Programul se oprește

9. **Ce se întâmplă dacă uităm să incrementăm variabila de control într-un `while`?**  
   a) Se creează o buclă infinită  
   b) Programul va opri execuția  
   c) JVM va detecta automat eroarea  
   d) Programul va rula doar o singură dată

10. **Cum putem implementa un `while` infinit?**  
    a) `while (true) { }`  
    b) `while (false) { }`  
    c) `while (x == 0) { }`  
    d) `while (-1) { }`

### Întrebări cu for

1. **Ce reprezintă instrucțiunea `for` în Java?**  
   a) O structură de control utilizată pentru a repeta o secvență de cod un număr determinat de ori  
   b) O instrucțiune de atribuire  
   c) O metodă care inițializează variabile  
   d) Un operator logic

2. **Care este sintaxa corectă a unei bucle `for`?**  
   a) `for (initializare; condiție; incrementare) { }`  
   b) `for {initializare; condiție; incrementare}`  
   c) `for [initializare; condiție; incrementare]`  
   d) `for (condiție; incrementare; initializare) { }`

3. **Ce va afișa următorul cod?**

   ```java
   public class Test {
       public static void main(String[] args) {
           for (int i = 0; i < 3; i++) {
               System.out.println(i);
           }
       }
   }
   ```

   a) 0 1 2  
   b) 1 2 3  
   c) 0 1 2 3  
   d) Eroare de compilare

4. **Ce se întâmplă dacă omitem condiția într-o buclă `for`?**  
   a) Programul va intra într-o buclă infinită  
   b) Se va produce o eroare de compilare  
   c) Bucla nu se va executa  
   d) Codul va rula normal, dar doar o singură dată

5. **Ce va afișa următorul cod?**

   ```java
   public class Test {
       public static void main(String[] args) {
           for (int i = 5; i > 0; i--) {
               System.out.print(i + " ");
           }
       }
   }
   ```

   a) 5 4 3 2 1  
   b) 1 2 3 4 5  
   c) 4 3 2 1 0  
   d) NullPointerException

6. **Cum putem ieși dintr-o buclă `for` în mod forțat?**  
   a) Folosind `return`  
   b) Folosind `break`  
   c) Folosind `continue`  
   d) Nu putem opri o buclă `for`

7. **Ce se întâmplă dacă folosim `continue` într-o buclă `for`?**  
   a) Se întrerupe complet bucla  
   b) Se sare la următoarea iterație  
   c) Se termină execuția metodei  
   d) Programul se oprește

8. **Ce va afișa următorul cod?**

   ```java
   public class Test {
       public static void main(String[] args) {
           for (int i = 0; i < 5; i++) {
               if (i == 3) break;
               System.out.print(i + " ");
           }
       }
   }
   ```

   a) 0 1 2  
   b) 0 1 2 3 4  
   c) 1 2 3  
   d) Eroare de compilare

9. **Cum putem implementa o buclă `for` infinită?**  
   a) `for (;;) { }`  
   b) `for (int i = 0; i < 0; i++) { }`  
   c) `for (i == 0; i < 10; i++) { }`  
   d) `for (int i = 0; i < Integer.MAX_VALUE; i++) { }`

10. **Ce va afișa următorul cod?**

    ```java
    public class Test {
        public static void main(String[] args) {
            for (int i = 2; i <= 10; i *= 2) {
                System.out.print(i + " ");
            }
        }
    }
    ```

    a) 2 4 8  
    b) 2 4 8 16  
    c) 2 4 8 10  
    d) Eroare de compilare

11. **Ce este un `for-each` în Java?**  
    a) O variație a `for` folosită pentru iterarea colecțiilor  
    b) Un tip special de variabilă  
    c) O instrucțiune pentru a crea liste  
    d) Un mecanism de optimizare a memoriei

12. **Ce va afișa următorul cod?**

    ```java
    public class Test {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4};
            for (int num : numbers) {
                System.out.print(num + " ");
            }
        }
    }
    ```

    a) 1 2 3 4  
    b) 4 3 2 1  
    c) 0 1 2 3  
    d) Eroare de compilare

13. **Când este utilizată o buclă `for` în loc de `while`?**  
    a) Când numărul exact de iterații este cunoscut  
    b) Când avem o variabilă statică  
    c) Când trebuie să creăm un program recursiv  
    d) Când vrem să iterăm doar de două ori

14. **Care dintre următoarele este adevărat despre bucla `for`?**  
    a) Este ideală pentru situațiile în care se cunoaște numărul exact de iterații  
    b) Se execută întotdeauna cel puțin o dată  
    c) Poate avea doar trei componente în antet  
    d) Poate fi folosită doar cu tipul `int`

15. **Cum putem implementa un `for` cu mai multe variabile?**  
    a) `for (int i = 0, j = 10; i < j; i++, j--) { }`  
    b) `for (i, j = 0; i < j; i++) { }`  
    c) `for int i = 0; int j = 10; i < j; i++, j-- { }`  
    d) `for ((int i = 0, int j = 10); i < j; i++, j--) { }`

16. **Ce se întâmplă dacă în interiorul unui `for` uităm să incrementăm contorul?**  
    a) Se creează o buclă infinită  
    b) Programul va opri execuția  
    c) JVM va detecta automat eroarea  
    d) Programul va rula doar o singură dată

17. **Ce caracteristică are `for-each` comparativ cu `for` clasic?**  
    a) Este mai simplu și mai sigur pentru iterarea colecțiilor  
    b) Nu poate fi folosit cu liste  
    c) Poate avea doar un singur element  
    d) Poate funcționa doar cu tipul `String`

18. **Cum putem inversa ordinea de parcurgere într-un `for`?**  
    a) `for (int i = n; i >= 0; i--) { }`  
    b) `for (int i = n; i++; i > 0) { }`  
    c) `for (int i = n; i--; i < 0) { }`  
    d) `for (int i = 0; i < n; --i) { }`

19. **Ce instrucțiune poate fi folosită pentru a sări peste o iterație într-un `for`?**  
    a) `continue`  
    b) `break`  
    c) `return`  
    d) `exit`

20. **Ce se întâmplă dacă omitem toate cele trei componente ale unui `for`?**  
    a) Se creează o buclă infinită  
    b) Programul nu va compila  
    c) Se va produce o eroare de execuție  
    d) Nu va rula niciodată