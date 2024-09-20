package sareen.shagun.Test;

import java.util.HashSet;

public class Test {
    //String str = "abcd a"; //find count of all non repeating substrings

    public static int getNonRepeatingSubstrings(String input) {
        int start = 0;
        HashSet<Character> set = new HashSet<>();
        int count = 0;

        for (int end = 0; end < input.length(); end++) {
            char ch = input.charAt(end);

            //when duplicate is encountered
            while (set.contains(ch)) {
                set.remove(input.charAt(start));
                start++;
            }
            set.add(ch);

            count += end - start + 1;
            //System.out.println("End :" + end + " - " + count);
        }
        return count;
    }

    public static void main(String[] args) {
        int count = getNonRepeatingSubstrings("abcdaaaaaaaaaaaaaaa");
        System.out.println("Count : " + count);
    }
}
