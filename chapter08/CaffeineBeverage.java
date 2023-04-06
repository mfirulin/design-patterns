public abstract class CaffeineBeverage {
  
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
 
	protected abstract void brew();
	protected abstract void addCondiments();
 
	private void boilWater() {
		System.out.println("Boiling water");
	}
  
	private void pourInCup() {
		System.out.println("Pouring into cup");
	}
}