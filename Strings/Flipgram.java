import java.util.*;

class Flipgram
{
    String word;   // stores the input word

    // Parameterized constructor to initialize the word
    Flipgram(String s)
    {
        word = s;
    }

    // Method to check whether the word is a heterogram
    // Returns false if any character is repeated
    boolean ishetero()
    {
        for(int i = 0; i < word.length(); i++)
        {
            for(int j = i + 1; j < word.length(); j++)
            {
                // If two characters are same, it is not a heterogram
                if(word.charAt(i) == word.charAt(j))
                    return false;
            }
        }
        // No repeated characters found
        return true;
    }

    // Method to flip the word by swapping its halves
    String flip()
    {
        int l = word.length();   // length of the word
        int a = l / 2;           // midpoint of the word

        // If length is even, swap two equal halves
        if(l % 2 == 0)
            return word.substring(a) + word.substring(0, a);
        // If length is odd, keep the middle character unchanged
        else
            return word.substring(a + 1) + word.charAt(a) + word.substring(0, a);
    }

    // Displays message if the word is a heterogram
    void display()
    {
        System.out.println("Heterogram");
    }

    // Main method
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);  // Scanner object for input
        String b = sc.next();                 // reads the input word

        Flipgram S = new Flipgram(b);          // object creation

        // If not a heterogram, print the flipped word
        if(!S.ishetero())
            System.out.println(S.flip());
        // Otherwise, display message
        else
            S.display();
    }
}
