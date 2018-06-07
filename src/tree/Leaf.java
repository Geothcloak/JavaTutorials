package tree;

public class Leaf {
	Leaf left;
	Leaf right;
	int value;

	public Leaf (int value){
		this.left = null;
		this.right = null;
		this.value = value;
	}

	public Leaf getLeft() {
		return left;
	}

	public void setLeft(Leaf left) {
		this.left = left;
	}

	public Leaf getRight() {
		return right;
	}

	public void setRight(Leaf right) {
		this.right = right;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}