package ml.bimdev.lesson20;

class LinkedStack implements Stack
{
	Node tail;
	
	public char pop() {
		if(isEmpty())
			throw new IllegalStateException("Stack is empty.");
		char c = tail.value;
		tail = tail.previous;
		return c;
	}
	
	public void push(char c) {
		tail = new Node(c, tail);
	}

	@Override
	public boolean isEmpty()
	{
		return tail == null;
	}

	
	private class Node {
		char value;
		Node previous;
		
		Node(char value) {
			this.value = value;
		}
		
		Node(char value, Node previous) {
			this(value);
			this.previous = previous;
		}
	}
}
