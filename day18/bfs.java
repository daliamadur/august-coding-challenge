    public void breadthFirstSearch(TreeNode<T> target) {
        
        if (root == null) {
            System.out.println("Tree is empty :(");
            return;
        }
        
        Queue<TreeNode<T>> queue = new LinkedList<TreeNode<T>>();
        TreeNode<T> node = root;
        TreeNode<T> current;
        boolean found = false;

        queue.add(node);

        while (!queue.isEmpty()) {
            current = queue.poll();

            if (current.getData().equals(target.getData())) {
                System.out.println("Node " + target.getData() + " found!");
                found = true;
                break;
            } else {
                for (TreeNode<T> n : current.getChildren()) {
                    queue.add(n);
                }
            }
        }

        if (!found) {
            System.out.println("Node not found");
        }
    }
