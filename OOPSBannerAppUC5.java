public class OOPSBannerAppUC5 {

    public static void main(String[] args) {

        String[] banner = {
                String.join("", "O", " ", "O", " ", "P", " ", "P", " ", "S"),
                String.join("", "O", " ", "O", " ", "P", " ", "P", " ", "S"),
                String.join("", "O", "O", "O", " ", "P", "P", "P", " ", "S", "S", "S"),
                String.join("", "O", " ", "O", " ", "P", " ", " ", " ", " ", " ", "S"),
                String.join("", "O", " ", "O", " ", "P", " ", " ", " ", " ", " ", "S"),
                String.join("", "O", "O", "O", " ", "P", " ", " ", " ", "S", "S", "S"),
                String.join("", " ", " ", " ", " ", " ", " ", " ", " ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}