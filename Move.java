

abstract class Item {
	public abstract void display();

	public abstract int find(String objectName);
}

class SingleObject extends Item {
	private String name;

	public SingleObject(String name) {
		this.name = name;
	}

	@Override
	public void display() {
		System.out.println(name);
	}

	@Override
	public int find(String objectName) {
		return name.equals(objectName) ? 1 : -1;
	}
}







