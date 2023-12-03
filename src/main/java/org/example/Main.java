public class Main {
    public static void main(String[] args) {
        Product first = new Product();
        first.AddProduct("Laptop", 999.99f);

        Product second = new Product();
        first.AddProduct("Phone", 499.99f);

        Product third = new Product();
        first.AddProduct("Headphones", 79.99f);

        Cart firstCart = new Cart();
        firstCart.AddProductToCart(first);
        firstCart.AddProductToCart(second);
        firstCart.AddProductToCart(third);

        firstCart.RemoveProductFromCart(first);

        Order firstOrder = new Order();
        firstOrder.AddOrder(firstCart);
        firstOrder.GetStatus();

    }
}