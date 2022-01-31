package calculator;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public static int label = 1;
    public String value;
    public List<Node> children = new ArrayList<>();

    public Node(String value) {
        this.value = value;
    }

    public void addChild(Node child) {
        children.add(child);
    }

    public String toString(String align) {
        String res = align + "Node: value=" + value + "\n";
        if (children.isEmpty()) {
            return res;
        }
        res += align + "Children: \n";
        for (Node child : children) {
            res += child.toString(align + "     ");
        }
        return res;
    }

    public String dotNumerate() {
        String res = "" + label++ + " [label=\"" + value + "\"]\n";
        for (Node child : children) {
            res += child.dotNumerate();
        }
        return res;
    }

    @Override
    public String toString() {
        int num = label++;
        String res = "";
        for (Node child : children) {
            res += num + " -> " + label + "\n";
            res += child.toString();
        }
        return res;
    }
}