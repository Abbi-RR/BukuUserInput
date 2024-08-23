import java.util.Scanner;

public class Buku {
    int id;
    String judul;
    String pengarang;
    int tahunTerbit;

    // Constructor
    public Buku(int id, String judul, String pengarang, int tahunTerbit) {
        this.id = id;
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    // display book information
    public void displayInfo() {
        System.out.println("============================================");
        System.out.println("               INFORMASI BUKU               ");
        System.out.println("============================================");
        System.out.println("ID Buku       : " + id);
        System.out.println("Judul         : " + judul);
        System.out.println("Pengarang     : " + pengarang);
        System.out.println("Tahun Terbit  : " + tahunTerbit);
        System.out.println("============================================\n");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input untuk buku baru
        System.out.println("Masukkan judul buku:");
        String judul = input.nextLine();

        System.out.println("Masukkan pengarang buku:");
        String pengarang = input.nextLine();

        System.out.println("Masukkan ID buku:");
        int id = input.nextInt();

        System.out.println("Masukkan tahun terbit:");
        int tahunTerbit = input.nextInt();
        input.nextLine(); 
        
        // Objek Buku
        Buku userBook = new Buku(id, judul, pengarang, tahunTerbit);
        Buku alamkubur = new Buku(2110, "Kisi-kisi pertanyaan alamkubur", "hazelSigma", 1992);
        Buku sigmas = new Buku(1987, "Tutorial menjadi Sigmas", "AbiGTG", 2019);
        Buku mengaturistri = new Buku(6969, "Cara mengatur 100 istri", "AkbarKUN", 1222);
        Buku saldodana = new Buku(2606, "cara mengubah dosa menjadi saldo dana", "AbdulRR", 8822);
        Buku egg = new Buku(1996, "Prove if egg dont bite", "Herry qs", 1002);

        // DisplayInfo
        alamkubur.displayInfo();
        sigmas.displayInfo();
        mengaturistri.displayInfo();
        saldodana.displayInfo();
        egg.displayInfo();
        userBook.displayInfo();

        // Close scanner
        input.close();
    }
}
