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

 /*public class OopsBannerApp {

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
*/
/*public class OopsBannerApp {
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
}*/


/*public class OopsBannerApp {

 public static String[] getOPattern(){
	 return new String[] {
		 "     ***     ",
         " **     **   ", 
         "**        ** ", 
         "**        ** ", 
         "**        ** ", 
         " **      **  ", 
	     "   ***       " };
 }
 public static String[] getPPattern() {
	 return new String[] {
		  " *******    " ,
          " *      *   " , 
          " *      *   " ,
          " *******    " , 
          " *          " , 
	      " *          " , 
		  " *          "};
 }
 public static String[] getSPattern() {
	 return new String[] {
		  "   *****   " , 
          " *         " ,
          " *         "  ,
          "   *****   "  ,
          "         * "  ,
          "         * "  ,
          "  ******   "  ,
            };
 }
 public static void main(String[] args) {
	 String[] oPattern = getOPattern();
	 String[] pPattern = getPPattern();
     String[] SPattern = getSPattern(); 
	 
 for (int i = 0; i < oPattern.length; i++) {
	 System.out.println (oPattern[i] + " " +oPattern[i]+" "+pPattern[i]+" "+SPattern[i]);
        }
     }
}*/

public class OopsBannerApp {
 static class CharacterPatternMap {
	 private Character character;
	 private String[] pattern;
	 
	 public CharacterPatternMap( Character character , String[] pattern ) {
		 this.character = character;
		 this.pattern = pattern;
	 }
	 public Character getCharacter() {
		 return character;
	 }
	 public String[] getPattern() {
		 return pattern;
	 }
 }
    public static CharacterPatternMap[] createCharacterPatternMaps() {
		CharacterPatternMap[] charMaps = new CharacterPatternMap[4];
		charMaps[0] = new CharacterPatternMap('O',new String[] {"    ***   " ,"  *     * " ,"  *     * " ,"  *     * " ,"  *     * " ,"  *     * " ,"    ***   " });
		charMaps[1] = new CharacterPatternMap('P',new String[] {"  ****** " ,"  *    * " ,"  *    * " ,"  ****** " ,"  *      " ,"  *      " ,"  *      " });
		charMaps[2] = new CharacterPatternMap('S',new String[] {"  ***** " ,"  *     " ,"  *     " ,"  ***** " ,"      * " ,"      * " ,"  ***** " });
		charMaps[3] = new CharacterPatternMap(' ',new String[] { " " , " " , " " , " " , " " , " " , " "});
		return charMaps;
	}
	public static String[] getCharacterPattern(char ch,CharacterPatternMap[] charMaps) {
		for (CharacterPatternMap map : charMaps) {
			if (Character.toUpperCase(ch) == map.getCharacter()) {
				return  map.getPattern();
			}
		}return charMaps[3].getPattern();
	}
	public static void printMessage(String message,CharacterPatternMap[] charMaps) {
		
		for (int i = 0;i < 7;i++) {
			for (char ch : message.toCharArray()) {
				String[] pattern = getCharacterPattern(ch,charMaps);
				System.out.print(pattern[i] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[]args) {
		CharacterPatternMap[] charMaps = createCharacterPatternMaps();
		
		String message = "OOPS";
		printMessage(message,charMaps);
	}
}

