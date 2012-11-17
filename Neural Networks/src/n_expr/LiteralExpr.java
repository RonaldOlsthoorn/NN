package n_expr;


class LiteralExpr extends Expr {
    double v;
    LiteralExpr(double v) { 
    	this.v = v; 
    }
    
    public double value() { 
    	return v; 	
    }
    
}