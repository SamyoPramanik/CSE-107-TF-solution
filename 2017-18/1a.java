import java.util.Scanner;
import java.util.StringTokenizer; // Importing the StringTokenizer class

public class solve{
    public static void main(String[] args) {
        // Inititalizing our scanner and taking string input
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        // Our delimeter(is explained in the note) is space
        // Using Stringtokenizer we can tokenize our string with the intended delimiter which is " " in out case

        // Creating a stringtokenizer object
        StringTokenizer tokenizer = new StringTokenizer(str, " ");

        // Output
        System.out.println(tokenizer.countTokens()); // Number of tokens

        while(tokenizer.hasMoreTokens()){ // While there are more tokens
            System.out.println(tokenizer.nextToken()); // Print the next token
        }

        scanner.close();
    }
}

/*
    Note:
        A token is a sequence of characters that ends with a delimiter.
        In this case, the delimiter is space.
        So, the string "Hello World" has two tokens: "Hello" and "World"
*/