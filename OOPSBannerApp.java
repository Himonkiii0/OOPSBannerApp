/**
 * OOPSBannerApp UC5 Render OOPS as Banner using Inline Array Initialization
 *
 * This use case refactors UC4 by combining array declaration and initialization.
 * It uses a single statement to populate the banner lines, making the code
 * more concise and readable while retaining the loop-based printing.
 *
 * @author [himonkiii]
 * @version 5.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        // Define and initialize the array in one concise statement
        String[] lines = {
            String.join("", "  *****  ", "  *****  ", " ******* ", "  ***** "),
            String.join("", " *     * ", " *     * ", " *     * ", " *     * "),
            String.join("", " *     * ", " *     * ", " *     * ", " *       "),
            String.join("", " *     * ", " *     * ", " ******* ", "  *****  "),
            String.join("", " *     * ", " *     * ", " *       ", "       * "),
            String.join("", " *     * ", " *     * ", " *       ", " *     * "),
            String.join("", "  *****  ", "  *****  ", " *       ", "  *****  ")
        };
        // Use a loop to print each line of the banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
