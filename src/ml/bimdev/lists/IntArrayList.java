package ml.bimdev.lists;
import java.util.*;

public class IntArrayList implements IntList
{
	
    private static final int DEFAULT_CAPACITY = 10;
    private static final float EXTENSION_COEF = 1.5f;
    private int[] elements;
    private int count = 0;

    IntArrayList() {
        this.elements = new int[DEFAULT_CAPACITY];
    }

    private void grow() {
        int oldCapacity = elements.length;
        int newCapacity = (int) (oldCapacity * EXTENSION_COEF);
        int[] newElements = new int[newCapacity];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    @Override
    public int get(int index) {
        if(index < 0 || index >= count) {
            throw new IllegalArgumentException("Out of index!");
        }
        return elements[index];
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void add(int e) {
        if(count == elements.length) {
            grow();
        }
        elements[count++] = e;
    }

    @Override
    public boolean contains(int value) {
        for(int e : elements) {
			if( e == value) {
				return true;
			}
		}
		return false;
    }
	
	@Override
	public void remove(int index)
	{
		// TODO: Implement this method
	}
	
	@Override
	public Iterator iterator()
	{
		return new MyIterator();
	}

	@Override
	public int[] toArray()
	{
		return Arrays.copyOf(elements, count);
	}

	@Override
	public void addAll(IntList list)
	{
		addAll(list, 0);
	}

	@Override
	public void addAll(IntList list, int offset)
	{
		int newSize = (count + list.size() - offset);
		int[] newArray = new int[(int) (newSize * EXTENSION_COEF)];
		for(int i = 0; i < count; i++)
			newArray[i] = elements[i];
			
		for(int i = offset; i < list.size(); i++) {
			newArray[i+count] = list.get(i);
		}
		
		elements = newArray;
	}
	
	class MyIterator implements Iterator
	{
		private int currentIndex;
		MyIterator() {
			currentIndex = 0;
		}
		
		@Override
		public boolean hasNext()
		{
			return currentIndex < count;
		}

		@Override
		public int next()
		{
			return elements[currentIndex++];
		}
		
		
	}
}
