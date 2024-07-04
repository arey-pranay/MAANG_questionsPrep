import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int k = sc.nextInt();
    System.out.println(remChar(s, k));
    return;
  }

  public static String remChar(String s, int k) {
    // write your code here
    StringBuilder ans = new StringBuilder();
    while (k > 0) {
      ans.append(s);
      k--;
    }
    System.out.println(ans);

    while (ans.length() > 1) {
      removeAlt(ans, true);
      if (ans.length() > 1)
        removeAlt(ans, false);
    }
    return ans.toString();
  }

  // while removing from beginning, koi bhi number, abhi tk kitne delete ho chuke
  // hai, utna piche aayega. humesha us number ke pehle even delete hue hai.
  // 2 ke 2/2 =1 . 4 ke liye 4/1 = 2. 6 ke liye 6/2 = 3. To isliye effectively 1
  // hi number aage se krna hai delete
  public static void removeAlt(StringBuilder str, boolean beg) {
    if (beg) {
      int i = 0;
      while (i < str.length()) {
        str.deleteCharAt(i++);
      }
      // removing from end does not affect other
    } else {
      int i = str.length() - 1;
      while (i > 0) {
        str.deleteCharAt(i--);
        i--;
      }
    }
  }
}
