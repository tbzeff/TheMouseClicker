# TheMouseClicker

**TheMouseClicker** is an autoclicking program that allows you to specify a number of left-clicks to be performed rapidly at a location of your choosing.

## How It Works
1. Select the 'Auto-click' option by entering '1'.
2. Specify how many clicks you'd like performed. A small window will then appear
2. Drag the window so that its center aligns with the desired clicking location.
3. The program will estimate the run-time and prompt you for confirmation.
4. A countdown will display during the clicking process. Note: The timing is very approximate.
5. The clicking will terminate when the specified number of clicks is completed, or if a change in the cursor location is detected.
6. To terminate early, simply move your mouse slightly.
7. You may then enter '0' to run again with the same number of clicks, or change the number of clicks using option '2'.

## Building
To compile the program, run:
javac -d bin src/themouseclicker/*.java


## Running
To execute the program, use:
java -cp bin themouseclicker.Main