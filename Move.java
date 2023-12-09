import java.util.ArrayList;
import java.util.List;

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

class Box extends Item {
	private List<Item> items;
	private int boxNumber;

	public Box(int boxNumber) {
		this.items = new ArrayList<>();
		this.boxNumber = boxNumber;
	}

	public void addItem(Item item) {
		items.add(item);
	}

	@Override
	public void display() {
		for (Item item : items) {
			item.display();
		}
	}

	@Override
	public int find(String objectName) {
		for (Item item : items) {
			int result = item.find(objectName);
			if (result > 0) {
				return boxNumber;
			}
		}
		return -1;
	}
}