public class Node {

  //instance variables
  private String data;
  private Node next, prev;

  //constructor
  public Node(String value) {
    data = value;
    next = null;
    prev = null;
  }

  public String getData() {
    return data;
  }

  public Node getNext() {
    return next;
  }

  public Node getPrev() {
    return prev;
  }

  public void setData(String value) {
    data = value;
  }

  //setting next to another Node's address
  public void setNext(Node next) {
    this.next = next;
  }

  //setting prev to another Node's address
  public void setPrev(Node prev) {
    this.prev = prev;
  }

}
