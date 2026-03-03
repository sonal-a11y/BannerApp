/*public class OopsBannerApp {
    public static void main(String[] args) {
        System.out.println("OOPS");
    }
}*/

/*public class OopsBannerApp {
    public static void main(String[] args) {

        System.out.println("      ***      ***      *****       *****      ");
        System.out.println("     ** **    ** **    **   **    **           ");
        System.out.println("    **   **  **   **   **   **   **            ");
        System.out.println("    **   **  **   **   *****      ***          ");
        System.out.println("    **   **  **   **   **            **        ");
        System.out.println("     ** **    ** **    **             **       ");
        System.out.println("      ***      ***     **        *****         ");

    }
}*/
/*public class OopsBannerApp {
    public static void main(String[] args) {

        System.out.println(String.join("", "      ***      ***      *****       ***** "));
        System.out.println(String.join("", "     ** **    ** **    **   **    **      "));
        System.out.println(String.join("", "    **   **  **   **   **   **   **       "));
        System.out.println(String.join("", "    **   **  **   **   *****      ***     "));
        System.out.println(String.join("", "    **   **  **   **   **            **   "));
        System.out.println(String.join("", "     ** **    ** **    **             **  "));
        System.out.println(String.join("", "      ***      ***     **        *****    "));

    }
}
*/
public class OopsBannerApp {

    public static void main(String[] args) {

    
        String[] banner = new String[7];

    
        banner[0] = String.join("", "      ***      ***      *****       ***** ");
        banner[1] = String.join("", "     ** **    ** **    **   **    **      ");
        banner[2] = String.join("", "    **   **  **   **   **   **   **       ");
        banner[3] = String.join("", "    **   **  **   **   *****      ***     ");
        banner[4] = String.join("", "    **   **  **   **   **            **   ");
        banner[5] = String.join("", "     ** **    ** **    **             **  ");
        banner[6] = String.join("", "      ***      ***     **        *****    ");

        
        for (String line : banner) {
            System.out.println(line);
        }
    }
}