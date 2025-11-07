import javax.swing.*;

public class UI extends javax.swing.JFrame {
    public UI() {
        super("Gallon to Liters Converter");
    }

    public void set(){
        UI ui = new UI();
        ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ui.setVisible(true);
        ui.setSize(300, 300);
        ui.setLocationRelativeTo(null);
    }
}
