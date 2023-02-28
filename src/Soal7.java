
import java.util.Scanner;

public class Soal7 {
    static int sisa = 0;
    public static String rekomendasiBarang(int uangPelanggan) {
        if (uangPelanggan<3000){
            return "Uang anda tidak cukup";
        } else if(uangPelanggan >= 7000 )  {
            sisa = uangPelanggan - 7000;
            return "Uang anda : " + uangPelanggan+"\nRekomendasi barang untuk dibeli : Buavita \nSisa Uang : " +sisa;
        } else if (uangPelanggan < 7000 && uangPelanggan>=6000) {
            sisa = uangPelanggan - 6000;
            return "Uang anda : " + uangPelanggan+"\nRekomendasi barang untuk dibeli : Oreo \nSisa Uang : " +sisa;
        } else if (uangPelanggan < 6000 && uangPelanggan>= 5000 ) {
            sisa = uangPelanggan - 5000;
            return "Uang anda : " + uangPelanggan+"\nRekomendasi barang untuk dibeli : Tanggo \nSisa Uang : " +sisa;
        } else if (uangPelanggan<5000 && uangPelanggan>=3000) {
            sisa = uangPelanggan - 3000;
            return "Uang anda : " + uangPelanggan+"\nRekomendasi barang untuk dibeli : Aaqua \nSisa Uang : " +sisa;
        } else {
            return "";
        }
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukan Uang Anda : ");
        int uangPelanggan = userInput.nextInt();
        System.out.println(rekomendasiBarang(uangPelanggan));
    }

}
