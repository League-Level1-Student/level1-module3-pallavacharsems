package _02_backpack;

public class BackpackRunner {
	public static void main(String[] args) {
		Backpack ice = new Backpack();
		Pencil pencil = new Pencil();
		Ruler ruler = new Ruler();
		Textbook textbook = new Textbook();
		ice.putInBackpack(pencil);
		ice.putInBackpack(ruler);
		ice.putInBackpack(textbook);
		ice.packAndCheck();
	}
}
