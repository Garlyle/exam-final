public class ReverseString {
  public static void main(String[] args) {
    String lineToReverse = "selgaE supogaL xoF neerG";
    String reversedLine = reverseString(lineToReverse);

    System.out.println(reversedLine);
  }

  //Create a function that reverses a string
  private static String reverseString(String line) {
    String ret = new String();
    for (int i = line.length(); i > 0; i--) {
      ret += line.charAt(i - 1);
    }
    return ret;
  }
}
