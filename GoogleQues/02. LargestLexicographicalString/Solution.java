import java.util.Scanner;
import java.util.TreeSet;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String A = sc.nextLine();
    String B = sc.nextLine();
    TreeSet<String> permutations = getPermutaitons(A);
    System.out.println(getLargestLexicographicalSubstring(A, B));
  }

  public static TreeSet getPermutation(String A) {

  }

  public static String getLargestLexicographicalSubstring(String A, String B) {
    // write your code here
    String ans = new String();
    TreeSet<String> t = new TreeSet<>();

    return ans;
  }
}
