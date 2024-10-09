import java.util.Scanner;

public class Lulus {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukan Nilai Mahasiswa: ");
    double NilaiMahasiswa = input.nextDouble();

    String keterangan;
    if (NilaiMahasiswa >= 75) {
        keterangan = "Lulus";
    } else {
        keterangan = "Tidak Lulus";
    }
    System.out.println("Keterangan: " + keterangan);
    input.close();   

        
    }

}
