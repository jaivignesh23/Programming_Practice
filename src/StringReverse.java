public class StringReverse {

  String reverse(String str) {
    StringBuilder reversedString = new StringBuilder();
    
    for (int i = str.length() - 1; i >= 0; i--) {
      reversedString.append(str.charAt(i));
    }

    return reversedString.toString();
  }

  public static void main(String[] args) {

    StringReverse rs = new StringReverse();

    String myString = "Hello World";
    System.out.println(rs.reverse(myString));
  }
}
