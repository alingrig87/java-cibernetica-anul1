
### Transformările din baza 10 în baza 2, baza 8 și baza 16 și invers explicate simplu

---

### 1. **Ce sunt bazele numerice?**

O **bază numerică** este un sistem de reprezentare a numerelor folosind un set fix de simboluri. 
- **Baza 10** este sistemul pe care îl folosim zi de zi, numărând de la 0 la 9.
- **Baza 2** este folosită de calculatoare, având doar cifrele 0 și 1.
- **Baza 8** folosește cifrele de la 0 la 7.
- **Baza 16** include cifrele de la 0 la 9 și literele A, B, C, D, E, F pentru a reprezenta valorile 10-15.

---

### 2. **Transformarea din baza 10 în baza 2**

Pentru a transforma un număr din baza 10 în baza 2, folosim **împărțirea succesivă la 2** și notăm resturile.

#### Exemplu:
Transformăm numărul **23** din baza 10 în baza 2.

1. Împărți 23 la 2: 23 ÷ 2 = 11 și rest 1.
2. Împărți 11 la 2: 11 ÷ 2 = 5 și rest 1.
3. Împărți 5 la 2: 5 ÷ 2 = 2 și rest 1.
4. Împărți 2 la 2: 2 ÷ 2 = 1 și rest 0.
5. Împărți 1 la 2: 1 ÷ 2 = 0 și rest 1.

Scriem resturile de la ultimul către primul: **23 (baza 10) = 10111 (baza 2)**.

---

### 3. **Transformarea din baza 2 în baza 10**

Pentru a transforma un număr din baza 2 în baza 10, **mulți fiecare cifră cu puterea corespunzătoare a lui 2** și adună rezultatele.

#### Exemplu:
Transformăm **10111** (baza 2) în baza 10.

1. Scriem cifrele pe pozițiile lor (de la dreapta la stânga):
   - 1 × 2^0 = 1
   - 1 × 2^1 = 2
   - 1 × 2^2 = 4
   - 0 × 2^3 = 0
   - 1 × 2^4 = 16

2. Adună rezultatele: 16 + 0 + 4 + 2 + 1 = **23 (baza 10)**.

---

### 4. **Transformarea din baza 10 în baza 8**

Pentru a transforma din baza 10 în baza 8, folosim **împărțirea succesivă la 8**.

#### Exemplu:
Transformăm numărul **156** din baza 10 în baza 8.

1. Împărți 156 la 8: 156 ÷ 8 = 19 și rest 4.
2. Împărți 19 la 8: 19 ÷ 8 = 2 și rest 3.
3. Împărți 2 la 8: 2 ÷ 8 = 0 și rest 2.

Scriem resturile de la ultimul către primul: **156 (baza 10) = 234 (baza 8)**.

---

### 5. **Transformarea din baza 8 în baza 10**

Pentru a transforma un număr din baza 8 în baza 10, **mulți fiecare cifră cu puterea corespunzătoare a lui 8** și adună rezultatele.

#### Exemplu:
Transformăm **234** (baza 8) în baza 10.

1. Scriem cifrele pe pozițiile lor (de la dreapta la stânga):
   - 4 × 8^0 = 4
   - 3 × 8^1 = 24
   - 2 × 8^2 = 128

2. Adună rezultatele: 128 + 24 + 4 = **156 (baza 10)**.

---

### 6. **Transformarea din baza 10 în baza 16**

Pentru a transforma un număr din baza 10 în baza 16, folosim **împărțirea succesivă la 16**.

#### Exemplu:
Transformăm numărul **255** din baza 10 în baza 16.

1. Împărți 255 la 16: 255 ÷ 16 = 15 și rest 15 (15 = F).
2. Împărți 15 la 16: 15 ÷ 16 = 0 și rest 15 (15 = F).

Scriem resturile de la ultimul către primul: **255 (baza 10) = FF (baza 16)**.

---

### 7. **Transformarea din baza 16 în baza 10**

Pentru a transforma un număr din baza 16 în baza 10, **mulți fiecare cifră (sau literă) cu puterea corespunzătoare a lui 16** și adună rezultatele.

#### Exemplu:
Transformăm **FF** (baza 16) în baza 10.

1. Litera F reprezintă 15.
2. Scriem cifrele pe pozițiile lor (de la dreapta la stânga):
   - 15 × 16^0 = 15
   - 15 × 16^1 = 240

3. Adună rezultatele: 240 + 15 = **255 (baza 10)**.

---

### 8. **Transformări intermediare între baze**

Uneori, putem trece mai ușor dintr-o bază în alta folosind baza 10 ca bază intermediară. De exemplu:
- Pentru a transforma din baza 2 în baza 16, mai întâi convertim baza 2 în baza 10, apoi baza 10 în baza 16.

#### Exemplu intermediar:
Transformăm **110111** (baza 2) în baza 16.
1. Convertim mai întâi în baza 10: 
   - 1 × 2^5 + 1 × 2^4 + 0 × 2^3 + 1 × 2^2 + 1 × 2^1 + 1 × 2^0 = 55 (baza 10).
2. Convertim 55 din baza 10 în baza 16:
   - 55 ÷ 16 = 3 rest 7.
3. Rezultatul este **37 (baza 16)**.

---

