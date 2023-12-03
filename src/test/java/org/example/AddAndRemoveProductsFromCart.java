import org.junit.jupiter.api.Test;

class addAndRemoveProductsFromCart {
    Product first = new Product();
    Cart firstCart = new Cart();

    @Test
    void addLaptopToCart() {
        first.AddProduct("Laptop", 999.99f);
        firstCart.AddProductToCart(first);

        assertTrue(firstCart.listOfProducts.contains(first));
    }

    @Test
    void removeLaptopFromCart() {
        first.AddProduct("Laptop", 999.99f);

        firstCart.AddProductToCart(first);
        firstCart.RemoveProductFromCart(first);

        assertFalse(firstCart.listOfProducts.contains(first));
    }
}