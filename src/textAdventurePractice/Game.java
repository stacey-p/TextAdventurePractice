/**
 * 
 */
package textAdventurePractice;

import java.util.Scanner;

/**
 * @author Stacey
 *
 */
public class Game {

	/**
	 * @param args -
	 */

	public static void main(String[] args) {

		Scanner myScanner;
		myScanner = new Scanner(System.in); //
		String playerName = null;

		playerName = newUsername();
		// playerName = myScanner.nextLine();
		// System.out.println("Welcome, "+ playerName);

		System.out.println("You are " + playerName);

	}

	private static String newUsername() { //set username
		Scanner userScan = new Scanner(System.in);
		String name = null;
		boolean warned = false;

		do {
			if (name != null) {System.out.println("Error: Must be 4+ chars");
			} 
			System.out.println("Enter your Username");
			name = userScan.nextLine();
		} while (name.length() < 4);
		{
			if (userScan != null) {
				userScan.close();
			}
		}
		System.out.println("Welcome " + name);
		return name;
	}

}
