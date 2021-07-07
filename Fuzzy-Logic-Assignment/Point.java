public class Point{
	public double x, y;
	
	public Point(){
		x = y = 0.0;
	}
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	public Point add(Point p){
		return new Point(x + p.x, y + p.y);
	}
	public Point sub(Point p){
		return new Point(x - p.x, y - p.y);
	}
	public Point mult(double scalar){
		return new Point(x * scalar, y * scalar);
	}
}
