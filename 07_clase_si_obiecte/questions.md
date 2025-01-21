# Întrebări despre crearea obiectelor în Java

1. **Cum se numește procesul de creare a unui obiect în Java?**  
   a) Instanțiere  
   b) Derivare  
   c) Compilare  
   d) Moștenire

2. **Care este metoda folosită pentru a crea un obiect al unei clase în Java?**  
   a) new  
   b) create  
   c) instance  
   d) build

3. **Ce element al programării Java definește șablonul pentru crearea obiectelor?**  
   a) Pachetul (package)  
   b) Clasa  
   c) Interfața (interface)  
   d) JVM

4. **Ce înseamnă constructor în contextul instanțierii unui obiect?**  
   a) Un tip special de metodă folosit pentru inițializarea unui obiect  
   b) O clasă dedicată pentru manipularea datelor  
   c) Un atribut al clasei pentru accesarea metodelor  
   d) Un sistem de moștenire pentru clase

5. **Care dintre următoarele opțiuni este obligatorie pentru instanțierea unui obiect în Java?**  
   a) Declarația unei interfețe  
   b) Definirea unui constructor în clasă  
   c) Utilizarea clasei abstracte  
   d) Importul bibliotecilor externe

6. **Cum se accesează metoda sau atributul unui obiect după instanțiere?**  
   a) Folosind simbolul „->”  
   b) Folosind simbolul „::”  
   c) Folosind simbolul „.”  
   d) Folosind simbolul „&&”

7. **Cum este legat procesul de instanțiere de memoria programului?**  
   a) Obiectele instanțiate sunt alocate în registrul CPU  
   b) Obiectele instanțiate sunt stocate în heap  
   c) Obiectele instanțiate sunt create în cache-ul procesorului  
   d) Obiectele instanțiate sunt alocate exclusiv în stack

8. **Ce se întâmplă dacă o clasă nu definește un constructor?**  
   a) Compilatorul generează o eroare  
   b) JVM generează automat un constructor implicit  
   c) Clasa devine abstractă automat  
   d) Clasa nu poate fi utilizată pentru instanțiere

9. **Care este relația dintre clase și obiecte în Java?**  
   a) Clasele sunt obiecte reutilizabile  
   b) Obiectele definesc șabloanele pentru clase  
   c) Clasele sunt șabloane pentru crearea obiectelor  
   d) Clasele și obiectele sunt complet independente

10. **Ce metodă specială este apelată implicit în timpul instanțierii?**  
    a) main()  
    b) constructorul clasei  
    c) toString()  
    d) init()

### Intrebari despre operatorul new

1. **Ce operator este utilizat pentru a crea o instanță a unei clase în Java?**  
   a) create  
   b) new  
   c) init  
   d) make

2. **Ce se întâmplă dacă utilizați operatorul `new` pentru o clasă fără constructor definit?**  
   a) Apare o eroare de compilare  
   b) JVM generează automat un constructor implicit  
   c) Operatorul `new` nu poate fi utilizat  
   d) Obiectul este creat, dar neinițializat

3. **Care dintre următoarele expresii utilizează corect operatorul `new`?**  
   a) `MyClass obj = new MyClass();`  
   b) `MyClass obj = create MyClass();`  
   c) `MyClass obj = make MyClass();`  
   d) `MyClass obj = init MyClass();`

4. **Ce se returnează atunci când se folosește operatorul `new`?**  
   a) Un pointer la obiectul creat  
   b) O referință la obiectul creat  
   c) O copie a clasei  
   d) Nimic, deoarece operatorul `new` nu returnează valori

5. **Poate operatorul `new` să fie utilizat pentru tipurile primitive?**  
   a) Da, pentru toate tipurile primitive  
   b) Nu, doar pentru clase  
   c) Da, dar doar cu wrapper classes  
   d) Nu, doar cu structuri de date

6. **Care este scopul operatorului `new` în Java?**  
   a) Alocarea memoriei pentru un obiect  
   b) Alocarea memoriei pentru metode  
   c) Crearea unei copii a unei clase  
   d) Distrugerea unui obiect

7. **Ce metodă este apelată automat după utilizarea operatorului `new`?**  
   a) finalize()  
   b) constructorul clasei  
   c) init()  
   d) main()

### Întrebări mostenire

1. **Ce concept din programarea orientată pe obiecte permite unei subclase să utilizeze metodele și atributele unei clase părinte?**  
   a) Polimorfism  
   b) Moștenire  
   c) Încapsulare  
   d) Abstracție

2. **Care este scopul cuvântului cheie `super` în contextul moștenirii?**  
   a) Să creeze o nouă clasă părinte  
   b) Să acceseze constructorul sau metodele clasei părinte  
   c) Să împiedice moștenirea clasei părinte  
   d) Să înlocuiască polimorfismul din subclasă

3. **Ce se întâmplă dacă o subclasă redefinește o metodă din clasa părinte?**  
   a) Metoda din clasa părinte este ștearsă automat  
   b) Subclasa folosește doar metoda redefinită (overriding)  
   c) Subclasa folosește ambele metode în mod automat  
   d) Apare o eroare de compilare

4. **Cum este marcată o clasă pentru a nu putea fi moștenită?**  
   a) Cu cuvântul cheie `static`  
   b) Cu cuvântul cheie `final`  
   c) Cu cuvântul cheie `abstract`  
   d) Nu există o modalitate de a preveni moștenirea

5. **Ce metodă este utilizată frecvent în constructorul unei subclase pentru a apela constructorul clasei părinte?**  
   a) parent()  
   b) super()  
   c) this()  
   d) init()

6. **Poate o clasă să extindă mai multe clase părinte în Java?**  
   a) Da, dar doar utilizând `implements`  
   b) Nu, Java suportă doar moștenirea simplă  
   c) Da, prin utilizarea cuvântului cheie `extends`  
   d) Nu, dar poate folosi interfețe pentru multiple moșteniri

7. **Ce cuvânt cheie este folosit pentru a crea o relație de moștenire între două clase în Java?**  
   a) extends  
   b) implements  
   c) inherits  
   d) super

8. **Ce metodă din clasa `Object` este moștenită automat de toate clasele în Java?**  
   a) clone()  
   b) hashCode()  
   c) toString()  
   d) Toate cele de mai sus

9. **Ce este overriding în contextul moștenirii?**  
   a) Crearea unei noi metode cu același nume într-o clasă fără moștenire  
   b) Modificarea unei metode a clasei părinte într-o subclasă  
   c) Schimbarea tipului de returnare al unei metode moștenite  
   d) Folosirea unei metode statice într-o subclasă

10. **Cum se poate apela metoda originală din clasa părinte, dacă aceasta a fost redefinită într-o subclasă?**  
    a) Cu ajutorul cuvântului cheie `parent`  
    b) Cu ajutorul cuvântului cheie `this`  
    c) Cu ajutorul cuvântului cheie `super`  
    d) Metoda originală nu poate fi apelată

### Întrebări despre constructori

1. **Ce este un constructor în Java?**  
   a) O metodă utilizată pentru a șterge obiectele  
   b) O metodă specială utilizată pentru a inițializa obiectele  
   c) O metodă statică utilizată pentru a apela alte metode  
   d) O funcție care returnează o instanță nouă

2. **Cum se numește un constructor implicit generat de compilator?**  
   a) Constructor personalizat  
   b) Constructor parametric  
   c) Constructor default  
   d) Constructor abstract

3. **Care este scopul utilizării constructorilor cu parametri?**  
   a) Pentru a inițializa variabilele de instanță cu valori predefinite  
   b) Pentru a crea metode statice  
   c) Pentru a înlocui metodele getter și setter  
   d) Pentru a inițializa variabile locale

4. **Ce va afișa următorul cod?**

   ```java
   public class Test {
       int x;
       Test(int x) {
           this.x = x;
       }
       public static void main(String[] args) {
           Test obj = new Test(10);
           System.out.println(obj.x);
       }
   }
   ```

   a) 0  
   b) 10  
   c) Eroare de compilare  
   d) NullPointerException

5. **Ce este overloading-ul constructorilor?**  
   a) Definirea mai multor clase cu același constructor  
   b) Definirea mai multor constructori într-o clasă, dar cu semnături diferite  
   c) Utilizarea cuvântului cheie `super` într-un constructor  
   d) Refolosirea unui constructor în altă clasă

6. **Ce va afișa următorul cod?**

   ```java
   public class Example {
       Example() {
           System.out.println("Constructor fără parametri");
       }
       Example(int x) {
           System.out.println("Constructor cu parametri: " + x);
       }
       public static void main(String[] args) {
           new Example();
           new Example(5);
       }
   }
   ```

   a) Constructor fără parametri  
    Constructor cu parametri: 5  
   b) Constructor cu parametri: 5  
    Constructor fără parametri  
   c) Constructor fără parametri  
   d) Eroare de compilare

7. **Care dintre următoarele afirmații este adevărată despre constructori?**  
   a) Constructorii pot fi abstracti  
   b) Constructorii pot fi final  
   c) Constructorii nu pot avea tip de returnare  
   d) Constructorii pot fi moșteniți direct de subclase

8. **Ce metodă este apelată implicit în interiorul unui constructor dacă nu este specificată alta?**  
   a) Constructorul clasei părinte prin `super()`  
   b) Metoda `toString()`  
   c) Constructorul clasei prin `this()`  
   d) Metoda `main()`

9. **Care este scopul utilizării `this()` într-un constructor?**  
   a) Să apese constructorul clasei părinte  
   b) Să apeleze un alt constructor din aceeași clasă  
   c) Să inițializeze variabilele statice  
   d) Să returneze o instanță a clasei

10. **Ce se întâmplă dacă definim un constructor privat?**  
    a) Constructorul devine inaccesibil în aceeași clasă  
    b) Clasa nu poate avea instanțe în afara ei  
    c) Constructorul nu poate fi utilizat cu moștenirea  
    d) Nu putem avea constructori privați în Java

### Întrebări despre cuvantul cheie "this"

1. **Ce reprezintă cuvântul cheie `this` în Java?**  
   a) Referința la obiectul curent al clasei  
   b) Referința la clasa părinte  
   c) Referința la o metodă statică  
   d) O referință globală la toate obiectele clasei

2. **Care este scopul utilizării `this` într-un constructor?**  
   a) Pentru a apela metode statice din clasă  
   b) Pentru a apela un alt constructor din aceeași clasă  
   c) Pentru a accesa metodele clasei părinte  
   d) Pentru a inițializa variabilele statice

3. **Ce va afișa următorul cod?**

   ```java
   public class Demo {
       int x;
       Demo(int x) {
           this.x = x;
       }
       void printValue() {
           System.out.println(this.x);
       }
       public static void main(String[] args) {
           Demo obj = new Demo(15);
           obj.printValue();
       }
   }
   ```

   a) 0  
   b) 15  
   c) NullPointerException  
   d) Eroare de compilare

4. **Cum poate `this` fi utilizat pentru a diferenția variabilele de instanță de cele locale?**  
   a) Prin suprascrierea variabilelor locale  
   b) Prin utilizarea explicită a `this` pentru variabilele de instanță  
   c) Nu poate fi utilizat în acest scop  
   d) Prin definirea variabilelor de instanță ca `static`

5. **Ce va afișa următorul cod?**

   ```java
   public class Test {
       int a, b;
       Test(int a, int b) {
           this.a = a;
           this.b = b;
       }
       void display() {
           System.out.println("a: " + this.a + ", b: " + this.b);
       }
       public static void main(String[] args) {
           Test obj = new Test(10, 20);
           obj.display();
       }
   }
   ```

   a) a: 0, b: 0  
   b) a: 10, b: 20  
   c) a: null, b: null  
   d) Eroare de compilare

6. **Ce reprezintă `this` atunci când este utilizat în contextul unei metode de instanță?**  
   a) Referința la o metodă statică  
   b) Referința la instanța curentă a clasei  
   c) Referința la toate obiectele din clasă  
   d) Referința la clasa părinte

7. **Este posibil să transmitem `this` ca parametru unei metode?**  
   a) Nu, pentru că `this` este rezervat pentru constructori  
   b) Da, dar doar în metodele statice  
   c) Da, pentru a transmite referința obiectului curent  
   d) Nu, `this` nu poate fi transmis ca parametru

8. **Ce va afișa următorul cod?**

   ```java
   public class Example {
       void print(Example obj) {
           System.out.println("Metoda apelată cu `this`");
       }
       void call() {
           print(this);
       }
       public static void main(String[] args) {
           Example ex = new Example();
           ex.call();
       }
   }
   ```

   a) Metoda apelată cu `this`  
   b) NullPointerException  
   c) Eroare de compilare  
   d) Nu afișează nimic

9. **Cum poate fi utilizat `this` în cazul metodelor fluente?**  
   a) Prin apeluri succesive ale metodelor care returnează `this`  
   b) Prin utilizarea metodelor statice care accesează `this`  
   c) Prin apeluri recursive în metodele din clasă  
   d) Nu poate fi utilizat în metode fluente

10. **Care dintre următoarele este adevărat despre `this` în Java?**  
    a) Poate fi utilizat în metode statice  
    b) Este utilizat pentru a accesa metodele și variabilele statice ale clasei  
    c) Este o referință la obiectul curent al clasei  
    d) Este utilizat doar pentru apelarea constructorilor

### Întrebări despre polimorfism

1. **Ce permite conceptul de polimorfism în Java?**  
   a) Crearea mai multor clase simultan  
   b) Apelarea metodelor prin referințe de tip clasa părinte  
   c) Extinderea funcționalității constructorilor  
   d) Declanșarea automată a excepțiilor

2. **Ce tip de polimorfism este demonstrat de metodele suprascrise (overriding)?**  
   a) Polimorfism static  
   b) Polimorfism dinamic  
   c) Polimorfism la nivel de operatori  
   d) Polimorfism prin clase interne

3. **Ce va afișa următorul cod?**

   ```java
   class Animal {
       void sound() {
           System.out.println("Animal face sunet");
       }
   }

   class Dog extends Animal {
       void sound() {
           System.out.println("Câinele latră");
       }
   }

   public class TestPolymorphism {
       public static void main(String[] args) {
           Animal a = new Dog();
           a.sound();
       }
   }
   ```

   a) Animal face sunet  
   b) Câinele latră  
   c) Eroare de compilare  
   d) JVM oprește execuția

4. **Ce permite metoda `super` într-un context de polimorfism?**  
   a) Apelarea metodei clasei părinte dintr-o subclasă  
   b) Crearea unui nou obiect al clasei părinte  
   c) Accesarea directă a variabilelor private ale clasei părinte  
   d) Evitarea suprascrierii metodelor din clasele derivate

5. **Ce va afișa următorul cod?**

   ```java
   class Parent {
       void display() {
           System.out.println("Metoda clasei părinte");
       }
   }

   class Child extends Parent {
       void display() {
           super.display();
           System.out.println("Metoda clasei copil");
       }
   }

   public class TestSuper {
       public static void main(String[] args) {
           Parent obj = new Child();
           obj.display();
       }
   }
   ```

   a) Metoda clasei părinte  
   b) Metoda clasei copil  
   c) Metoda clasei părinte  
    Metoda clasei copil  
   d) Eroare de compilare

6. **Ce caracteristică a polimorfismului este demonstrată prin overloading (suprasarcină)?**  
   a) Dinamică  
   b) Statică  
   c) În timp real  
   d) Generativă

7. **Ce va afișa următorul cod?**

   ```java
   class Calculator {
       int add(int a, int b) {
           return a + b;
       }

       double add(double a, double b) {
           return a + b;
       }
   }

   public class TestOverloading {
       public static void main(String[] args) {
           Calculator calc = new Calculator();
           System.out.println(calc.add(2, 3));
           System.out.println(calc.add(2.5, 3.5));
       }
   }
   ```

   a) 5  
    6.0  
   b) 5.0  
    6.0  
   c) Eroare de compilare  
   d) 5  
    Eroare la execuție

8. **Cum se poate implementa polimorfismul prin interfețe?**  
   a) Prin utilizarea cuvântului cheie `extends`  
   b) Prin implementarea mai multor metode cu același nume în clase diferite  
   c) Prin utilizarea cuvântului cheie `implements`  
   d) Prin suprascrierea metodelor private

9. **Ce va afișa următorul cod?**

   ```java
   interface Shape {
       void draw();
   }

   class Circle implements Shape {
       public void draw() {
           System.out.println("Desenez un cerc");
       }
   }

   class Square implements Shape {
       public void draw() {
           System.out.println("Desenez un pătrat");
       }
   }

   public class TestInterface {
       public static void main(String[] args) {
           Shape s1 = new Circle();
           Shape s2 = new Square();
           s1.draw();
           s2.draw();
       }
   }
   ```

   a) Desenez un cerc  
    Desenez un pătrat  
   b) Desenez un pătrat  
    Desenez un cerc  
   c) Eroare de compilare  
   d) Eroare la execuție

10. **Ce tip de polimorfism este suportat de Java în mod implicit?**  
    a) Suprasarcina operatorilor  
    b) Polimorfism static și dinamic  
    c) Polimorfism multiplu fără interfețe  
    d) Polimorfism bazat pe clase anonime

11. **Ce diferență majoră există între polimorfismul static și cel dinamic?**  
    a) Static este determinat la compilare, dinamic la rulare  
    b) Dinamic este determinat la compilare, static la rulare  
    c) Static și dinamic sunt identici în Java  
    d) Static funcționează doar cu metode statice

12. **Ce caracteristică a polimorfismului permite utilizarea unei referințe de tip clasa părinte pentru a apela metode ale clasei copil?**  
    a) Casting explicit  
    b) Moștenire multiplă  
    c) Upcasting  
    d) Constructori cu parametri

13. **Ce va afișa următorul cod?**

    ```java
    class A {
        void show() {
            System.out.println("A");
        }
    }

    class B extends A {
        void show() {
            System.out.println("B");
        }
    }

    public class Main {
        public static void main(String[] args) {
            A obj = new B();
            obj.show();
        }
    }
    ```

    a) A  
    b) B  
    c) Eroare de compilare  
    d) JVM oprește execuția

14. **Cum poate fi prevenită suprascrierea unei metode într-o subclasă?**  
    a) Folosind cuvântul cheie `private`  
    b) Folosind cuvântul cheie `final`  
    c) Folosind cuvântul cheie `protected`  
    d) Nu poate fi prevenită

15. **Ce permite polimorfismul să facă într-o aplicație complexă?**  
    a) Crearea de metode generice reutilizabile  
    b) Organizarea mai eficientă a spațiului de memorie  
    c) Evitarea utilizării moștenirii  
    d) Generarea automată a codului

16. **Ce este upcasting-ul în polimorfism?**  
    a) Convertirea unui obiect de tip clasă copil într-un obiect de tip clasă părinte  
    b) Crearea unei noi instanțe a clasei părinte  
    c) Convertirea unui obiect de tip clasă părinte într-un obiect de tip clasă copil  
    d) Eliminarea metodelor suprascrise

17. **Ce este binding-ul în Java?**  
    a) Asocierea unui tip de date cu o metodă  
    b) Asocierea unei metode apelate cu implementarea sa reală  
    c) Crearea de metode suprascrise cu parametri diferiți  
    d) O tehnică utilizată doar pentru clasele abstracte

18. **Ce tip de binding este folosit pentru metodele suprascrise?**  
    a) Static  
    b) Dinamic  
    c) Temporar  
    d) Permanent

19. **Ce condiții trebuie să îndeplinească o metodă suprascrisă?**  
    a) Să aibă același nume și parametri ca metoda din clasa părinte  
    b) Să aibă un modificator de acces mai restrictiv  
    c) Să fie definită doar în clase finale  
    d) Să returneze un tip de date diferit față de metoda părinte

20. **Ce va afișa următorul cod?**

    ```java
    class Animal {
        void sound() {
            System.out.println("Animal face sunet");
        }
    }

    class Cat extends Animal {
        void sound() {
            System.out.println("Pisica miaună");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Animal a = new Cat();
            a.sound();
        }
    }
    ```

    a) Animal face sunet  
    b) Pisica miaună  
    c) Eroare de compilare  
    d) JVM oprește execuția
