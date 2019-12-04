public class Segment{
	private Point a, ab;
	
	public Segment(Point st, Point ed){
		if(st.x > ed.x){
			Point temp = st;
			st = ed;
			ed = temp;
		}
		a = st;
		ab = ed.sub(a);
	}
	public Pair<Boolean, Double> y(double x){
		Pair<Boolean, Double> ret = new Pair<Boolean, Double>(false, 0.0);
		double t = (x - a.x) / ab.x;
		if(t >= 0 && t <= 1){
			ret.first = true;
			ret.second = a.y + ab.y * t;
		}
		return ret;
	}
}
