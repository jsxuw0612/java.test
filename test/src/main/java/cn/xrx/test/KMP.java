package cn.xrx.test;

/**
 * @author Administrator
 */
public class KMP {
    private static int[] getNext(String s) {
        int len = s.length(), k = -1, j = 0;
        int[] next = new int[len];
        next[0] = -1;
        while (j < len - 1) {

            //s.charAt(k)表示前缀，s.charAt(j)表示后缀
            if (k == -1 || s.charAt(k) == s.charAt(j)) {
                k++;
                j++;
                next[j] = k;
            } else {
                k = next[k];
            }
        }
        return next;
    }

    public static void main(String[] args) {
        int[] next = getNext(new String("ABCDABD"));
        for (int i : next) {
            System.out.print(i + ",");
        }
        // String s = "ABCDABD";
        // String p = "ABD";
        // KMP kmp = new KMP();
        // int i = kmp.KmpSearch(s, p);
    }


    private int KmpSearch(String s, String p) {
        int i = 0;
        int j = 0;

        int sLen = s.length();
        int pLen = p.length();
        int[] next = new int[sLen];
        while (i < sLen && j < pLen) {
            //①如果j = -1，或者当前字符匹配成功（即S[i] == P[j]），都令i++，j++
            if (j == -1 || s.charAt(i) == p.charAt(j)) {
                i++;
                j++;
            } else {
                //②如果j != -1，且当前字符匹配失败（即S[i] != P[j]），则令 i 不变，j = next[j]
                //next[j]即为j所对应的next值
                j = next[j];
            }
        }
        if (j == pLen) {
            return i - j;
        } else {
            return -1;
        }
    }
}
