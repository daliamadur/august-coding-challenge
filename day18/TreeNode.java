class TreeNode<T> {
    //variables
    private T data;
    private ArrayList<TreeNode<T>> children;

    //methods
    TreeNode(T data) { this.data = data; this.children = new ArrayList<>(); }

    public T getData() { return this.data; }

    public String toString() { return this.data.toString(); }

    public void addChild(TreeNode<T> node) { this.children.add(node); }

    public ArrayList<TreeNode<T>> getChildren() { return this.children; }
}
