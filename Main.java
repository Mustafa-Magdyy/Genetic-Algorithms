public class Main{
	public static void main(String[] args){
		double[] x = {0.0, 50.0, 100.0};
		FuzzySet set = new Triangular("set", x);
		System.out.println(set.getCentroid());
	}
}
