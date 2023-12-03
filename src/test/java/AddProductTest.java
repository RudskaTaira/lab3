import static org.junit.jupiter.api.Assertions.*;

import org.example.Product;
import org.junit.jupiter.api.Test;

class AddProductTest {
    String name;
    float price;
    Product product = new Product();

    @Test
    void addLaptopToProducts() {
        name = "Laptop";
        price = 999.99f;
        product.AddProduct(name, price);
        assertTrue(name == product.name && price == product.price);
    }

    @Test
    void addPhoneToProducts() {
        name = "Phone";
        price = 499.99f;
        product.AddProduct(name, price);
        assertTrue(name == product.name && price == product.price);
    }

    @Test
    void addHeadphonesToProducts() {
        name = "Headphones";
        price = 79.99f;
        product.AddProduct(name, price);
        assertTrue(name == product.name && price == product.price);
    }


}