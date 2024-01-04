public class InfiniteLoop {

  public static void main(String[] args) {
    do {
      System.out.println("Hey");
    } while (false); //true in case of infinite loop
  }
}
