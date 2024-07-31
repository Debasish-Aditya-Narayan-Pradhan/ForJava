public class Solution {
    public static int minimumLength(String s) {
        StringBuilder str = new StringBuilder(s);

        for(int i = str.length() - 1; i > 0; i--)  //abaacbcbb
        {
            int j = i - 1;
            int l_idx = -1;
            int r_idx = -1;
            while (j >= 0) {
                if (str.charAt(i) == str.charAt(j)) {
                    l_idx = j;
                    break;
                }
                j--;
            }
            int k = i + 1;
            while (k < str.length()) {
                if (str.charAt(i) == str.charAt(k)) {
                    r_idx = k;
                    // System.out.println(k);
                    break;
                }
                k++;
            }
            if (l_idx != -1 && r_idx != -1) {
                str.deleteCharAt(l_idx);
                str.deleteCharAt(r_idx - 1);
            }
            System.out.println(str);
        }
        String s1 = str.toString();
        s1 = s1.trim();
        System.out.println(s1);
        return s1.length();
    }
    public static void main(String[] args) {
        String str = "ucvbutgkohgbcobqeyqwppbxqoynxeuuzouyvmydfhrprdbuzwqebwuiejoxsxdhbmuaiscalnteocghnlisxxawxgcjloevrdcj";
        System.out.println(minimumLength(str));
    }
}