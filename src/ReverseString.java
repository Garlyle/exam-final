public class ReverseString {
  public static void main(String[] args) {
    System.out.println(reverseString("selgaE supogaL xoF neerG"));
  }

  //Create a function that reverses a string
  private static String reverseString(String line) {
    if (line == null) {
      return null;
    }
    String ret = new String();
    for (int i = line.length(); i > 0; i--) {
      ret += line.charAt(i - 1);
    }
    return ret;
  }
}
