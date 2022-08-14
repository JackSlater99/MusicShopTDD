package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private double buyPrice;
    private double sellPrice;
    private InstrumentType instrumentType;
    private String brand;
    private String material;
    private String colour;

    public Instrument(double buyPrice, double sellPrice, InstrumentType instrumentType, String brand, String material, String colour) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.instrumentType = instrumentType;
        this.brand = brand;
        this.material = material;
        this.colour = colour;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public String getBrand() {
        return brand;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public void setInstrumentType(InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
