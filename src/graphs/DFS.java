package graphs;

import java.util.Iterator;
import java.util.Stack;

public class DFS {

    public void depthFirstSearch(Graph graph, int source){

        Boolean visited[] = new Boolean[graph.V];
        for (int i = 0; i < visited.length; i++)
            visited[i] = false;
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(source);

        while (!stack.empty()){
            int currentNode = stack.pop();

            if (!visited[currentNode]){
                System.out.println(" --> "+currentNode);
                visited[currentNode] = true;
            }
            else{
                System.out.println(currentNode+" is already visited !");
            }

            Iterator it = graph.adjList[currentNode].iterator();
            while (it.hasNext()){
                Node node = (Node) it.next();
                if (!visited[node.destination])
                    stack.push(node.destination);
            }
        }

    }
}
