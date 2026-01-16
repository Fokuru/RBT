
public class Main {

	public static void main(String[] args) {
		System.out.println("running");
		//your test code here

		RedBlackTree tree = new RedBlackTree();
		tree.insert(10);
		tree.insert(20);
		tree.insert(30);
		tree.insert(40);
		tree.insert(50);
		tree.insert(60);
		tree.insert(70);
		tree.insert(80);
		tree.insert(9);
		tree.insert(8);
		tree.insert(7);
		tree.insert(6);
		tree.insert(5);
		tree.insert(4);
		tree.insert(3);
		tree.insert(2);
		tree.insert(1);
		tree.insert(0);

		tree.printTree();
		System.out.println("Is valid RBT: " + tree.isRedBlack());
	}
}
