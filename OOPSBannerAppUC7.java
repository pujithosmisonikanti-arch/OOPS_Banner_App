import java.util.HashMap;
import java.util.Map;

public class OOPSBannerAppUC7 {

    // Static Inner Class
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Store patterns in Map
        Map<Character, CharacterPatternMap> patternMap = new HashMap<>();

        patternMap.put('O', new CharacterPatternMap('O', new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        }));

        patternMap.put('P', new CharacterPatternMap('P', new String[]{
                "PPPP ",
                "P   P",
                "P   P",
                "PPPP ",
                "P    ",
                "P    ",
                "P    "
        }));

        patternMap.put('S', new CharacterPatternMap('S', new String[]{
                " SSS ",
                "S   S",
                "S    ",
                " SSS ",
                "    S",
                "S   S",
                " SSS "
        }));

        String word = "OOPS";

        for (int i = 0; i < 7; i++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char c : word.toCharArray()) {
                lineBuilder.append(patternMap.get(c).getPattern()[i]).append("  ");
            }

            System.out.println(lineBuilder);
        }
    }
}