# Module-1-Programming-Assignment-1-

 1  public class TestMethodOverloading {
 2    /** Main method */
 3    public static void main(String[] args) {
 4      // Invoke the max method with int parameters
 5      System.out.println("The maximum of 3 and 4 is "
 6        + max(3, 4));
 7
 8      // Invoke the max method with the double parameters
 9      System.out.println("The maximum of 3.0 and 5.4 is "
10        + max(3.0, 5.4));
11
12      // Invoke the max method with three double parameters
13      System.out.println("The maximum of 3.0, 5.4, and 10.14 is "
14        + max(3.0, 5.4, 10.14));
15    }
16
17    /** Return the max of two int values */
18    public static int max(int num1, int num2) {
19      if (num1 > num2)
20        return num1;
21      else
22        return num2;
23    }
24
25    /** Find the max of two double values */
26    public static double max(double num1, double num2) {
27      if (num1 > num2)
28        return num1;
29      else
30        return num2;
31    }
32
33    /** Return the max of three double values */
34    public static double max(double num1, double num2, double num3) {
35      return max(max(num1, num2), num3);
36    }
37  }
