import java.util.Arrays;

public class Tester {

  public static void main(String[] args) {
    MyLinkedList listo = new MyLinkedList();
    System.out.println(listo.size());
    System.out.println(listo.add("REE"));
    System.out.println(listo.add("cuz"));
    System.out.println(listo.add("dog"));
    System.out.println(listo.toString());

    listo.add(0, "wake"); //add to beginning
    listo.add(0, "early");
    System.out.println(listo.toString());
    listo.add(listo.size(), "head"); //add to end
    listo.add(listo.size(), "hurts");
    System.out.println(listo.toString());
    listo.add(3, "coffee"); //add to middle
    listo.add(5, "where");
    listo.add(2, "at");
    System.out.println(listo.toString());
    System.out.println(listo.toStringReversed());

    System.out.println();
    for (int i = 0; i < listo.size(); i++) {
      System.out.println(listo.get(i));
    }

    System.out.println();
    System.out.println(listo.toString());
    for (int i = 0; i < listo.size(); i++) {
      System.out.print(listo.set(i, "hungi") + " ");
    }
    System.out.println();
    System.out.println(listo.toString());

    System.out.println();
    System.out.println("testing throws");
    try {
      listo.add(-1, "owo"); }
    catch(IndexOutOfBoundsException e) {
      System.out.println("yayyy"); }

    try {
      listo.add(listo.size()+1, "owo"); }
    catch(IndexOutOfBoundsException e) {
      System.out.println("yayyy"); }

    try {
      listo.add(100, "owo"); }
    catch(IndexOutOfBoundsException e) {
      System.out.println("yayyy"); }

    listo.add(listo.size(), "owo"); //this should work (it's like adding to end of list)
    System.out.println(listo.toString());

    System.out.println();
    try {
      listo.get(-1);
    }
    catch(IndexOutOfBoundsException e) {
      System.out.println("yaaaaay");
    }

    try {
      listo.get(listo.size());
    }
    catch(IndexOutOfBoundsException e) {
      System.out.println("yaaaaay");
    }

    try {
      listo.get(listo.size()+1);
    }
    catch(IndexOutOfBoundsException e) {
      System.out.println("yaaaaay");
    }

    try {
      listo.get(100);
    }
    catch(IndexOutOfBoundsException e) {
      System.out.println("yaaaaay");
    }

    System.out.println();
    System.out.println(listo.toString());
    try {
      listo.set(-1, "teehee");
    }
    catch(IndexOutOfBoundsException e) {
      System.out.println("yaaaaay");
    }

    listo.set(0, "teehee"); //should work (adding to beginning)

    try {
      listo.set(listo.size(), "teehee");
    }
    catch(IndexOutOfBoundsException e) {
      System.out.println("yaaaaay");
    }

    try {
      listo.set(listo.size()+1, "teehee");
    }
    catch(IndexOutOfBoundsException e) {
      System.out.println("yaaaaay");
    }

    try {
      listo.set(50, "teehee");
    }
    catch(IndexOutOfBoundsException e) {
      System.out.println("yaaaaay");
    }

    for (int i = 0; i < listo.size(); i++) {
      System.out.println(listo.set(i, Integer.toString(i)));
    }
    System.out.println(listo.toString());
    System.out.println(listo.toStringReversed());
    System.out.println();

    //~~~~~~~~~~~~~~~~~~~~~//

    //listo has [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    MyLinkedList clone1 = new MyLinkedList(); //delete all from beginning
    MyLinkedList clone2 = new MyLinkedList(); //delete all from end
    MyLinkedList clone3 = new MyLinkedList(); //delete all from middle

    for (int i = 0; i < listo.size(); i++) {
      clone1.add(Integer.toString(i));
    }
    for (int i = 0; i < listo.size(); i++) {
      clone2.add(Integer.toString(i));
    }
    for (int i = 0; i < listo.size(); i++) {
      clone3.add(Integer.toString(i));
    }
    System.out.println(clone1.toString());
    System.out.println(clone2.toString());
    System.out.println(clone3.toString());

    while (clone1.size() != 0) {
      System.out.print(clone1.remove(0) + " ");
    }

    System.out.println();
    System.out.println(clone1.toString());
    System.out.println(clone1.toStringReversed());
    System.out.println();

    while (clone2.size() != 0) {
      System.out.print(clone2.remove(clone2.size()-1) + " ");
    }

    System.out.println();
    System.out.println(clone2.toString());
    System.out.println(clone2.toStringReversed());
    System.out.println();

    for (int i = 0; i < 5; i++) {
      System.out.print(clone3.remove(5) + " ");
    }
    while (clone3.size() != 0) {
      System.out.print(clone3.remove(0) + " ");
    }

    System.out.println();
    System.out.println(clone3.toString());
    System.out.println(clone3.toStringReversed());
    System.out.println();

  }

}
