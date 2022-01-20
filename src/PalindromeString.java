public class PalindromeString {
    public static void main(String[] args) {

        String a = "abcba";

        char[] ans = a.toCharArray();
        int start =0;
        int end = ans.length -1;
        System.out.println(checkPalin(start,end,ans));

        }
        static String checkPalin(int start, int end, char[] ans){

            while (start <= end) {

                if (ans[start] != ans[end]) {
                    return "Not palindrome";
                }
                start++;
                end--;

            }
        return "Palindrome";

    }
}
