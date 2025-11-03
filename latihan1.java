
import java.util.Scanner;

public class latihan1 {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("masukkan berat (kg):");
        int berat = scanner.nextInt();

        System.out.println("masukkan jarak termpuh: ");
        int jarak = scanner.nextInt();

        System.out.println("masukkan panjang :");
        int panjang = scanner.nextInt();
         System.out.println("masukkan Lebar ");
        int lebar= scanner.nextInt();
        System.out.println("maukkan tinggi : ");
        int tinggi = scanner.nextInt();


        int volume = panjang*lebar*tinggi;

        int biayaberat = 0;
        if (jarak <= 4250*berat){
            biayaberat=4250*berat;}

            int biayavolume = 0;
            if (volume > 100) {
                biayavolume = 50000;
            }

            int biayatotal = biayaberat + biayavolume;

          
 System.out.println("Volume paket: " + volume + " cm³");
     
        System.out.println("Volume paket: " + volume + " cm³");
        System.out.println("Biaya berat: Rp " + String.format("%,.0f", biayaberat));
        System.out.println("Biaya volume: Rp " + String.format("%,.0f", biayavolume));
        System.out.println("Biaya total pengiriman: Rp " + String.format("%,.0f", biayatotal));


   


    }
    
}
