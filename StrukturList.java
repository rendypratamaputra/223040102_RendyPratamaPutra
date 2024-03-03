package Pertemuan4Perograman1;

import Pertemuan4Perograman1.Node;

public class StrukturList {
    private Node HEAD;
    
    //cek apakah linked list kosong
    public boolean isEmpty() {
        return HEAD == null;
    }
    
    //fungsi menambahkan data AddHead List
    public void addHead(double data) {
        Node newnode = new Node(data);
        if (isEmpty()) {
            HEAD = newnode;
        } else {
            newnode.setNext(HEAD);
            HEAD = newnode;
        }
    }
    
    //fungsi menambahkan data di depan
    public void addTail(double data) {
        Node newnode = new Node(data);
        if (isEmpty()) {
            HEAD = newnode;
        } else {
            Node curNode = HEAD;
            Node posNode = null;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newnode);
        }
    }

    //fungsi menambahkan data di tengah
    public void addMiddle(double data, int pos) {
        Node newnode = new Node(data);
        Node curNode = HEAD;
        if (isEmpty()) {
            HEAD = newnode;
        } else {
            Node posNode = null;
            if (pos == 1) {
                newnode.setNext(HEAD);
                HEAD = newnode;
            } else {
                int i = 1;
                while (curNode != null && i < pos) {
                    posNode = curNode;
                    curNode = curNode.getNext();
                    i++;
                }
                posNode.setNext(newnode);
                newnode.setNext(curNode);
            }
        }
    }

    // menampilkan isi linked list
    public void displayElement() {
        Node curNode = HEAD;

        while(curNode != null) {
            System.out.print(curNode.getdata()+ " ");
            curNode = curNode.getNext();
        }
    }
}
