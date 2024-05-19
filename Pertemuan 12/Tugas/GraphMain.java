package Tugas11PrakPro;

public class GraphMain {

	    public static void main(String[] args) {
	        Graph graph = new Graph(4);

	        // Menambah Vertex
	        graph.addVertex('A'); // 0
	        graph.addVertex('B'); // 1
	        graph.addVertex('C'); // 2
	        graph.addVertex('D'); // 3

	        // Menambah Edge sesuai dengan gambar
	        graph.addEdge(0, 1); // A - B
	        graph.addEdge(0, 2); // A - C
	        graph.addEdge(0, 3); // A - D
	        graph.addEdge(1, 3); // B - D

	        // Menampilkan matriks adjacency
	        graph.adjacencyMatrix();
	        System.out.println();

	    }
	}

