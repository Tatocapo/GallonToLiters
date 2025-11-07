import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends javax.swing.JFrame {
    public GUI() {
        super("Gallon to Liters Converter");
        components();
    }

    public void components(){
        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER,10 ,20);
        setLayout(flowLayout);

       JLabel gallonLabel = new JLabel("Enter Gallon");
       add(gallonLabel);

       TextField galonTextField = new TextField(10);
       add(galonTextField);

       Button convertButton = new Button("Convert");
       add(convertButton);

       JLabel resultLabel = new JLabel("");
       add(resultLabel);

       convertButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               try {
                   String input = galonTextField.getText();
                   double gallon = Double.parseDouble(input);

                   if (gallon < 0 ) {
                       resultLabel.setText("Enter positive number.");
                   }else {

                       Gallon g = new Gallon(gallon);
                       double liters = g.getLiters();
                       resultLabel.setText(liters + " liters");
                   }
               }
               catch (NumberFormatException ex ){
                   resultLabel.setText("Enter valid number not text.");
               }
           }
       });

    }

    public void set(){
        GUI GUI = new GUI();
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI.setVisible(true);
        GUI.setSize(300, 150);
        GUI.setLocationRelativeTo(null);
    }

}
