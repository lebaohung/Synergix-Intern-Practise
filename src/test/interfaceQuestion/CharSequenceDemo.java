package test.interfaceQuestion;

public class CharSequenceDemo implements CharSequence {

    private String s;

    public CharSequenceDemo(String s) {
        this.s = s;
    }

    @Override
    public int length() {
        return s.length();
    }

    @Override
    public char charAt(int index) {
        return s.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0) {
            throw new StringIndexOutOfBoundsException("Index Out of Bounds: start index is smaller than 0");
        }
        if (end >= s.length()) {
            throw new StringIndexOutOfBoundsException("Index Out of Bounds: end index is bigger than string length");
        }
        if (start > end) {
            throw new StringIndexOutOfBoundsException("Index Out of Bounds: start index is bigger than end index");
        }
        return s.subSequence(start, end);
    }

    @Override
    public String toString() {
        return "CharSequenceDemo{" +
                "s='" + s + '\'' +
                '}';
    }

    private static int random(int length) {
        return (int) Math.round(Math.random() * (length-1));
    }

    public static void main(String[] args) {
        CharSequenceDemo s = new CharSequenceDemo("Highlight Bracket Pair");
        System.out.println("Length of String: " + s.length());

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }
        System.out.println();

        int start = random(s.length());
        int end = random(s.length());
        try {
            System.out.println(s.subSequence(start, end));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(s);
    }
}
