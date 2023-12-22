package entities;

public class ImportedProduct extends Product {

    private Double customsFee;

    public ImportedProduct(Double customsFee) {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public double totalPrice() {
        return getPrice() + customsFee;
    }

    /*method override to return priceTag for the class ImportedProduct with name, price and now customsFee.
    for access the attributes of class Product, for example attribute name or price, will have use getName() and getPrice(). */
    @Override
    public String priceTag() {
        return getName() + " $ " + String.format("%.2f", totalPrice()) + " (customs fee: $ " +  String.format("%.2f", customsFee) + ")";
    }

}
