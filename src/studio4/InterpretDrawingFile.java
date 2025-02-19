package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;


/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File

		StdDraw.clear();

		String shape = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean filled = in.nextBoolean();
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double width = in.nextDouble();
		double height = in.nextDouble();



		Color color = new Color(red,green,blue);
		StdDraw.setPenColor(color);

		while(true) {
			if(shape.equals("rectangle")) {
				if(filled == true) {
					StdDraw.filledRectangle(x1, y1, width, height);
				}
				if(filled == false) {
					StdDraw.rectangle(x1, y1, width, height);}
			}
			if(shape.equals("ellipse")) {
				if(filled == true) {
					StdDraw.filledEllipse(x1 , y1, width, height);
				}
				if(filled == false) {
					StdDraw.ellipse(x1, y1, width, height);
				}
				if(shape.equals("triangle")) {

				}
			}

			in.close();
		}


	}
}