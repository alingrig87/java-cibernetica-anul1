public class Test {
  public static void main(String[] args) {
    int min = Integer.MIN_VALUE;
    System.out.println(min - 1);
    int max = Integer.MAX_VALUE;
    System.out.println(max);

    byte b = 127;
    System.out.println((byte)(b + 100));
    char dolar = '$';
    System.out.println(dolar);
    char euro = '\u20ac';
    System.out.println(euro);
    char smile = '\uf600';
    System.out.println(smile); // to do, check why the smile in not shown in vs code terminal

    String str = "Ana are mere";
    System.out.println(str);
    boolean isRainning = true;
    System.out.println(isRainning);

    int age = 15;
    boolean canDrive = age > 18;
    System.out.println(canDrive);

    System.out.print("1 x 1 = 1\n\t");
    System.out.print("1 x 2 = 2\n");
    System.out.print("1 x 3 = 3\n");
    System.out.print("1 x 4 = 4\n");
    System.out.print("1 x 5 = 5\n");
    System.out.print("1 x 6 = 6\n");
    System.out.print("1 x 7 = 7\n");
    System.out.print("1 x 8 = 8\n");

    int x = 11;
    boolean isEven = x % 2 == 0;

    String s = 1 + 2 + "Costel" + 1 + 2;
    System.out.println(s);

    if(isEven == true) {
        System.out.println("Numarul este par");
    } else {
        System.out.println("Numarul este impar");
    }


    float f = 12.3567678f;
    System.out.println(f);
    double d = 12.33;
    System.out.println(d);
  }
}