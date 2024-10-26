public void depthFirstSearch(TreeNode<T> target) {
        if (root == null) {
            System.out.println("Tree is empty :(");
            return;
        }
        
        Stack<TreeNode<T>> stack = new Stack<TreeNode<T>>();
        TreeNode<T> node = root;
        TreeNode<T> current;
        boolean found = false;

        stack.push(node);

        while (!stack.isEmpty()) {
            current = stack.pop();

            if (current.getData().equals(target.getData())) {
                System.out.println("Node " + target.getData() + " found!");
                found = true;
                break;
            } else {
                for (int i = current.getChildren().size() -1; i >= 0; i--) {
                    //push in reverse order
                    stack.push(current.getChildren().get(i));
                }
            }
        }

        if (!found) {
            System.out.println("Node not found");
        }
    }
