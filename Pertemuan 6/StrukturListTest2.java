package Pertemuan6PraktikumPemogramanI;

public class StrukturListTest2 {

	public static void main (String[] args) {
	StrukturList list = new StrukturList ();
	// elemen list berisi (7, 6, 4, 2, 3)
	list.addHead (7);
	list.addMiddle(6,2);
	list.addMiddle(4,3);
	list.addTail(2);
	list.addTail(3);
	// Tampilan elemen list
	list.displayElement ();
	// Tampilan size elemen list
	int size = list.size ();
	System.out.println ();
	System.out.println(size);

	}
}
