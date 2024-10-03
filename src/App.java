import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scannner inputan =new scanner(System.in);

        Double perkilo = 28000;
        System.out.println("masukan (kg) telur yang dibeli: ");
        Double kilotelur = inputan.nexDouble();
        
        System.out.print("masukan uang bayar");
        Double uangbayar = inputan.nexDouble();

        Double hargatelur = kilotelur * perkilo;
        Double kembalian = uangbayar - hargatelur;

        System.out.println("harga telur per kilo: " + kembalian);
        
        inputan.close();
    }
}
