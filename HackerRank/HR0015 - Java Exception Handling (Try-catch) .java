import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */    
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            sc.nextLine();
            int y = sc.nextInt();
            int result = x / y;
            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
