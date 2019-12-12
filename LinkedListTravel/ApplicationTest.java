class ApplicationTest{

	static void main(String[] args){
		Node root = new Node("Root");
		Node child1 = new Node("Child 1");
		root.setChild(child1);
		NOde child2 = new Node("Child 2");
		child1.setChild(child2);
		Node child3 = new Node("Child 3");
		child2.setChild(child3);
		Node child4 = new Node("Child 4");
		child3.setChild(child4);
		
		root.printMyChildrenValues();
		//->root->Child 1->Child 2->Child 3->Child 4
		child2.printMyChildrenValues();
		//->Child 2 ->Child 3->Child 4
	}
}