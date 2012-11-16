package n_core;
import java.util.HashMap;

public class Neuron {
	
	private String name;
	private HashMap<String,Neuron> inputNeurons;
	private HashMap<String,Neuron> outputNeurons;
	private HashMap<String,Variable> variants;
	
	private function fn;
	private double output;
	
	
	public Neuron(HashMap<String,Neuron> ip, HashMap<String,Neuron>op, HashMap<String,Variable> var, String nam){
		
		name = nam;
		inputNeurons = ip;
		outputNeurons = op;
		variants = var;
		
	}
	
	public double evaluate(){
		
		return 0;
	}
	
	public void evaluateAndSave(){
		
		output = 0;
	}
	
	public double getOutputValue(){
		
		return output;
	}
	
	public void update(HashMap<String,Variable> var){
		
		variants = var;
		fn.update(var);
	}
	
	//getters and setters
	
	public String getName(){
		
		return name;
	}
	
	public function getFunction(){
		
		return fn;
	}
	

	
	

}
