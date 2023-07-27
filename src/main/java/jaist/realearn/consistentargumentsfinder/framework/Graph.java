package jaist.realearn.consistentargumentsfinder.framework;

import java.util.ArrayList;

public class Graph {
        List<Node> nodes;


        public boolean findNode(String nodesName) {
            for (Node n : nodes) {
                if (n.getName().equals(nodesName)) {
                    return true;
                }
            }
            return false;
        }
}
