/**
<<<<<<< HEAD
 * OOPSBannerApp UC4 Render OOPS as Banner using String Array and Loop
 *
 * This use case improves upon UC3 by using a String array to store banner lines
 * and iterating through them with a for-each loop, eliminating hardcoded print
 * statements and improving modularity and reusability.
 *
 * @author [Your Name]
 * @version 4.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        String[] bannerLines = new String[7];

        bannerLines[0] = String.join("", "  *****  ", "  *****  ", " ******* ", "  ***** ");
        bannerLines[1] = String.join("", " *     * ", " *     * ", " *     * ", " *     * ");
        bannerLines[2] = String.join("", " *     * ", " *     * ", " *     * ", " *       ");
        bannerLines[3] = String.join("", " *     * ", " *     * ", " ******* ", "  *****  ");
        bannerLines[4] = String.join("", " *     * ", " *     * ", " *       ", "       * ");
        bannerLines[5] = String.join("", " *     * ", " *     * ", " *       ", " *     * ");
        bannerLines[6] = String.join("", "  *****  ", "  *****  ", " *       ", "  *****  ");

        for (String line : bannerLines) {
=======
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
>>>>>>> feature/UC5-ArrayInit
            System.out.println(line);
        }
    }
}
