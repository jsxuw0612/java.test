package cn.xrx.test;

import java.util.*;

/**
 * @author xrx
 */
public class test3 {

    public static void main(String[] args) {
        // String a = "\u4f18\u79c0";
        // System.out.println(a);
        // // int[] nums = {1,2,3,4,5,6,7,8,9};
        // int i = Integer.bitCount(8);
        // System.out.println("i = " + i);
        // String s = "shfiuslaf";
        // boolean b = s.contains("ius");
        // System.out.println("b = " + b);

        // String s = "900 aaa";
        // char[] chars = s.toCharArray();
        // for (char aChar : chars) {
        //
        // }
        // String s1 = s.split(" ")[0];
        // for (String s2 : s1) {
        //     System.out.print(s2+",");
        // }
        // Integer integer = Integer.valueOf(s1);
        // Map<String, String> map = new HashMap<>();
        // map.put(map.getOrDefault(), )

        // String s = "keysdaasd.";
        // char c = 'a';
        // boolean letter = Character.isLetter(c);
        // StringBuilder sb = new StringBuilder();
        // sb.append(Character.toLowerCase(c));
        // sb.length();
        //
        // Set<Integer> set = new HashSet<>();


        /*String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        test3  t = new test3();
        String s = t.mostCommonWord(paragraph, banned);
        System.out.println(s);*/

        // List<Integer> list = new ArrayList<>();
        // ListIterator<Integer> integerListIterator = list.listIterator();

        // Set<Character> set = new HashSet<Character>(
        //         'a',
        //         'e',
        //         'i',
        //         'o',
        //         'u'
        // );
        // boolean a = set.contains('a');
        // System.out.println(a);

        // StringBuilder sb = new StringBuilder();
        // String s = "abcd";
        // sb.append(s.substring(1));
        // sb.deleteCharAt(sb.length());
        // System.out.println(sb.toString());

        // test3 test3 = new test3();
        // // boolean b = test3.buddyStrings("ab",
        // //         "babbb");
        // // System.out.println(b);
        // int[] a = new int[]{1,2,3,4,5,6};
        // int[] ints = Arrays.copyOf(a, 2);
        // Map<Integer, Integer> map = new HashMap<>();
        // map.put(1, 1);
        // System.out.println(1<<30);
        // System.out.println(Integer.MAX_VALUE);
        // for (Integer value : map.values()) {
        //
        // }
        // for (int i : ints) {
        //     System.out.print(i + ",");
        // }
        // String s = "d";
        // int aa = s.compareTo("aa");
        int x = 10;
        int a = x / 10;
        System.out.println(a);
        int b = x % 10;
        System.out.println(b);
        Set<LinkedList> set = new HashSet<>();

    }

    public boolean buddyStrings(String s, String goal) {
        int lenS = s.length();
        int lenGoal = s.length();
        int first = -1, second = -1;
        if (lenS != lenGoal) {
            return false;
        }
        if (s.equals(goal)) {
            if (lenS > 26) {return true;}
            else {
                int[] word = new int[26];
                for (int i = 0; i < lenS; i++) {
                    char c = s.charAt(i);
                    word[c-'a']++;
                }
                for (int n : word) {
                    if (n > 1) return true;
                }
                return false;
            }
        } else {
            for (int i = 0; i < lenS; i++) {
                if (s.charAt(i) != goal.charAt(i)) {
                    if (first == -1) {
                        first = i;
                    } else if (second == -1) {
                        second = i;
                    } else {
                        return false;
                    }
                }
            }
        }
        return (second != -1 && s.charAt(first) == goal.charAt(second)
                && s.charAt(second) == goal.charAt(first));
    }

    // static class Singleton5 implements java.io.Serializable {
    //     public static Singleton5 INSTANCE = new Singleton5();
    //
    //     protected Singleton() {
    //
    //     }
    //     private Object readResolve() {
    //         return INSTANCE;
    //     }
    // }

    /*public String mostCommonWord(String paragraph, String[] banned) {
        paragraph += ".";
        Set<String> set = new HashSet<>();
        for (String s : banned) {
            set.add(s);
        }

        String ans = "";
        int count = 0;

        Map<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (char c : paragraph.toCharArray()) {
            if (Character.isLetter(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (sb.length() > 0) {
                String finalWord = sb.toString();
                if (!set.contains(finalWord)) {
                    map.put(finalWord, map.getOrDefault(finalWord, 0) + 1);
                    if (map.get(finalWord) > count) {
                        ans = finalWord;
                        count = map.get(finalWord);
                    }
                }
                sb = new StringBuilder();
            }
        }
        return ans;
    }*/

}
