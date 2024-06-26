package Encapsulation_challenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerAmount, boolean duplex){
        if(tonerLevel>-1 && tonerLevel<=100){
            this.tonerLevel = tonerLevel;
        }else {
            this.tonerLevel = -1;
        }

        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public  int addToner(int tonerAmount){
        if(tonerAmount >0 && tonerAmount <=100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }else {
            return -1;
        }
    }
    public int printPages(int pages){
        int pagesToprint = pages;
        if(this.duplex) {
            pagesToprint /= 2;
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToprint;
        return pagesToprint;
    }

    public int pagesPrinted() {
        return pagesPrinted;
    }
}
