import java.util.Scanner;

public class Testing {

    public static void main(String[] args) throws Exception {

        // STEP 1: Mendapatkan data mahasiswa
        var NIM = "";
        var nama = "";

        var jurusan = "Jurusan Teknik Rekayasa Industri";
        var p1 = "Ilmu Komputer";
        var p2 = "Data dan Komunikasi";
        var p3 = "Teknik dan Jaringan";
        var p4 = "Analisis dan Keamanan Data";
        var programStudi = "";

        var mataKuliah = "";
        var skorNilaiMataKuliah = 0.0;
        var totalSKS = 24;
        var SKS = 0;
        var bobotNilai = 'A';

        // Objek untuk mendapatkan input user
        Scanner scanner = new Scanner(System.in);

        // Mendapatkan NIM
        System.out.print("Masukkan NIM: ");
        NIM = scanner.nextLine();

        // Mendapatkan Nama
        System.out.print("Masukkan Nama: ");
        nama = scanner.nextLine();

        // Memilih Program Studi
        System.out.println(
                "\nDaftar kode program studi untuk\n" + jurusan + ":\n" +
                "A -> " + p1 + "\n" +
                "B -> " + p2 + "\n" +
                "C -> " + p3 + "\n" +
                "D -> " + p4 + "\n"
        );

        // Assign variable program studi
        var ps = "";
        System.out.print("Masukkan kode program studi: ");
        ps = scanner.nextLine();
        switch (ps) {
            case "A": programStudi = p1;
            case "B": programStudi = p2;
            case "C": programStudi = p3;
            case "D": programStudi = p4;
        }

        // Mendapatkan nama mata kuliah
        System.out.print("Masukkan nama mata kuliah: ");
        mataKuliah = scanner.nextLine();

        // Mendapatkan jumlah SKS mata kuliah
        System.out.print("Masukkan jumlah SKS untuk " + mataKuliah + ": ");
        SKS = scanner.nextInt();

        // Mendapatkan jumlah SKS mata kuliah
        System.out.print("Masukkan skor nilai mata kuliah: ");
        skorNilaiMataKuliah = scanner.nextDouble();

        // STEP 2: Menghitung nilai akhir berdasarkan data mahasiswa

        double nilaiAkhir = (SKS * skorNilaiMataKuliah) / totalSKS;

        // STEP 3: Menampilkan daftar nilai akhir mahasiswa
        var output =
                "\n-----------------------------------------------------" + "\n" +
                "DATA MAHASISWA" + "\n" +
                "-> NIM: " + NIM + "\n" +
                "-> Nama: " + nama + "\n" +
                "-> Jurusan: " + jurusan + "\n" +
                "-> Program Studi: " + programStudi + "\n" +
                "-> Mata Kuliah: " + mataKuliah + "\n" +
                "-> Jumlah SKS: " + SKS + "\n" +
                "-> Skor Nilai Mata Kuliah: " + skorNilaiMataKuliah + "\n\n" +
                "PERHITUNGAN NILAI AKHIR" + "\n" +
                "-> Nilai Akhir: " + nilaiAkhir + "\n" +
                "-> Bobot Nilai: " + bobotNilai + "\n" +
                "-----------------------------------------------------"
                ;
        System.out.println(output);

    }
}
