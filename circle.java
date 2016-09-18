//Name: Are Oelsner
//This program creates a java applet that draws a circle and allows the keyboard to control its motion

public class circle {
	public static void main(String args[]) {
	//Initialize
		StdDraw.setCanvasSize(600, 600); // Resize the window
		StdDraw.setXscale(-100, 100); //Redefine coordinate system
		StdDraw.setYscale(-100, 100);
		StdDraw.enableDoubleBuffering(); //Allows for smooth animation

		double x1, y1, distance;
			x1 = 0;
			y1 = 0;
			distance = 15;

		while(true) {
			StdDraw.textRight(-20, 90, "Control the circle with WASD");
			
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.circle(x1, y1, 10);
		
			StdDraw.setPenColor(StdDraw.BLUE);
			StdDraw.filledCircle(x1, y1, 10);			

			while (!StdDraw.hasNextKeyTyped())  {
				StdDraw.show();
				StdDraw.pause(33);
			}
 
			double movement = StdDraw.nextKeyTyped();
			if(movement == 'q') 
				break;
			if(movement == 'w')
				y1 += distance;
			if(movement == 's')
				y1 -= distance;
			if(movement == 'a')
				x1 -= distance;
			if(movement == 'd')
				x1 += distance;
			
			StdDraw.show();
			StdDraw.pause(33);
			StdDraw.clear();
			}

		System.exit(0);
	}
}
