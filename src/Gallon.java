public class Gallon {
    private double gallon;
    private double liters;

    public Gallon(double gallon) {
        this.gallon = gallon;
        this.liters = 3.78541178;
    }

    public double getGallon() {
        return gallon;
    }

    public double getLiters() {
        return gallon * liters;
    }

    public void printGallonToLiters() {
        System.out.println("Gallon: " + getGallon());
        System.out.println("Transfer from gallon to Liters: " + getLiters());
    }

}
