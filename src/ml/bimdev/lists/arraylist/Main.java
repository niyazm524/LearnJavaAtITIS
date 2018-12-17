package ml.bimdev.lists.arraylist;

public class Main {

    public static void main(String[] args) {
        IntList list = new IntArrayList();
		list.add(41);
		list.add(43);
		list.add(45);
		list.add(47);
		
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			int e = iterator.next();
			System.out.println(e);
		}
    }
}
