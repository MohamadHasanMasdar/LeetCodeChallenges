package org.example;

public class IsStringSubsequence {

    public static void main(String[] args) {

        boolean result = solution2("aaaaaa", "bbaaaa");
        System.out.println(result);
    }

    public static boolean solution1(String s, String t) {

        if (s == null || s.isEmpty())
            return false;

        for (int i=0; i<s.length(); i++) {
            char currentChar = s.charAt(i);
            if (t.indexOf(currentChar) == -1)
                return false;
            for (int j=i; j>0; j--) {
                char beforeChar = s.charAt(j-1);
                if (t.indexOf(beforeChar) > t.indexOf(currentChar))
                    return false;
            }
        }

        return true;
    }

    public static boolean solution2(String s, String t) {
        int sPointer=0;
        int tPointer=0;

        while (tPointer < t.length()) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
                if (sPointer == s.length())
                    return true;
            }

            tPointer++;
        }
        return false;
    }
}
