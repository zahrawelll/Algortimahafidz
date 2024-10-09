import java.util.Scanner;

public class ganjilgenap {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Masukan angka; ");
      int angka = input.nextInt();

      if (angka % 2 == 0) {
         System.out.print(angka + "adalah bilangan genap.");
      } else {      
        System.out.print("angka + adalah bilangan genap.");}


        input.close();
      
        
        
    }
}
