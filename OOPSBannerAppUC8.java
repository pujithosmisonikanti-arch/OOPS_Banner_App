import java.util.HashMap;
import java.util.Map;

public class OOPSBannerAppUC8 {

    // Method to build pattern map
    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        });

        patternMap.put('P', new String[]{
                "PPPP ",
                "P   P",
                "P   P",
                "PPPP ",
                "P    ",
                "P    ",
                "P    "
        });

        patternMap.put('S', new String[]{
                " SSS ",
                "S   S",
                "S    ",
                " SSS ",
                "    S",
                "S   S",
                " SSS "
        });

        return patternMap;
    }

    // Method to render banner
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        int height = 7;

        for (int i = 0; i < height; i++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char c : word.toCharArray()) {

                if (patternMap.containsKey(c)) {
                    lineBuilder.append(patternMap.get(c)[i]).append("  ");
                }
            }

            System.out.println(lineBuilder);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildPatternMap();

        renderBanner("OOPS", patternMap);
    }
}