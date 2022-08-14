package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Guitars extends Instrument implements IPlay, ISell {

    private int noOfStrings;

    public Guitars(double buyPrice, double sellPrice, InstrumentType instrumentType, String brand, String material, String colour, int noOfStrings) {
        super(buyPrice, sellPrice, instrumentType, brand, material, colour);
        this.noOfStrings = noOfStrings;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    public void setNoOfStrings(int noOfStrings) {
        this.noOfStrings = noOfStrings;
    }

    @Override
    public String play() {
        return "guitar noises";
    }

    @Override
    public double calculateMarkup() {
        return (this.getSellPrice() - this.getBuyPrice())/this.getBuyPrice();
    }
}
