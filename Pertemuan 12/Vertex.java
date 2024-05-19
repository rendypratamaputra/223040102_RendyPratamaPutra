package Pertemuan11PrakPro;

public class Vertex {
	private char label; // label (e.g. 'A')
	private boolean wasVisited;
	
	public Vertex(char lab) {// constructor}
	label = lab;
	wasVisited = false;
	}
	
	public void setWasVisited(boolean visited) {
        wasVisited = visited;
    }

    // Getter for label
    public char getLabel() {
        return label;
    }

    // Getter for wasVisited
    public boolean wasVisited() {
        return wasVisited;
    }

	}
