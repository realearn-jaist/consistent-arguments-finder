package jaist.realearn.consistentargumentsfinder.framework;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.awt.Dimension;
import java.awt.geom.Point2D;
import javax.swing.JFrame;
import org.jgrapht.Graph;




public class Main {
    public static void main(String[] args) {
        Graph g = new Graph();
        try {
            FileInputStream fis = new FileInputStream("input_af.pl");
            BufferedReader bf = new BufferedReader(new InputStreamReader(fis, "SJIS"));
            String text;
            Node node = new Node(null);
            while ((text = bf.readLine()) != null) {
                if (text.contains("arg")) {
                    node.setName(text.substring(text.indexOf("(") + 1, text.indexOf(")")));
                } else if (text.contains("att")) {
                    if (g.findNode(text.substring(text.indexOf("(") + 1, text.indexOf(",")))) {
                        Node m = new Node(text.substring(text.indexOf(",") + 1, text.indexOf(")")));
                        node.addAttackers(m);
                    }
                }

            }
            bf.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        double d = 100.0;
        double i = 1;
        for(Graph n : g) {
            g.getName().setPoint(d*i,d);
            i++;
        }

        JFrame frame = new JFrame("Abstract Argumentation Figure");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        }

    }


