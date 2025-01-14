/**
 (a). What is the output of str.length()?
     ** 18
 (b). What are words w1 and w2 and what is the result of w1.equals(w2)?
     ** w1 and w2 are substrings of str and result of w1.equals(w2) is true
 (c). What do the two arguments (3,5) and (16,18) of the two invocations of
 str.substring() mean?
     ** These arguments define the range of characters that will be extract in str.
 (d). Change the equality test at line 19 to the following statement. Compile and
 run the program again. What is the result? Why do you think it is?
 boolean equal = (w1 == w2);
     ** The result will be false because "==" operator compare references for objects and values for primitives
     **while equals() compares contents
 (e). Given the usage of toCharArray, what is another way of determining the
 number of characters in the string str? Using comments, briefly write the
 instructions that you would write in the main method to make this happen.
    **String str length can be determined by using the length() method of the string itself
 (f). What is the effect of the operator +?
    **The + operator is used for both arithmetic addition
    **and string concatenation
 (g). What would the output at the last line tell you about strings in Java?
    ** It represents str as a character array
 **/
package Week02.Tut02_Class01;

import java.util.Arrays;
/**
 3 * This class implements a simple program that
 4 * will initialise a string, performs some
 5 * basic operations on it and prints the results on the
 6 * standard output
 7 */
public class Activity06 {
    public static void main(String[] args) {
        /* Declare the variables. */
        String str = "to be or not to be";
        /* Do some operations on string */
        char chars[] = str.toCharArray();
        // convert the array to string
        String charsAsString = Arrays.toString(chars);
        int len = str.length();
        String w1 = str.substring(3,5);
        String w2 = str.substring(16,18);
        boolean equal = w1.equals(w2);
        /* Print out the results */
        System.out.println("string: " + str);
        System.out.println("length: " + len);
        System.out.println("word 1: " + w1);
        System.out.println("word 2: " + w2);
        System.out.println("word 1 is equal to word 2? " + equal);
        System.out.println("characters: " + charsAsString);
    } // end of main()
} // end of class Strings

