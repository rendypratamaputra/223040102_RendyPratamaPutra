package Pertemuan8;

public class QueueMain {
    public static void main(String[] args) {
        StrukturQueue queue = new StrukturQueue(); 

        // Menampilkan status antrian sebelum melakukan enqueue
        System.out.println("### sebelum enqueue 3x ###");
        System.out.println("Isempty? " + queue.isEmpty()); // Memeriksa apakah antrian kosong
        System.out.println("Size : " + queue.size()); // Menampilkan jumlah elemen dalam antrian
       

        // Enqueue sebanyak 3x
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);

        // Menampilkan status antrian setelah melakukan enqueue
        System.out.println("### enqueue 3x ###");
        System.out.println("Size : " + queue.size()); // Menampilkan jumlah elemen dalam antrian
        System.out.println("Is empty? " + queue.isEmpty()); // Memeriksa apakah antrian kosong
        System.out.println("Front : " + queue.front()); // Menampilkan elemen yang berada di depan antrian
    
    }
