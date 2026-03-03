public class OOPSBannerAppUC6 {

    // Static method for letter O
    public static String[] getO() {
        return new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        };
    }

    // Static method for letter P
    public static String[] getP() {
        return new String[]{
                "PPPP ",
                "P   P",
                "P   P",
                "PPPP ",
                "P    ",
                "P    ",
                "P    "
        };
    }

    // Static method for letter S
    public static String[] getS() {
        return new String[]{
                " SSS ",
                "S   S",
                "S    ",
                " SSS ",
                "    S",
                "S   S",
                " SSS "
        };
    }

    public static void main(String[] args) {

        String[] o = getO();
        String[] p = getP();
        String[] s = getS();

        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i] + "  " + o[i] + "  " + p[i] + "  " + s[i]);
        }
    }
}