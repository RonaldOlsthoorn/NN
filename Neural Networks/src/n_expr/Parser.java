package n_expr;

import java.util.Stack;

public class Parser {
	
	private String sentence;
	private Expr res;
	private Stack<String> expectStack;
	
	public static Expr parse(String s) throws SyntaxException{
		
		Parser gen = new Parser();
		
		return gen.parseString(s);
	}
	

	public Parser(){
		
		expectStack = new Stack<String>();
	}
	
	private Expr parseString(String s) {

		sentence = removeWhiteSpace(s);
		
		return process(sentence);
	}

	private Expr process(String sentence) {
		
		Expr res;
		
		if(sentence.substring(0, 2).equals("#{")){
			
			addExpect("}");
			
			int i = sentence.indexOf("}", 2);
			
			if(i !=-1){
				
				removeExpect("}");
				Expr v = Variable.make(sentence.substring(3,i-1));
				
			}
		}
		
		return null;
	}

	
	/**
	 * pre: String removeable is the top element of the expectStack
	 * post: removeable is removed from the expectStack. Else, something is dead wrong
	 * @param removeable
	 */
	
	private void removeExpect(String removeable) {

		if(expectStack.firstElement().equals(removeable)){
			expectStack.pop();
		}
	}


	/**
	 * post: expected is on top of the expectedStack
	 * @param expected
	 */
	private void addExpect(String expected) {
		
		expectStack.push(expected);
		
	}

	private static String removeWhiteSpace(String sentence) {
		
		String res = "";
		
		for(int i = 0; i<sentence.length();i++){
			if(!Character.isWhitespace(sentence.charAt(i))){
				res = res+sentence.charAt(i);
			}
		}
		return res;
	}

	public static void main(String[] args){	
	}
}