package graphs;

public class Node {

    int weight;
    int destination;

    public Node(int weight, int destination) {
        this.weight = weight;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "--> "+weight +
                " to node " + destination;
    }
}
