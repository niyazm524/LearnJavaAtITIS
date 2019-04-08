package ml.bimdev.lesson33;

import java.util.Random;

class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTreeImpl<>();
        (new Random()).ints(15, 0, 30).forEach(tree::insert);
        tree.printAllByLevels();
    }
}
