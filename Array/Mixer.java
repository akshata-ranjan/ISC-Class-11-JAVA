import java.util.*;

/*
 * Class Mixer
 * Combines the first 'n' elements of two single-dimensional arrays
 * in an alternate manner.
 */
class Mixer
{
    int A[], B[], C[];
    int n, m1, m2;
    Scanner sc = new Scanner(System.in);

    /*
     * Accepts array sizes, value of n,
     * and elements of both arrays.
     */
    void input()
    {
        System.out.print("Enter size of first array: ");
        m1 = sc.nextInt();
        A = new int[m1];

        System.out.print("Enter size of second array: ");
        m2 = sc.nextInt();
        B = new int[m2];

        System.out.print("Enter number of elements to be combined (n): ");
        n = sc.nextInt();

        System.out.println("Enter elements of first array:");
        for(int i = 0; i < m1; i++)
            A[i] = sc.nextInt();

        System.out.println("Enter elements of second array:");
        for(int i = 0; i < m2; i++)
            B[i] = sc.nextInt();

        // Actual number of elements that can be safely combined
        int limit = Math.min(n, Math.min(m1, m2));

        // Resultant array size is twice the number of elements combined
        C = new int[2 * limit];
    }

    /*
     * Combines elements of both arrays alternately
     * up to the permissible limit.
     */
    void combine()
    {
        int k = 0;
        int limit = C.length / 2;

        for(int i = 0; i < limit; i++)
        {
            C[k++] = A[i];
            C[k++] = B[i];
        }
    }

    /*
     * Displays the combined array.
     */
    void display()
    {
        System.out.println("Combined array:");
        for(int i = 0; i < C.length; i++)
            System.out.print(C[i] + " ");
    }

    /*
     * Main method to invoke input, combine and display.
     */
    public static void main(String args[])
    {
        Mixer obj = new Mixer();
        obj.input();
        obj.combine();
        obj.display();
    }
}
