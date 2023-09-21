import entities.ImportedProduct;
import entities.Product;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Product produto = new Product("Iphone", 2500.00);
        ImportedProduct produto1 = new ImportedProduct("Iphone", 2500.00, 200.00);

        System.out.println(produto.priceTag());
        System.out.println(produto1.priceTag());
    }
}