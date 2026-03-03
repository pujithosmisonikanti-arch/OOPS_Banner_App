

public class OOPSBannerAppUC4 {

    public static void main(String[] args) {

        // Creating banner lines using String.join()
        String[] banner = {

                String.join("  ",
                        " OOOOO ",
                        " OOOOO ",
                        "PPPPP ",
                        "SSSSS "),

                String.join("  ",
                        "OO   OO",
                        "OO   OO",
                        "PP   PP",
                        "SS     "),

                String.join("  ",
                        "OO   OO",
                        "OO   OO",
                        "PPPPP ",
                        " SSSSS "),

                String.join("  ",
                        "OO   OO",
                        "OO   OO",
                        "PP     ",
                        "     SS"),

                String.join("  ",
                        " OOOOO ",
                        " OOOOO ",
                        "PP     ",
                        "SSSSS ")
        };

        // Printing banner using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}