import java.util.Arrays;

public class assignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;

        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                i++;
            }
            j++;
        }

        return i;
    }

    public static void main(String[] args) {
        int[] g = {1, 2, 3};
        int[] s = {1, 1};

        assignCookies obj = new assignCookies();
        int result = obj.findContentChildren(g, s);
        System.out.println("Number of content children: " + result);
    }
}
