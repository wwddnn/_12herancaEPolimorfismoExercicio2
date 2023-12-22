package entities;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

//the  subclass UseProduct extends the superclass Product.
public class UseProduct extends Product  {

    private LocalDate manufactureDate;


    public UseProduct() {
        super();
    }

    public UseProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    //method to return priceTag for the class UseProduct with name, price and now manufacture Date..
    //for access the attributes of class Product, for example attribute name or price, will have use getName() and getPrice().
    @Override
    public String priceTag() {
        return String.format(getName() + " ( used ) $ " + String.format("%.2f", getPrice()) + " (manufacture date: " + manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")" );
    }

}
