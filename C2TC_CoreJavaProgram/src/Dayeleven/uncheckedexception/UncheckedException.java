// Program to demonstrate unchecked exception
package Dayeleven.uncheckedexception;

public class UncheckedException {

    public static void main(String[] args) {
        int[] x;

        try {
            x = new int[] { 1, 2, 3, 4 }; // indices: 0, 1, 2, 3
            System.out.println(x[6]);    // Invalid access
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Specified index does not exist. " + e.getMessage());
        }
    }
}
