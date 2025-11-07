import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------");

        UI ui = new UI();
        ui.set();


        Gallon gallon1 = new Gallon(1);
        Gallon gallon2 = new Gallon(30);

        System.out.println("Gallon: " + gallon1.getGallon());
        System.out.println("Liters: " + gallon1.getLiters());

        System.out.println("-------------------------");

        gallon2.printGallonToLiters();

        System.out.println("-------------------------");


    }
}