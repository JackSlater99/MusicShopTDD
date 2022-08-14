package Shop;

import Behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stockList;

    public Shop(String name) {
        this.name = name;
        this.stockList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ISell> getStockList() {
        return stockList;
    }

    public int getStockSize(){
        return stockList.size();
    }

    public void addStock(ISell item){
        stockList.add(item);
    }

    public void removeStock(ISell item){
        stockList.remove(item);
    }
}
