package StringBuilderExecrise;

/*
 * Input: ["Java", "is", "fun"]
Output: "Java is fun"

 */
public class combine {
    public static void main(String [] args) {
        StringBuilder [] sb = new StringBuilder[3];
        sb[0] = new StringBuilder("Java");
        sb[1] = new StringBuilder("is");
        sb[2] = new StringBuilder("fun");

        StringBuilder ret = new StringBuilder();
        for ( StringBuilder s : sb ) {
            //System.out.println(s.toString());
            ret.append(s);
            ret.append(" ");
        }
        System.out.println(ret);
    }
}
