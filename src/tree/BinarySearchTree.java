package tree;

public class BinarySearchTree {
	Leaf headLeaf = null;
	
	public BinarySearchTree(int value) {
		this.headLeaf = new Leaf(value);
	}
	
	public void add(int value) {
		Leaf currentLeaf = headLeaf;
		int interations = 0;
		
		while (true) {
			interations++;
			if (value < currentLeaf.getValue()) {
				if (currentLeaf.getLeft() == null) {
					Leaf newLeaf = new Leaf(value);
					currentLeaf.setLeft(newLeaf);
					break;
				}
				else {
					currentLeaf = currentLeaf.getLeft();
				}
			}

			if (value > currentLeaf.getValue()) {
				if (currentLeaf.getRight() == null) {
					Leaf newLeaf = new Leaf(value);
					currentLeaf.setRight(newLeaf);
					break;
				}
				else {
					currentLeaf = currentLeaf.getRight();
				}
			}
		}
		System.out.println("interations = " + interations);
	}
	
	public boolean contains(int value) {
		Leaf currentLeaf = headLeaf;
		int interations = 0;
		while (true) {
			interations++;
			if (value == currentLeaf.getValue()) {
				System.out.println("yes contains " + value);
				System.out.println("interations = " + interations);
				return true;
			}

			if (value < currentLeaf.getValue()) {
				if (currentLeaf.getLeft() == null) {
					System.out.println("no does not contain " + value);
					System.out.println("interations = " + interations);
					return false;
				}
				else {
					currentLeaf = currentLeaf.getLeft();
				}
			}
			
			if (value > currentLeaf.getValue()) {
				if (currentLeaf.getRight() == null) {
					System.out.println("no does not contain " + value);
					System.out.println("interations = " + interations);
					return false;
				}
				else {
					currentLeaf = currentLeaf.getRight();
				}
			}
		}
	}

	public void print() {
		
	}
}
