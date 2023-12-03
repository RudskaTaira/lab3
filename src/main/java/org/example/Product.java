public class Product {
    private static int id = 0;
    public String name;
    public float price;

    public void AddProduct(String name, float price) {
        id++;
        this.name = name;
        this.price = price;
    }
}
