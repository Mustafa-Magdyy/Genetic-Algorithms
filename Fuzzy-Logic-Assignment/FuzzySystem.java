import java.util.ArrayList;
import FuzzyVariable;

public class FuzzySystem{
	private ArrayList<FuzzyVariable> inputVars;
	private FuzzyVariable outputVar;
	//private ArrayList<Rule> rules;
	
	private fuzzification(){
		
	}
	private inference(){
		
	}
	private defuzzification(){
	
	}

	public FuzzySystem(FuzzyVariable outputVar){
		this.outputVar = outputVar;
	}
	public addInputVariable(FuzzyVariable var){
		inputVariables.add(var);
	}
	public addRule(Rule rule){
		//assert rule.getRHS().varName == outputVar.getName() : "rule error";   
		
	}
	public solve(){
		
	}
}
