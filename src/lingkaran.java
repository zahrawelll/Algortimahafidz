import java.util.Scanner;

public class lingkaran{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukan Jari-jari : ");
        double jariJari = scanner.nextDouble();

        double keliling = 2 * 3.14 * jariJari;

        System.out.println("keliling lingkaran : " + keliling);

        scanner.close();
    }
}