import java.util.Iterator;

public abstract class MenuComponent {
    protected String name;
	protected String description;

    public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
   
	protected void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	protected void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	protected MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
	protected double getPrice() {
		throw new UnsupportedOperationException();
	}
	protected boolean isVegetarian() {
		throw new UnsupportedOperationException();
	} 
	protected void print() {
		throw new UnsupportedOperationException();
	}

    protected abstract Iterator<MenuComponent> createIterator();
}