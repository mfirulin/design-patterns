
public class NYPizzaStore extends PizzaStore {
 
	protected Pizza createPizza() {
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        Pizza pizza = new CheesePizza(ingredientFactory);
        pizza.setName("New York Style Cheese Pizza");
		return pizza;
	}
}