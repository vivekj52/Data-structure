package graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

    //number of vertices
    int V;
    //Adjacency list
    LinkedList<Node> adjList[];

    public Graph(int v) {
        //Initialising number of vertices
        this.V = v;
        //Initialising size of adjacency list
        adjList = new LinkedList[v];

        for (int i = 0; i < adjList.length; i++)
            adjList[i] = new LinkedList<Node>();
    }

    // To add new edge to graph
    public void addEdge(int source, int destination, int weight){
        Node newNode1 = new Node(weight, destination);
        Node newNode2 = new Node(weight, source);
        this.adjList[source].add(newNode1);
        this.adjList[destination].add(newNode2);
    }

    // To print Graph
    public void printGraph(Graph graph){
        System.out.println("---------------------Adjacency List for graph-------------------");
        for (LinkedList l :
                graph.adjList) {
            System.out.print("head ");
            Iterator it = l.listIterator();
            while (it.hasNext())
                System.out.print(it.next().toString());
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Graph graph = new Graph(5);
        graph.addEdge(0,1,1);
        //graph.addEdge(0,2,2);
        graph.addEdge(0,3,3);
        //graph.addEdge(0,4,4);
        graph.addEdge(1,2,12);
        graph.addEdge(1,3,13);
        graph.addEdge(1,4,14);
        graph.addEdge(2,3,23);
        graph.addEdge(3,4,34);

        graph.printGraph(graph);

        System.out.println("------------DFS traversal is-------------------------");
        new DFS().depthFirstSearch(graph,0);
        System.out.println("\n------------BFS traversal is-------------------------");
        new BFS().breadthFirstSearch(graph,0);
    }
}
