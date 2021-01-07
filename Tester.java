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
    

  }

}
