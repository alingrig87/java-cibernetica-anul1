package Seminarii;

public class Seminar3 {

    public static int gasesteMinimul(int a, int b) {
        if(a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static void afiseazaDeLa1PanaLaN(int n) {
        int i = 1;
        while(i <= n) {
            System.out.println(i);
            i++;
        }
    }

    public static int sumaCifrelor(int n) {
        int suma = 0;
        
        while(n > 0) {
            int ultimaCifra = n % 10;
            suma += ultimaCifra;
            n = n / 10;
        }

        return suma;
    }

    public static boolean estePrim(int n) {
        int i = 2;
        while(i <= n-1) {
            if(n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void afiseazaTablaInmultirii(int n) {
        int i = 1;
        while(i <= 10) {
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        }
    }

    public static void afiseazaTablaInmultiriiCuFor(int n) {
        for(int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static int factorial(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static int sumaPrimelorNnumere(int n) {
        int suma = 0;
        for(int i = 1; i <= n; i++) {
            suma = suma + i;
        }
        return suma;
    }

    public static void fibo(int n) {
        int a = 0;
        int b = 1;
        while(a <= n) {
            System.out.println(a);
            int suma = a + b;
            a = b;
            b = suma;
        }
    }


    public static boolean estePalindrom(int n) {
        int originalNumber = n;
        int reversedNumber = 0;

        while(n > 0) {
            int ultimaCifra = n % 10;
            reversedNumber = reversedNumber * 10 + ultimaCifra;
            n = n / 10;
        }

        return originalNumber == reversedNumber;
    } 
    
    public static void main(String[] args) {
       System.out.println(estePalindrom(121));
       System.out.println(estePalindrom(123344));
       System.out.println(estePalindrom(1332331));
       System.out.println(estePalindrom(2145412));
       System.out.println(estePalindrom(23432));
       System.out.println(estePalindrom(122343));
       System.out.println(estePalindrom(667788));
    }
}
