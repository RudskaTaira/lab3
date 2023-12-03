import java.util.ArrayList;
import java.util.List;

public class Cart {
    public Cart() {
        listOfProducts = new ArrayList<>();
    }

    List<Product> listOfProducts;

    void AddProductToCart(Product product) {
        listOfProducts.add(product);
    }

    void RemoveProductFromCart(Product product) {
        listOfProducts.remove(product);
    }

}
