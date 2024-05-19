package Tugas11PrakPro;

class virtex {
    private char label;
    private boolean wasVisited;

    public virtex(char lab) {
        label = lab;
        wasVisited = false;
    }

    public char getLabel() {
        return label;
    }

    public void setLabel(char label) {
        this.label = label;
    }

    public boolean getWasVisited() {
        return wasVisited;
    }

    public void setWasVisited(boolean wasVisited) {
        this.wasVisited = wasVisited;
    }
}

