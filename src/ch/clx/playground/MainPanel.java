package ch.clx.playground;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: azen
 * Date: 26.06.12
 * Time: 16:39
 * To change this template use File | Settings | File Templates.
 */
public class MainPanel extends JPanel {

    //TODO: only declaration
    private JTextField heightImput = new JTextField();
    private JTextField widthImput = new JTextField();

    private JButton submitButton = new JButton();

    public MainPanel(final ViewFrame viewFrame) {
        SpringLayout mySLayout = new SpringLayout();
        this.setLayout(mySLayout);
        this.setSize(400, 500);
        this.setBackground(Color.blue);

        //TODO: initialization of textfields and button
        submitButton.setText("Submit new Dimensions");
        submitButton.setPreferredSize(new Dimension(220, 50));
        //TODO: see http://docs.oracle.com/javase/tutorial/uiswing/components/formattedtextfield.html
        heightImput.setPreferredSize(new Dimension(100, 50));
        widthImput.setPreferredSize(new Dimension(100, 50));

        this.add(heightImput);
        this.add(widthImput);
        this.add(submitButton);

        //Define Position Spesifikations for heightImput
        mySLayout.putConstraint(SpringLayout.WEST, heightImput, 25, SpringLayout.WEST, this);
        mySLayout.putConstraint(SpringLayout.NORTH, heightImput, 25, SpringLayout.NORTH, this);

        //Define Position spezifikations for widthImput
        mySLayout.putConstraint(SpringLayout.WEST, widthImput, 20, SpringLayout.EAST, heightImput);
        mySLayout.putConstraint(SpringLayout.NORTH, widthImput, 25, SpringLayout.NORTH, this);

        //Define position spezifikations for SubmitButton
        mySLayout.putConstraint(SpringLayout.NORTH, submitButton, 20, SpringLayout.SOUTH, heightImput);
        mySLayout.putConstraint(SpringLayout.WEST, submitButton, 25, SpringLayout.WEST, this);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    int newHeight = Integer.parseInt(heightImput.getText());
                    int newWidth = Integer.parseInt(widthImput.getText());

                    if (newHeight < 210 || newWidth < 290) {
                        JOptionPane.showMessageDialog(null, "The frame can't be rezied to dimensions smaller then smaller then 290 x 210 Pixels, do to Display issues.");
                    }

                    viewFrame.setSize(newWidth, newHeight);
                } catch (Exception e1) {
                }
            }
        });

    }
}
