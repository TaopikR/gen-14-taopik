package Tugas4;

public class Barang {
    private String nama;
    private int harga;
    private int persediaan;

    public Barang() {
    }
    public Barang(String nama, int harga, int persediaan) throws Exception {
        if (harga>0) {
            this.harga = harga;
        } else {
            throw new Exception("Harga tidak boleh negatif");
        }
        this.nama = nama;
        this.persediaan = persediaan;
    }

    @Override
    public String toString() {
        return "\n--------------------------"+
                "\nNama\t: "+this.nama +
                "\nHarga\t: "+StringUtil.toRupiah(this.harga) +
                "\nStok\t: "+this.persediaan
                ;
    }

}