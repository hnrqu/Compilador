package analisador_lexico;

public class Num extends Token{
	public final int value;
	
	public Num(int value, int line){
		super(Tag.NUM, line);
		this.value = value;
	}
	
	public String toString(){
		return "" + value;
	}
}