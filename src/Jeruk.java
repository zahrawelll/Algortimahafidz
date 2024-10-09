import java.util.Scanner;

public class Jeruk {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print(" Masukan jumlah buah jeruk; ");
    int jumlahBuah = input.nextInt();

    int harga5Buah = 100000, haraga2Buah = 5000,harga1Buah = 3000;
    int totalHarga = 0;

    if (jumlahBuah >= 5) {
        int paket5Buah = jumlahBuah / 5;
        totalHarga += paket5Buah * harga5Buah;
        jumlahBuah = jumlahBuah % 5;

    }
    
    if (jumlahBuah >= 2) {
        int paket2Buah = jumlahBuah / 2;
        totalHarga += paket2Buah* haraga2Buah;
        jumlahBuah = jumlahBuah % 2;

    }

    if (jumlahBuah >= 1) {
        totalHarga += jumlahBuah* harga1Buah;

    }

    System.out.println("Total harga: " + totalHarga);
    input.close();
        
    }
    
    
}
