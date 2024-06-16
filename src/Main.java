import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProductService service = new ProductService();

        service.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Table", 2022));
        service.addProduct(new Product("Mac Studio", "Computer", "Light Table", 2021));
        service.addProduct(new Product("Type C", "Cable", "Black Drawer", 2002));
        service.addProduct(new Product("Wacom Pad", "Writing Pad", "Blue Table", 2023));
        service.addProduct(new Product("Java Black Book", "Cable", "Shelf", 2015));
        service.addProduct(new Product("Macbook Pro", "Laptop", "Brown Table", 2011));
        service.addProduct(new Product("Asus Rog", "Laptop", "Black Table", 2022));
        service.addProduct(new Product("Lenovo Mouse", "Mouse", "Black Table", 2022));
        service.addProduct(new Product("BlackBeast", "Computer", "White Table", 2005));

        System.out.println("========================================");
        System.out.println("Get the list of all products");
        System.out.println("--------------");
        List<Product> products = service.getAllProducts();
        for (Product p:products) {
            System.out.println(p);
        }

        System.out.println("========================================");
        System.out.println("Get a particular product by the name");
        System.out.println("--------------");
        Product p = service.getProduct("Asus Rog");
        System.out.println(p);

        System.out.println("========================================");
        System.out.println("Get the List of products with a particular text");
        System.out.println("--------------");
        List<Product> prods = service.getProductWithText("black");
        for (Product product : prods) {
            System.out.println(product);
        }

    }
}