package Tugas11PrakPro;
import java.util.Stack;
public class Graph {
    private final int MAX_VERTS;
    private virtex[] vertexList; // list of vertices
    private int[][] adjMat; // adjacency matrix
    private int nVerts; // current number of vertices

    public Graph(int maxVerts) {
        MAX_VERTS = maxVerts;
        vertexList = new virtex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS]; // Initialize the adjacency matrix
        nVerts = 0;

        // Initialize all elements to 0
        for (int i = 0; i < MAX_VERTS; i++) {
            for (int j = 0; j < MAX_VERTS; j++) {
                adjMat[i][j] = 0;
            }
        }
    }

    public void addVertex(char lab) {
        vertexList[nVerts++] = new virtex(lab);
    }

    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void adjacencyMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < nVerts; i++) {
            for (int j = 0; j < nVerts; j++) {
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void dfs() {
        Stack<Integer> stack = new Stack<>();
        vertexList[0].setWasVisited(true);
        displayVertex(0);
        stack.push(0);

        while (!stack.isEmpty()) {
            int v = getAdjUnvisitedVertex(stack.peek());
            if (v == -1) {
                stack.pop();
            } else {
                vertexList[v].setWasVisited(true);
                displayVertex(v);
                stack.push(v);
            }
        }

        // Reset the flags
        for (int j = 0; j < nVerts; j++) {
            vertexList[j].setWasVisited(false);
        }
    }

    public int getAdjUnvisitedVertex(int v) {
        for (int j = 0; j < nVerts; j++) {
            if (adjMat[v][j] == 1 && !vertexList[j].getWasVisited()) {
                return j;
            }
        }
        return -1;
    }

    public void displayVertex(int v) {
        System.out.print(vertexList[v].getLabel() + " ");
    }
}