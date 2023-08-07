package jaist.realearn.consistentargumentsfinder.framework;

import java.util.ArrayList;
import java.util.List;
public class Node {
    String name;
    List<Node> attacks;


    public Node(String name){
        this.name = name;
        attacks = new ArrayList<Node>();
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void addAttackers(Node AR){
        attacks.add(AR);
    }
}
