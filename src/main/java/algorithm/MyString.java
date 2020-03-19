package algorithm;

public class MyString {

    public static void main(String[] args) {
        System.out.println(reverse("abcdef"));
        System.out.println(reversMini("abcdefg"));
    }

    public static String reverse(final String str) {
        final StringBuffer buffer = new StringBuffer(str.length());

        for (int i = str.length()-1; i >= 0; i--) {
            buffer.append(str.charAt(i));
        }
        return buffer.toString();
    }

    public static String reversMini(final String str) {
        StringBuffer buffer = new StringBuffer(str);
        for (int i = 0; i < buffer.length()/2; i++) {
            // swap
            final char tmp = buffer.charAt(i);
            buffer.setCharAt(i, buffer.charAt(buffer.length()-i-1));
            buffer.setCharAt(buffer.length()-i-1, tmp);
        }

        return buffer.toString();
    }
}
