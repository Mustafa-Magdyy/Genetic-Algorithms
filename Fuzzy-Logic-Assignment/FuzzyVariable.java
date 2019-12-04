import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Exception;

public class FuzzyVariable{
	private String name;
	private ArrayList<FuzzySet> fuzzySets;
	
	public FuzzyVariable(String name){
		this.name = name;
	}
	public void addFuzzySet(String name, String type, double[] x){
		if(type.equals("triangular"))
			fuzzySets.add(new Triangular(name, x));
		else
			fuzzySets.add(new Trapezoidal(name, x));
	}
	public void addFuzzySet(FuzzySet set){
		fuzzySets.add(set);
	}
	public void addFuzzySets(ArrayList<FuzzySet> sets){
		fuzzySets.addAll(sets);
	}
	public void listFuzzySets(){
		System.out.println(fuzzySets.size());
		for(FuzzySet fuzzySet : fuzzySets){
			System.out.println(fuzzySet.getName());
		}
	}
	/*public HashMap<String, Double> fuzzify(double x){
		HashMap<String, Double> map = new HashMap<String, Double>();
		for(FuzzySet fuzzySet : fuzzySets){
			map.put(fuzzySet.getName(), fuzzySet.fuzzyify(x));
		}
		return map;
	}*/
	public double fuzzify(double x, String fuzzySetName) throws Exception{
		for(FuzzySet set : fuzzySets){
			if(fuzzySetName.equals(set.getName())){
				return set.fuzzify(x);
			}
		}
		String errorMessage = "This Fuzzy Variable does not contain a fuzzy set called " + fuzzySetName;
		throw new Exception(errorMessage);
	}
	public String getName(){
		return name;
	}
} 
