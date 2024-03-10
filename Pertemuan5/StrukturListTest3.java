package Pertemuan5;

public class StrukturListTest3 {

	    public static void main(String[] args) {
	        // Create list dengan keyword new
	        StrukturList elemenList = new StrukturList();

	        // Tambah elemen sehingga elemenlist berisi (2, 6, 3, 5, 1)
	        elemenList.addTail(2);
	        elemenList.addTail(6);
	        elemenList.addTail(3);
	        elemenList.addTail(5);
	        elemenList.addTail(1);

	        // Tampilkan elemen list
	        System.out.println("Elemen List:");
	        elemenList.displayElement();

	        // Hapus elemen 3 di tengah list
	        elemenList.removeMid(3);

	        // Tampilkan elemen list setelah penghapusan
	        System.out.println("Elemen List setelah penghapusan:");
	        elemenList.displayElement();

	         // Hapus elemen 6 di tengah list
	         elemenList.removeMid(6);

	         // Hapus elemen 5 di tengah list
	         elemenList.removeMid(5);

	         // Tampilkan elemen list setelah penghapusan
	         System.out.println("Elemen List setelah penghapusan kedua:");
	         elemenList.displayElement();
	    }
	}
