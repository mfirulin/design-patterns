public class ChicagoPizzaStore extends PizzaStore {

    public Pizza createPizza() {
        return new ChicagoStylePizza();
    }
}
