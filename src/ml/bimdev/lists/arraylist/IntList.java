package ml.bimdev.lists.arraylist;

interface IntList {
    int get(int index);
    int size();
    void add(int i);
    boolean contains(int value);
    void remove(int index);
	Iterator iterator();
    int[] toArray();
    void addAll(IntList list);
    void addAll(IntList list, int offset);

}
