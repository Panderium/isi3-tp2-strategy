package logo;

import java.lang.String;
import java.lang.System;

public class Main {

  public static void main(String[] args) {

    // initialize the screen
    char escapeCode = 0x1B;
    System.out.print(String.format("%c[;%s",escapeCode,"2J"));

    // codez ici ...

    // reset cursor position
    System.out.print(String.format("%c[;%d;%df",escapeCode,0, 0));

  }
}
