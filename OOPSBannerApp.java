/**
 * OOPSBannerApp UC6 Refactor Banner Logic into Functions
 * 
 * This version uses static helper methods to encapsulate character patterns.
 * This promotes the DRY (Don't Repeat Yourself) principle and modularity.
 * 
 * @author himonkiii
 * @version 6.0
 */
public class OOPSBannerApp {
    // Helper Method for Letter 'O'
    public static String[] getOPattern() {
        return new String[]{
            "  *****  ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            "  *****  "
        };
    }
    
    // Helper Method for Letter 'P'
    public static String[] getPPattern() {
        return new String[]{
            " ******* ",
            " *     * ",
            " *     * ",
            " ******* ",
            " *       ",
            " *       ",
            " *       "
        };
    }
    
    // Helper Method for Letter 'S'
    public static String[] getSPattern() {
        return new String[]{
            "  ***** ",
            " *     * ",
            " *       ",
            "  *****  ",
            "       * ",
            " *     * ",
            "  ***** "
        };
    }
    
    public static void main(String[] args) {
        // Fetch patterns from methods
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();
        
        // Assemble and print each of the 7 lines
        for (int i = 0; i < 7; i++) {
            System.out.println(
                oPattern[i] + 
                oPattern[i] + 
                pPattern[i] + 
                sPattern[i]
            );
        }
    }
}
