package Tugas4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileBarang {
    public static void main(String[] args) throws Exception {
        List<Barang> daftarBarang = new ArrayList<>();
        Barang oreo = new Barang("Oreo", 5000, 10);
        Barang bengBeng = new Barang("BengBeng",3000,20);
        Barang buavita = new Barang("Buavita",15000,12);
        Barang tanggo = new Barang("Tanggo",7000,26);

        daftarBarang.add(oreo);
        daftarBarang.add(bengBeng);
        daftarBarang.add(buavita);
        daftarBarang.add(tanggo);

        try {
            FileWriter membuatDaftarBarang = new FileWriter("daftarBarang.txt");
            System.out.println("Stok Tugas4.Barang Saat Ini" );
            for (Barang b : daftarBarang) {
                membuatDaftarBarang.write(b.toString());
            }
            membuatDaftarBarang.close();

            File file = new File("daftarBarang.txt");
            Scanner baca = new Scanner(file);
            while (baca.hasNextLine()) {
                String data = baca.nextLine();
                System.out.println(data);
            }
            baca.close();
            System.out.println("Berhasil menyimpan data barang kedalam file "+ file.getName());
        } catch (IOException e) {
            System.out.println("Terjadi Error.!");
            e.printStackTrace();
        }

    }
}
