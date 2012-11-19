package n_expr;

public class Parser {
	
	private String sentence;
	private Expr res;
	
	public static Expr parse(String s) throws SyntaxException{
		
		Parser gen = new Parser(s);
		return null;
	}
	
	public Parser(String s){
		
		sentence = s;
		s = removeWhiteSpace(s);
		Expr res = process(s);
	}

	private Expr process(String sentence) {
		return null;
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
