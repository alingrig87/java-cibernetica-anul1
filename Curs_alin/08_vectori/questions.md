### Întrebări vectori

1. **Ce este un vector în Java?**  
   a) O colecție de elemente de tip diferit  
   b) O structură de date care stochează elemente de același tip  
   c) O metodă de inițializare a variabilelor  
   d) O clasă specială pentru gestionarea datelor

2. **Cum se declară un vector de întregi în Java?**  
   a) `int[] vec;`  
   b) `vector<int> vec;`  
   c) `int vec();`  
   d) `int vec = new array();`

3. **Cum se alocă memorie pentru un vector în Java?**  
   a) `int[] vec = new int[5];`  
   b) `int vec[5];`  
   c) `array<int> vec = new int();`  
   d) `int vec = new vector[5];`

4. **Ce va afișa următorul cod?**

   ```java
   public class Test {
       public static void main(String[] args) {
           int[] vec = {10, 20, 30, 40};
           System.out.println(vec[2]);
       }
   }
   ```

   a) 10  
   b) 20  
   c) 30  
   d) 40

5. **Care este indexul primului element dintr-un vector în Java?**  
   a) -1  
   b) 0  
   c) 1  
   d) Depinde de tipul vectorului

6. **Ce se întâmplă dacă accesăm un index care depășește dimensiunea vectorului?**  
   a) Programul rulează normal  
   b) Se returnează valoarea `null`  
   c) Apare o eroare `ArrayIndexOutOfBoundsException`  
   d) JVM alocă automat mai multă memorie

7. **Cum putem obține lungimea unui vector?**  
   a) `vec.length()`  
   b) `vec.size()`  
   c) `vec.length`  
   d) `vec.getLength()`

8. **Cum putem inițializa un vector fără a specifica dimensiunea explicit?**  
   a) `int[] vec = new int[] {1, 2, 3, 4};`  
   b) `int[] vec = new int();`  
   c) `int[] vec = int(5);`  
   d) `vector<int> vec = {1, 2, 3, 4};`

9. **Ce metodă putem folosi pentru a sorta un vector în ordine crescătoare?**  
   a) `Arrays.sort(vec);`  
   b) `vec.sort();`  
   c) `sort(vec);`  
   d) `vec.order();`

10. **Ce tip de excepție apare dacă accesăm un index negativ într-un vector?**  
    a) `NullPointerException`  
    b) `ArrayIndexOutOfBoundsException`  
    c) `IllegalArgumentException`  
    d) `IndexOutOfBoundsException`

11. **Cum putem copia conținutul unui vector într-un alt vector?**  
    a) `System.arraycopy(vec1, 0, vec2, 0, vec1.length);`  
    b) `vec2 = vec1.copy();`  
    c) `vec2 = new int[vec1];`  
    d) `vec2.clone(vec1);`

12. **Cum verificăm dacă două vectori sunt identici?**  
    a) `Arrays.equals(vec1, vec2)`  
    b) `vec1 == vec2`  
    c) `vec1.equals(vec2)`  
    d) `vec1.compare(vec2)`

13. **Ce valoare au elementele unui vector de `int` după alocare?**  
    a) `0`  
    b) `null`  
    c) `garbage value`  
    d) `-1`

14. **Cum putem umple un vector cu o valoare specifică?**  
    a) `Arrays.fill(vec, 5);`  
    b) `vec.fill(5);`  
    c) `vec.assign(5);`  
    d) `fill(vec, 5);`

15. **Cum putem găsi elementul maxim dintr-un vector?**  
    a) Iterăm prin vector și comparăm fiecare element  
    b) `vec.max();`  
    c) `Arrays.max(vec);`  
    d) `Collections.max(vec);`

16. **Cum putem inversa elementele unui vector?**  
    a) `Collections.reverse(Arrays.asList(vec));`  
    b) `Arrays.reverse(vec);`  
    c) `vec.reverse();`  
    d) `reverse(vec);`

17. **Care este scopul metodei `clone()` pentru vectori?**  
    a) Creează o copie independentă a vectorului  
    b) Mută conținutul vectorului într-un nou vector  
    c) Returnează un `String` cu elementele vectorului  
    d) Șterge conținutul vectorului

18. **Ce se întâmplă dacă încercăm să creăm un vector de dimensiune negativă?**  
    a) Apare `NegativeArraySizeException`  
    b) JVM creează un vector gol  
    c) Se alocă automat dimensiunea `0`  
    d) Programul rulează fără probleme

19. **Cum putem găsi suma elementelor unui vector?**  
    a) `Arrays.sum(vec);`  
    b) Iterăm prin vector și adunăm elementele  
    c) `vec.total();`  
    d) `Collections.sum(vec);`

20. **Ce se întâmplă dacă declarăm un vector de tip `final`?**  
    a) Nu putem schimba elementele sale  
    b) Nu putem schimba referința sa către alt vector  
    c) Vectorul devine constant  
    d) Nu putem adăuga elemente noi

21. **Ce metodă este utilizată pentru a converti un vector într-un `String`?**  
    a) `Arrays.toString(vec);`  
    b) `vec.toString();`  
    c) `String.valueOf(vec);`  
    d) `vec.toText();`

22. **Cum putem compara doi vectori lexicografic?**  
    a) `Arrays.compare(vec1, vec2);`  
    b) `vec1.compare(vec2);`  
    c) `vec1 == vec2;`  
    d) `Collections.compare(vec1, vec2);`

23. **Care este scopul metodei `fill()` din clasa `Arrays`?**  
    a) Umple vectorul cu o anumită valoare  
    b) Resetează toate elementele vectorului  
    c) Umple vectorul cu valori aleatorii  
    d) Înlătură valorile duplicate

24. **Cum putem schimba dimensiunea unui vector?**  
    a) Vectorii nu își pot schimba dimensiunea  
    b) `vec.resize(10);`  
    c) `Arrays.resize(vec, 10);`  
    d) `vec.setSize(10);`

25. **Ce tip de date poate fi stocat într-un vector generic (`Object[]`)?**  
    a) Orice tip de date  
    b) Doar `String`  
    c) Doar `int`  
    d) Doar `float`