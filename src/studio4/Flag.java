package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		Color fur = new Color(240, 157, 70);
		StdDraw.setPenColor(fur);
		StdDraw.filledCircle(0.5, 0.5, 0.35);

		double[] x = {0.15, 0.2, 0.35};
		double[] y = {0.95, 0.5, 0.8};
		StdDraw.filledPolygon(x, y);

		double[] x2 = {0.85, 0.8, 0.65};
		double[] y2 = {0.95, 0.5, 0.8};
		StdDraw.filledPolygon(x2, y2);

		Color nose = new Color(255, 138, 175);
		StdDraw.setPenColor(nose);
		double[] x3 = {0.43, 0.5, 0.57};
		double[] y3 = {0.5, 0.43, 0.5};
		StdDraw.filledPolygon(x3, y3);

		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(0.085);
		StdDraw.point(0.38,0.61);
		StdDraw.point(0.62,0.61);

		StdDraw.setPenRadius(0.01);
		StdDraw.arc(0.5,0.42,0.1, 200, 340);

		StdDraw.setPenRadius(0.008);
		StdDraw.line(0.5,0.43,0.5,0.32);

		

	}
}