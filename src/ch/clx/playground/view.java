package ch.clx.playground;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: azen
 * Date: 26.06.12
 * Time: 14:28
 * To change this template use File | Settings | File Templates.
 */
public class View extends JFrame{

    public View(){
        this.setTitle("My Resizable Frame");
        this.setSize(400, 500);
        this.setVisible(true);
        this.setBackground(Color.blue);
        this.setMinimumSize(new Dimension(290,210));
        this.add(new MainPanel(this), BorderLayout.CENTER);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
