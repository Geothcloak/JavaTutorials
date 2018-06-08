package tree;

public class Driver {
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree(5);
		tree.add(1);
		tree.add(6);
		tree.add(7);
		tree.add(8);
		tree.contains(8);
	}
}

//TODO
//binary search tree    : add, contains, interations displayed.