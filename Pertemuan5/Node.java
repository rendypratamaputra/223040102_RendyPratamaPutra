package Pertemuan5;

public class Node {
    private double data;
    private Node next;

    public Node(double data) {
        this.data = data;
    }

    // Setter dan Getter
    public void setNext(Node next) {
        this.next = next;
    }

    public double getdata() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}
