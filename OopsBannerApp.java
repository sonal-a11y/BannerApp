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
        char[][] O = {
            {' ', '*', '*', '*', ' '},
            {'*', ' ', ' ', ' ', '*'},
            {'*', ' ', ' ', ' ', '*'},
            {'*', ' ', ' ', ' ', '*'},
            {' ', '*', '*', '*', ' '}
        };

        char[][] P = {
            {'*', '*', '*', '*', ' '},
            {'*', ' ', ' ', ' ', '*'},
            {'*', '*', '*', '*', ' '},
            {'*', ' ', ' ', ' ', ' '},
            {'*', ' ', ' ', ' ', ' '}
        };

        char[][] S = {
            {' ', '*', '*', '*', '*'},
            {'*', ' ', ' ', ' ', ' '},
            {' ', '*', '*', '*', ' '},
            {' ', ' ', ' ', ' ', '*'},
            {'*', '*', '*', '*', ' '}
        };

        char[][][] letters = {O, O, P, S};

        for (int i = 0; i < 5; i++) {
            for (int l = 0; l < letters.length; l++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(letters[l][i][j] + " ");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}