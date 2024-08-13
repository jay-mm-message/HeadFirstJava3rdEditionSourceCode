package StringBuilderExecrise;

/*
 * Input: s = "I love Java", oldSub = "Java", newSub = "Python"
    Output: "I love Python"
 */

public class change {
    public static void main(String [] args) {
        StringBuilder sb = new StringBuilder("I love Java");
        sb.replace(7, 11, "python");
        
        System.out.println(sb.toString());
    }
}
