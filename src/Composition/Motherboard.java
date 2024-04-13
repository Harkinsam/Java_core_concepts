package Composition;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
    public void loadProgram(String programName){
        System.out.println("Program " + programName + " is now loading...");
    }
    public String model() {
        return model;
    }

    public String manufacturer() {
        return manufacturer;
    }

    public int ramSlots() {
        return ramSlots;
    }

    public int cardSlots() {
        return cardSlots;
    }

    public String bios() {
        return bios;
    }
}
