package entities;

public class ImportedProduct extends Product {
    public Double customsFee;

    public ImportedProduct(Double customsFee) {
        this.customsFee = customsFee;
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double totalPrice(Double customsFee) {
        return price + customsFee;
    }

    @Override
    public String priceTag() {
        return getName() + " $ " + totalPrice(customsFee) + "(Customs fee: $ " + customsFee + ")";
    }
}
