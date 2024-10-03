import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inputan =new Scanner(System.in);

        double perkilo = 28000.0;
        System.out.println("masukan (kg) telur yang dibeli: ");
        Double kilotelur = inputan.nextDouble();
        
        System.out.print("masukan uang bayar");
        Double uangbayar = inputan.nextDouble();

        Double hargatelur = kilotelur * perkilo;
        Double kembalian = uangbayar - hargatelur;

        System.out.println("harga telur per kilo: " + kembalian);
        
        inputan.close();
    }
}
