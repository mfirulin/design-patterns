public abstract class PizzaStore {
 
	protected abstract Pizza createPizza();
 
	public Pizza orderPizza() {
		Pizza pizza = createPizza();
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}