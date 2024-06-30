package Question6;


/**
 *
 *   This can be visualised as
 *   0  6    12
 *   1 57  11
 *   24 810
 *   3  9
 *
 *
 *
 *
 *
 *
 *
 *
 */
public class Solution {

    public static void main(String[] args) {

        String s = "PAYPALISHIRING";
        int n = 3;
        System.out.println(convert(s, n));
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        int jump = 2 * numRows - 2;
        StringBuilder ss = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            int j = i;
            System.out.println();
            while (j < s.length()) {
                if (i == 0 || i == numRows - 1) {
                    System.out.print(j + "->");
                    ss.append(s.charAt(j));
                    j += jump;
                } else {
                    System.out.print(j + "->");
                    ss.append(s.charAt(j));
                    int k = j + jump - 2 * i;
                    if (k < s.length()) {
                        System.out.print(k + "->");
                        ss.append(s.charAt(k));
                    }
                    j += jump;
                }
            }


        }

        return ss.toString();
    }

}