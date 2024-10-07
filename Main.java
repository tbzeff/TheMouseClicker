
import java.util.Scanner;
import java.awt.Point;

// https://docs.oracle.com/javase/tutorial/uiswing/misc/trans_shaped_windows.html

public class Main {

	static int counter = 0;
	static int clicks = 0;
	static double runtime = 0;
	static Scanner in = new Scanner(System.in);
	static Clicker clicker = new Clicker();
	static int clickX = 0;
	static int clickY = 0;
	static ClickFrame clickFrame = new ClickFrame();

	private static void clickNumPrompt() {
		// Get user input on clicks
		System.out.print("How many clicks would you like to perform?: ");
		clicks = in.nextInt();
		System.out.println();
		runtime = (100 * clicks) / 1000;
	}

	private static void clickLocPrompt() {
		System.out.print("Drag the window so the center is in the location you'd like to click.");
		clickFrame.setVisible(true);
		String nul = in.nextLine(); 
		in.nextLine();
		System.out.println();
		Point center = clickFrame.getCenter();
		clickX = center.x;
		clickY = center.y;
		clickFrame.setVisible(false);
	}

	private static int confirmRuntime() {
		// Confirm runtime with user
		System.out.println("This program will run ~" + runtime / 60 + "min. Continue? (1/0):");
		return in.nextInt();
	}

	private static void performClicks() {

		// Move mouse to game screen
		clicker.moveRobot(clickX, clickY);
		
		
		// Perform clicking
		double startTime = System.currentTimeMillis();
		double grabTime;
		Point mousePos;
		while (counter < clicks)
		{
			mousePos = clicker.getLocation();
			if (mousePos.x != clickX || mousePos.y != clickY)
				break; 
			
			clicker.click();
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			++counter;
			
			grabTime = (System.currentTimeMillis() - startTime) / 1000;
			
			// print time remaining
			if (counter % 43 == 0)
				System.out.println("Time remaining: ~" + 
			(runtime - grabTime) + "sec");
		}
	}

	public static void main(String[] args) {
		
		int userSelection;
		int programControl = 0;

		while (programControl != -1) {

			counter = 0;
			
			System.out.println("Enter the number of the option you would like to perform.");
			System.out.println("0. Run again (same # clicks)");
			System.out.println("1. Auto-click");
			System.out.println("2. Change number of clicks");
			System.out.println("3. Exit program");
			userSelection = in.nextInt();
			
			switch (userSelection) {
			case 0:
				
				performClicks();
				
				break;
			case 1:	
				
				clickNumPrompt();

				clickLocPrompt();

				int confirmation = confirmRuntime();
				if (confirmation != 1)
					break;
				
				performClicks();
				
				break;
			case 2:
				
				clickNumPrompt();

				performClicks();
				
				break;
			case 3:
				programControl = -1;
				break;
			}
			
		}
		
	} 

}
