/**
 * OOPSBannerApp UC3 OOPS Banner Application
 * This class refactors UC2 to use String.join() for better memory efficiency
 * and readability, avoiding the overhead of multiple intermediate String objects.
 * @author [Your Name]
 * @version 3.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        // Construct each line using String.join with an empty delimiter ""
        System.out.println(String.join("", "  *****  ", "  *****  ", " ******* ", "  ***** "));
        System.out.println(String.join("", " *     * ", " *     * ", " *     * ", " *     * "));
        System.out.println(String.join("", " *     * ", " *     * ", " *     * ", " *       "));
        System.out.println(String.join("", " *     * ", " *     * ", " ******* ", "  *****  "));
        System.out.println(String.join("", " *     * ", " *     * ", " *       ", "       * "));
        System.out.println(String.join("", " *     * ", " *     * ", " *       ", " *     * "));
        System.out.println(String.join("", "  *****  ", "  *****  ", " *       ", "  *****  "));
    }
}