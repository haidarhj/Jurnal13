import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {

    ArrayList<LinkedList<Node>> mylist;

    Graph() {
        mylist = new ArrayList<>();
    }

    public void addNode (Node node) {
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        mylist.add(currentList);
    }

    public void addEdge(int src, int dest) {
        LinkedList<Node> currentList = mylist.get(src);
        Node destNode   = mylist.get(dest).get(0);
        currentList.add(destNode);
    }

    public void print(){
        for (LinkedList <Node> currentList : mylist){
            for (Node node : currentList) {
                System.out.print(node.data + " ---> ");
            }
            System.out.println();
        }
    }
}