package Pertemuan8;

public class StrukturQueue {
    private Node FRONT; // Simpul depan dari antrian
    private Node REAR; // Simpul belakang dari antrian

    // Konstruktor untuk inisialisasi antrian kosong
    public StrukturQueue() {
        this.FRONT = null;
        this.REAR = null;
    }
    
    // Metode untuk memeriksa apakah antrian kosong
    public boolean isEmpty() {
        return FRONT == null;
    }

    // Metode untuk mengembalikan jumlah elemen dalam antrian
    public int size() {
        int size = 0;
        Node curNode = FRONT;
        while (curNode != null) {
            size++;
            curNode = curNode.getNext();
        }
        return size;
    }

    // Metode untuk menampilkan elemen-elemen dalam antrian
    public void displayElements() {
        if (isEmpty()) {
            System.out.println("Queue Kosong");
            return;
        }

        Node curNode = FRONT;
        System.out.print("Elements queue: ");
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
        System.out.println();
    }

    // Metode untuk menghapus elemen dari depan antrian
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue Kosong");
        }
        int removedData = FRONT.getData();
        FRONT = FRONT.getNext();
        if (FRONT == null) {
            REAR = null;
        }
        return removedData;
    }

    // Metode untuk mendapatkan nilai elemen yang terletak di depan antrian
    public int front() {
        return FRONT != null ? FRONT.getData() : -1;
    }
    
    // Metode untuk menambahkan elemen ke dalam antrian
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            FRONT = newNode;
            REAR = newNode;
        }
        else {
            REAR.setNext(newNode);
            REAR = newNode;
        }
    }
}
