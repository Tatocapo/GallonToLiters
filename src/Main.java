public class Main {
    public static void main(String[] args) {
        Gallon gallon1 = new Gallon(1);

        System.out.println("Gallon: " + gallon1.getGallon());
        System.out.println("Liters: " + gallon1.getLiters());

        gallon1.printGallonToLiters();
    }
}