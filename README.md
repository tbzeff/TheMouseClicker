# TheMouseClicker

**TheMouseClicker** is an autoclicking program that allows you to specify a number of clicks (left and/or right) to be performed rapidly at a location of your choosing, with customizable sensitivity to mouse movement.

## How It Works
1. Select the 'Auto-click' option by entering '1'.
2. Specify how many clicks you'd like performed.
3. Enter a click pattern (e.g., `LLRLR` for left and right clicks; `L` for left only, `R` for right only).
4. A small window will appear. Drag the window so that its center aligns with the desired clicking location.
5. Enter the mouse sensitivity (in pixels) — this is how far the mouse can move from the target before clicking stops. (Default is 3 pixels.)
6. The program will estimate the run-time and prompt you for confirmation.
7. A countdown will display during the clicking process. Note: The timing is very approximate.
8. The clicking will terminate when the specified number of clicks is completed, or if the mouse moves farther than the allowed sensitivity from the target location.
9. To terminate early, simply move your mouse outside the sensitivity range.
10. You may then enter '0' to run again with the same number of clicks, or change the number of clicks using option '2'.
## Features

- **Left and Right Click Patterns:** Specify a pattern of left (`L`) and right (`R`) clicks (e.g., `LLRLR`).
- **Sensitivity Setting:** Set how many pixels the mouse can move from the target before clicking stops (default: 3 pixels).

## Building

To compile the program, run:

```
javac -d bin src/themouseclicker/*.java
```


## Running

To execute the program, use:

```
java -cp bin themouseclicker.Main
```

## 👤 Author

Taylor Bleizeffer
- **https://www.taylorbleizeffer.com**
- **https://github.com/tbzeff**
