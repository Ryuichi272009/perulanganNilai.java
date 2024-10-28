import java.util.Scanner;
public class perulanganNilai {
    public static void main(String[] args) {
        int jumlahSiswa, nilai, totalNilai = 0;
        double rataRata = 3;

        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan jumlah siswa");
        jumlahSiswa = s.nextInt();


        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Masukkan nilai "+i +":");
            nilai = s.nextInt();
            totalNilai = totalNilai + nilai;
            
            rataRata = totalNilai/jumlahSiswa;
            System.out.println("Total nilai "+ totalNilai);
            System.out.println("Rata rata "+ rataRata);
            s.close();
        }
    }
        

}
