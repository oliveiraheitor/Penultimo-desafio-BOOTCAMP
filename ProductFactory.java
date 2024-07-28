public class ProductFactory {

    public Product createProduct() {
        return new ConcreteProduct();
    }
}