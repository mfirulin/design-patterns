public class ChicagoPizzaStore extends PizzaStore {

	protected Pizza createPizza() {
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        Pizza pizza = new CheesePizza(ingredientFactory);
        pizza.setName("Chicago Style Cheese Pizza");
		return pizza;
	}
}