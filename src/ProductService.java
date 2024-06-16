import java.util.ArrayList;
import java.util.List;

public class ProductService {

    // Stock all products in the List
    List<Product> products = new ArrayList<>();

    // Add a product to the List
    public void addProduct(Product p) {
        products.add(p);
    }

    // Get all products from the List
    public List<Product> getAllProducts() {
        return products;
    }

    // Get a product by name
    public Product getProduct(String name) {
        for (Product p: products) {
           if (p.getName().equals(name))
               return p;
        }
        return null;
    }

    // Get a List of products by text
    public List<Product> getProductWithText(String text) {
        String str = text.toLowerCase();
        List<Product> prods = new ArrayList<>();

        for (Product p : products) {
            String name = p.getName().toLowerCase();
            String type = p.getType().toLowerCase();
            String place = p.getPlace().toLowerCase();
            if (name.contains(str) || type.contains(str) || place.contains(str))
                prods.add(p);
        }
        return prods;
    }
}
