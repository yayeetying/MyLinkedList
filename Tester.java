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

    System.out.println(listo.toString());


  }

}
