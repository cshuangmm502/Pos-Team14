package com.company;

/**
 * Created by Terryblade on 2016/6/25.
 */
public class Item {
    private String barcode;
    private String name;
    private String unit;
    private double price;
    private double discount;
    private  boolean promotion;
    public Item() {

    }

    public Item(String barcode, String name, String unit, double price) {

        this.setBarcode(barcode);
        this.setName(name);
        this.setUnit(unit);
        this.setPrice(price);
    }
    public Item(String barcode, String name, String unit, double price, double discount) {
        this(barcode, name, unit, price);
        this.setDiscount(discount);
    }

    public Item(String barcode, String name, String unit, double price, boolean promotion) {
        this(barcode, name, unit, price);
        this.setPromotion(promotion);
    }

    public String getName() {
        return name;
    }
    public String getUnit() {
        return unit;
    }

    public double getPrice() {
        return price;
    }

    public String getBarcode() { return barcode; }

    public double getDiscount() {
        if (discount == 0.00)
            return 1.00;
        return discount;
    }

    public boolean getPromotion(){return promotion;}

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setPromotion(boolean promotion){this.promotion=promotion;}
}
