import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddOrderTest {
    Product first = new Product();
    Product second = new Product();
    Product third = new Product();
    Cart firstCart = new Cart();

    Order firstOrder = new Order();

    @BeforeEach
    public void init() {

        first.AddProduct("Laptop", 999.99f);
        first.AddProduct("Phone", 499.99f);
        first.AddProduct("Headphones", 79.99f);

        firstCart.AddProductToCart(first);
        firstCart.AddProductToCart(second);
        firstCart.AddProductToCart(third);
    }

    @Test
    void checkForIncludingAllElements() {

        firstOrder.AddOrder(firstCart);

        assertTrue(firstOrder.orderItems.contains(first) &&
                firstOrder.orderItems.contains(second) &&
                firstOrder.orderItems.contains(third));
    }

    @Test
    void isFunctionComplete() {
        firstOrder.AddOrder(firstCart);
        assertEquals("Complete", firstOrder.status);
    }

    @Test
    void isFunctionInProgress() {
        assertEquals("In progress", firstOrder.status);
    }
}