<<<<<<< HEAD
/**
 * OOPSBannerApp UC7 – Store Character Pattern in a Class
 *
 * This use case extends UC6 by implementing a CharacterPatternMap class
 * to encapsulate character-to-pattern mappings.
 *
 * @author Developer
 * @version 7.0
 */
public class OOPSBannerApp {

    /**
     * CharacterPatternMap – Inner static class for storing character-to-pattern mappings.
     * Encapsulates a single character and its ASCII art pattern.
     */
    static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and its pattern
         * @param character the character
         * @param pattern ASCII pattern array
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return mapped character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Creates and initializes CharacterPatternMap array
     * @return array of CharacterPatternMap objects
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] O = {
            "  ***  ",
            " *   * ",
            "*     *",
            "*     *",
            "*     *",
            " *   * ",
            "  ***  "
        };

        String[] P = {
            "****   ",
            "*   *  ",
            "*   *  ",
            "****   ",
            "*      ",
            "*      ",
            "*      "
        };

        String[] S = {
            " ****  ",
            "*      ",
            "*      ",
            " ***   ",
            "    *  ",
            "    *  ",
            "****   "
        };

        String[] SPACE = {
            "       ",
            "       ",
            "       ",
            "       ",
            "       ",
            "       ",
            "       "
        };

        return new CharacterPatternMap[] {
            new CharacterPatternMap('O', O),
            new CharacterPatternMap('P', P),
            new CharacterPatternMap('S', S),
            new CharacterPatternMap(' ', SPACE)
        };
    }

    /**
     * Retrieves pattern for given character
     * @param ch character to search
     * @param charMaps array of maps
     * @return pattern array
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        // return space pattern if not found
        return getCharacterPattern(' ', charMaps);
    }

    /**
     * Prints banner message
     * @param message text to print
     * @param charMaps pattern maps
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                lineBuilder.append(pattern[row]).append("  ");
            }

            System.out.println(lineBuilder.toString());
        }
    }

    /**
     * Main method – Entry point
     */
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}
=======
 dev
/**
 * OOPSBannerApp UC4 – Render OOPS as Banner using String Array and Loop
 * This use case improves UC3 by storing banner lines in an array
 * and printing them using a for-each loop.
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Step 1: Create String array with 7 lines
        String[] lines = new String[7];

        // Step 2: Populate each line using String.join()

        lines[0] = String.join(" ",
                " *** ",
                " *** ",
                " ***** ",
                " ***** ");

        lines[1] = String.join(" ",
                "**   **",
                "**   **",
                "**   **",
                "**     ");

        lines[2] = String.join(" ",
                "**   **",
                "**   **",
                "*****  ",
                " ***   ");

        lines[3] = String.join(" ",
                "**   **",
                "**   **",
                "**      ",
                "    **  ");

        lines[4] = String.join(" ",
                "**   **",
                "**   **",
                "**      ",
                "**   **");

        lines[5] = String.join(" ",
                "**   **",
                "**   **",
                "**      ",
                "**   **");

        lines[6] = String.join(" ",
                " *** ",
                " *** ",
                "**      ",
                " ***** ");

        // Step 3: Use enhanced for loop to print lines
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Inline array initialization with String.join()
        String[] lines = {

            String.join("  ", " ***** ", " ***** ", " ***** ", " ***** "),
            String.join("  ", "*     *", "*     *", "*     *", "*      "),
            String.join("  ", "*     *", "*     *", "*     *", "*      "),
            String.join("  ", "*     *", "*     *", " ***** ", " ***** "),
            String.join("  ", "*     *", "*     * ","*      ", "      *"),
            String.join("  ", "*     *", "*     * ","*      ", "      *"),
            String.join("  ", " ***** ", " *****  ","*      ",  "******")

        };

        // Enhanced for loop to print banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
main
>>>>>>> 1913fa17c4012e2d6305ddcded88183a8366c6ce
