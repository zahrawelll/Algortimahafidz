import java.util.Scanner;

public class Grade {
  public static void main(String[] args) {
    String grade;
    Scanner input = new Scanner(System.in);

    System.out.print("Masukan Nilai Mahasiswa: ");
    double nilaiAkhir = input.nextDouble();

    if (nilaiAkhir >= 85) {
         grade = "A";
    } else if (nilaiAkhir >= 75) {
        grade = "B";
    } else if (nilaiAkhir >= 65) {
        grade = "C";
    } else if (nilaiAkhir >= 55) {
        grade = "D";
    } else {
        grade = "E";
    }
    
    System.out.println("Nilai Anda: " + nilaiAkhir);
    System.out.println("grade Anda: " + grade);

    input.close();
    
    
        
    }
        
  }
        
    

        
    
        
    

    

