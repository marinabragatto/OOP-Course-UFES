public class Main {
  public static void main(String[] args) {
    Vector<Integer> v = new Vector<>();

    v.add(10);
    v.add(20);
    v.add(30);

    System.out.println("v = " + v); // [10, 20, 30]
    System.out.println("size = " + v.size()); // 3

    v.set(1, 99);
    System.out.println("v[1] = " + v.get(1)); // 99

    Vector<String> w = new Vector<>();

    w.add("Bom");
    w.add("dia");
    w.add("Galera");

    System.out.println(w);
    String my_item = w.get(1);
    System.out.println(my_item);
  }
}
