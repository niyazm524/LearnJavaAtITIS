package ml.bimdev.lesson33;


import java.util.StringJoiner;

public class BinarySearchTreeImpl<T extends Comparable<T>> implements BinarySearchTree<T> {
    private TreeNode root;

    @Override
    public void insert(T t) {
        root = insert(root, t);
    }

    private TreeNode insert(TreeNode parent, T t) {
        if (parent == null) {
            parent = new TreeNode(t);
        } else {
            if (parent.value.compareTo(t) > 0)
                parent.left = insert(parent.left, t);
            else
                parent.right = insert(parent.right, t);
        }
        return parent;
    }

    @Override
    public boolean contains(T t) {
        return contains(root, t);
    }

    private boolean contains(TreeNode parent, T t) {
        if (parent != null) {
            if (parent.value.equals(t))
                return true;
            else {
                return contains(parent.left, t) || contains(parent.right, t);
            }
        }
        return false;
    }

    @Override
    public boolean remove(T t) {
        return false;
    }

    @Override
    public void printAll() {
        printAll(root);
    }

    private void printAll(TreeNode parent) {
        if (parent != null) {
            System.out.println(parent.value);
            printAll(parent.left);
            printAll(parent.right);
        }
    }

    @Override
    public void printAllByLevels() {
        printAllByLevels(root, 0);
    }

    private void printAllByLevels(TreeNode parent, int depth) {
        if (parent != null) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < depth - 1; i++) {
                stringBuilder.append("    ");
            }
            if (parent.right != null) {
                stringBuilder.append("|   ");
            } else {
                stringBuilder.append("    ");
            }
            stringBuilder.append("|➖➖+ ");
            stringBuilder.append(parent.value);
            System.out.println(stringBuilder.toString());
            printAllByLevels(parent.left, depth + 1);
            printAllByLevels(parent.right, depth + 1);
        }
    }

    private String repeat(String str, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }

    private class TreeNode {
        T value;
        TreeNode left, right;

        public TreeNode(T value) {
            this.value = value;
        }

        TreeNode setLeft(TreeNode node) {
            left = node;
            return this;
        }

        TreeNode setRight(TreeNode node) {
            right = node;
            return this;
        }
    }
}
