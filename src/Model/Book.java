package Model;

import java.util.Random;

public class Book {

    private String id;
    private String title;
    private String author;
    private double price;
    private String publishingHouse;
    private boolean isForeign;
    private int stockUnits;

    public Book() {
        setId(id);
        // add method to save the book in a file CSV
    }

    public String getId() {
        return id;
    }

    private void setId(String id) {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(999999);
        // add a check to make sure the number is unique
        id = "ID" + Integer.toString(randomNumber);
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public boolean getIsForeign() {
        return isForeign;
    }

    public void setIsForeign(boolean foreign) {
        isForeign = foreign;
    }

    public int getStockUnits() {
        return stockUnits;
    }

    public void setStockUnits(int stockUnits) {
        this.stockUnits = stockUnits;
    }

}
