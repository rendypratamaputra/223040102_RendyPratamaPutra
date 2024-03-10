package Pertemuan5;

public class StrukturListTest2 {
    public static void main(String[] args) {
        StrukturList list = new StrukturList(); // Create list dengan keyword new
        
        // Tambah elemen sehingga elemen list berisi (2, 6, 3, 5, 1)
        list.addHead(1);
        list.addHead(5);
        list.addHead(3);
        list.addHead(6);
        list.addHead(2);
        
        // Tampilkan elemen list
        System.out.println("Elemen list setelah penambahan:");
        list.displayElement();
        
        // Hapus elemen di akhir list
        list.removeTail();
        
        // Tampilkan elemen list
        System.out.println("Elemen list setelah penghapusan di akhir:");
        list.displayElement();
        
        // Hapus elemen di awal list
        list.removeHead();
        
        // Tampilkan elemen list
        System.out.println("Elemen list setelah penghapusan di awal:");
        list.displayElement();
        
        // Tambahkan lagi instruksi untuk menghapus elemen list di akhir
        list.removeTail();
        System.out.println("Elemen list setelah penghapusan kedua di akhir:");
        list.displayElement();
    }
}
