import java.util.ArrayList;

public class Triangular extends FuzzySet{
	public Triangular(String name, double[] x){
		assert (x.length == 3) : "This shape is not a triangle";
		
		segments = new ArrayList<Segment>();
		this.name = name;
		double[] y = {0.0, 1.0, 0.0};
	
		Point p1 = new Point(x[0], y[0]);
		for(int i = 1 ; i < 3 ; i++){
			Point p2 = new Point(x[i], y[i]);
			segments.add(new Segment(p1, p2));
			p1 = p2;
		}
		calcCentroid(x, y);
	}
}
