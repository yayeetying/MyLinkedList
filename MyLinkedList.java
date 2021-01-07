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
    return true;
  }

  
}
