package StringBuilderExecrise;

/*
 * Input: "hello"
Output: "olleh"
 */
public class reverse {

    public static StringBuilder revert(StringBuilder sb) {
        StringBuilder rvsb = new StringBuilder();

        for (int i = sb.length() - 1 ; i >= 0 ; --i) {
            rvsb.append(sb.charAt(i));
        }
        return rvsb;
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        StringBuilder rvsb = revert(sb);

        System.out.println("sb: " + sb);
        System.out.println("revert sb: " + rvsb);
    }
}
