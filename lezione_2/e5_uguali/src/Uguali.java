public class Uguali {
    public static void main(String[] args) {
        String a = "ciao come va ?";
        String b = "cIao come vA ?";
        String c = "ciao come va ";
        System.out.println("2".equals(""+compareStrings(a, b, c)));
        a = "ciao come va ?";
        b = "cIaoo come vA ?";
        c = "ciao come va a";
        System.out.println("1".equals(""+compareStrings(a, b, c)));
        a = "ciao come va ?";
        b = "cIao come va ?";
        c = "ciao come vA ?";
        System.out.println("3".equals(""+compareStrings(a, b, c)));
    }

    private static int compareStrings(String a, String b, String c) {
        int counter;
        String alc = a.toLowerCase();
        String blc = b.toLowerCase();
        String clc = c.toLowerCase();

        if (alc.equals(blc)) {
            if (blc.equals(clc)) {
                counter = 3;
            } else {
                counter = 2;
            }
        } else {
            if (alc.equals(clc)) {
                counter = 1;
            } else {
                counter = 0;
            }
        }
        return counter;
    }
}
