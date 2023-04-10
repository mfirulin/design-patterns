public class NYPizzaStore extends PizzaStore {
    
    public Pizza createPizza() {
        return new NYStylePizza();
    }
}
