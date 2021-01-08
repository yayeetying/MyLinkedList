public class MyLinkedList {

  //instance variables
  private int size;
  private Node start, end;

  //constructor
  public MyLinkedList() {
    size = 0;
    start = null;
    end = null;
  }

  public int size() {
    return size;
  }

  //adds to the end of the list
  public boolean add(String value) {
    Node element = new Node(value);
    if (size() == 0) {
      start = element;
    }
    else {
      element.setPrev(end); //the old end of the chain
      end.setNext(element);
    }
    end = element;
    size++;
    // System.out.println("head is " + start);
    // System.out.println("tail is " + end);
    return true;
  }

  //adds to specified index
  public void add(int index, String value) {
    if (index < 0 || index > size()) {
      throw new IndexOutOfBoundsException("index inputted is baaaad");
    }
    Node element = new Node(value);
    //System.out.println(element);
    if (size() == 0) { //nothing in here, so new Node is both head and tail
      start = element;
      end = element;
    }
    else if (index == 0) { //so new Node becomes the head of chain
      element.setNext(start);
      start.setPrev(element);
      start = element;
      // System.out.println(element.getNext());
      // System.out.println(start.getPrev());
    }
    else if (index == size()) { //so new Node becomes end of chain
      element.setPrev(end);
      end.setNext(element);
      end = element;
    }
    else { //all other scenarios (ie. adding to middle)
      Node current = nthNode(index);
      element.setPrev(current);
      element.setNext(current.getNext());
      current.setNext(element);
      element.getNext().setPrev(element);
      //System.out.println(element.getNext().getPrev());
      }
    size++;
  }

  //helper method to traverse LinkedList
  //**my nthNode stops 1 Node before the actual index it wants
  private Node nthNode(int index) {
    Node current = start;
    for (int i = 1; i < index; i++) {
      current = current.getNext();
    }
    return current;
  }

  public String remove(int index) {
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException("index inputted is baaaad");
    }
    //removing current, which is on index index
    Node current = nthNode(index+1); //my nthNode stops 1 Node before the actual index it wants
    String removed = current.getData();
    if (size() == 1) { //removing both the head and tail of chain
      start = null;
      end = null;
    }
    else if (index == 0) { //removing head of chain
      start = current.getNext();
      start.setPrev(null);
      current.setNext(null);
    }
    else if (index == size() -1) { //removing tail of chain
      end = current.getPrev();
      end.setNext(null);
      current.setPrev(null);
    }
    else { //removing from middle of chain
      current.getPrev().setNext(current.getNext()); //makes more sense if you draw it out
      current.getNext().setPrev(current.getPrev());
    }
    size--;
    return removed;
  }

  public String get(int index) {
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException("index is badddd");
    }
    Node want = nthNode(index+1); //my nthNode stops 1 Node before the actual index it wants
    return want.getData();
  }

  public String set(int index, String value) {
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException("index is badddd");
    }
    Node want = nthNode(index+1); //my nthNode stops 1 Node before the actual index it wants
    String prev = want.getData();
    want.setData(value);
    return prev;
  }

  public String toString() {
    String ans = "[";
    Node current = start;
    for (int i = 0; i < size(); i++) {
      //System.out.println(current.getData());
      ans += current.getData();
      if (i != size()-1) ans += ", ";
      current = current.getNext();
    }
    return ans + "]";
  }

  public String toStringReversed() {
    String ans = "[";
    Node current = end;
    for (int i = size(); i > 0; i--) {
      ans += current.getData();
      if (i != 1) ans += ", ";
      current = current.getPrev();
    }
    return ans + "]";
  }


}
