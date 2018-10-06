package graphs;

import java.util.*;

public class BFS {

    public void breadthFirstSearch(Graph graph, int source){

        Boolean visited[] = new Boolean[graph.V];
        for (int i = 0; i < visited.length; i++)
            visited[i] = false;
        //Stack<Integer> stack = new Stack<Integer>();
        Queue<Integer> queue = new LinkedList<>();
        //stack.push(source);
        ((LinkedList<Integer>) queue).addLast(source);

        while (!queue.isEmpty()){
            int currentNode = ((LinkedList<Integer>) queue).pop();

            if (!visited[currentNode]){
                System.out.println(" --> "+currentNode);
                visited[currentNode] = true;
            }
            else {
                System.out.println(currentNode+" is already visited");
            }

            Iterator it = graph.adjList[currentNode].iterator();
            while (it.hasNext()){
                Node node = (Node) it.next();
                if (!visited[node.destination])
                    ((LinkedList<Integer>) queue).addLast(node.destination);
            }
        }

    }
}
