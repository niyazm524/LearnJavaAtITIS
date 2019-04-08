package ml.bimdev.lesson33;

public interface BinarySearchTree<T extends Comparable<T>> {
    void insert(T t);

    boolean contains(T t);

    boolean remove(T t);

    void printAll();

    void printAllByLevels();
}
