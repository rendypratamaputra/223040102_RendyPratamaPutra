package Pertemuan8;

public class QueueMain2 {

	    public static void main(String[] args) {
	        // Membuat objek StrukturQueue
	        StrukturQueue queue = new StrukturQueue();

	        // Sebelum melakukan enqueue 4x
	        System.out.println("### Sebelum Enqueue 4x ###");
	        System.out.println("size: " + queue.size());
	        System.out.println("isEmpty: " + queue.isEmpty());
	        queue.displayElements();
	        System.out.println();

	        // Melakukan enqueue 4x
	        System.out.println("### Enqueue 4x ###");
	        queue.enqueue(2);
	        queue.enqueue(7);
	        queue.enqueue(6);
	        queue.enqueue(1);

	        // Setelah melakukan enqueue 4x
	        System.out.println("size: " + queue.size());
	        System.out.println("isEmpty: " + queue.isEmpty());
	        queue.displayElements();
	        System.out.println("Front: " + queue.front());
	    }
}


