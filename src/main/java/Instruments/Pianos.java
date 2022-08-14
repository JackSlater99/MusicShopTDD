package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Pianos extends Instrument implements IPlay, ISell {


    private int noOfKeys;

    public Pianos(double buyPrice, double sellPrice, InstrumentType instrumentType, String brand, String material, String colour, int noOfKeys) {
        super(buyPrice, sellPrice, instrumentType, brand, material, colour);
        this.noOfKeys = noOfKeys;
    }

    public int getNoOfKeys() {
        return noOfKeys;
    }

    @Override
    public String play() {
        return "piano noises";
    }

    @Override
    public double calculateMarkup() {
        return (this.getSellPrice() - this.getBuyPrice())/this.getBuyPrice();
    }
}
