import java.util.ArrayList;

public abstract class FuzzySet{
	protected String name;
	protected double centroid;
	protected ArrayList<Segment> segments;
	
	public double fuzzify(double x){
		for(Segment seg : segments){
			Pair<Boolean, Double> p = seg.y(x);
			if(p.first)
				return p.second;
		}
		return 0.0;
	}
	public void calcCentroid(double[] x, double[] y){
		double A = 0.0;
		centroid = 0.0;
		for(int i = 0 ; i < x.length - 1 ; i++){
			A += x[i] * y[i + 1] - x[i + 1] * y[i]; 
		}
		A /= 2.0;
		for(int i = 0 ; i < x.length - 1 ; i++){
			centroid += (x[i] + x[i + 1]) * (x[i] * y[i + 1] - x[i + 1] * y[i]); 
		}
		centroid /= (6 * A);
	}
	public String getName(){
		return name;
	}
	public double getCentroid(){
		return centroid;
	}
}
