package Composition;

public class Main {
    public static void main(String[] args) {
        Dimension dimension = new Dimension(20, 20, 5);
        Case theCase = new Case("2203", "Dell", "240", dimension);

        Monitor  theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2548, 1440));
        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, motherboard);
        thePC.powerUp();

    }
}
