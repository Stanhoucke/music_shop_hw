package shop;

import behaviours.ISell;
import instruments.Instrument;
import instruments.InstrumentType;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void setStock(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public int countStock(){
        return this.stock.size();
    }

    public void addStock(ISell item){
        this.stock.add(item);
    }
    public void addStock(ArrayList<ISell> items){
        for (ISell item : items){
            this.addStock(item);
        }
    }

    public void removeStock(ISell item){
        this.stock.remove(item);
    }
    public void removeStock (ArrayList<ISell> items){
        for (ISell item : items){
            this.removeStock(item);
        }
    }

    public double calculateTotalPotentialProfit() {
        return this.stock
                .stream()
                .map(ISell::calculateMarkUp)
                .reduce(0.00, (total, markUp) -> total += markUp);
    }

    public ArrayList<ISell> filterStockBySellPriceOver(double sellPrice) {
        ArrayList<ISell> filteredStock = new ArrayList<>();
        for (ISell item : this.stock){
            if(item.getSellPrice() > sellPrice){
                filteredStock.add(item);
            }
        }
        return filteredStock;
    }

    public ArrayList<Instrument> filterStockByInstrumentType(InstrumentType instrumentType){
        ArrayList<Instrument> filteredStock = new ArrayList<>();
        for (ISell item : this.stock){
            if (item instanceof Instrument){
                if (((Instrument) item).getInstrumentType() == instrumentType){
                    filteredStock.add((Instrument) item);
                }
            }
        }
        return filteredStock;
    }
}
