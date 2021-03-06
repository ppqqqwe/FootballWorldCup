import java.util.Scanner;
/**
 * The menu class is used to outprint the menu options and get user's choice.
 *
 * @author (Pan Qi)
 * @version (20/05/2018)
 */
public class Menu
{    
    /**
     * Default constructor of menu class.
     */    
    public Menu()
    {
    }    

    /**
     * Get user's option,when option invalid output message and let user input again.
     * 
     * @return char of user's option.
     */
    public static char getChoice()
    {
        listMenu();
        Scanner console = new Scanner(System.in);
        String option = console.nextLine().toUpperCase().trim();
        while (!(option.length() == 1 && ((option.charAt(0) >= 'A' && option.charAt(0) <= 'E') || option.charAt(0) == 'X')))
        {
            System.out.println("Input invalid. Please choose A B C D E or X.");
            option = console.nextLine().toUpperCase().trim();
        }

        return option.charAt(0);
    }

    /**
     * Output menu options.
     */
    public static void listMenu()
    {   
        System.out.println("\u000c");
        System.out.println("Please choose options as follows");
        System.out.println("A. Play Preliminary Stage ");
        System.out.println("B. Play Final");
        System.out.println("C. Display Teams");
        System.out.println("D. Display Players");
        System.out.println("E. Display Cup Result ");
        System.out.println("X. Close ");
    }
}
