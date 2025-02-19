package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledRectangle(1, 1, 3, 3);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(0, 0, 3, 0.1);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(0, 0.25, 3, 0.05);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(0, 1, 3, 0.1);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(0.5, 0, 0.1, 3);
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledCircle(0.5, 0.5, 0.2);

		
		
	}
}