package tragaperras;
import static java.util.Arrays.copyOf;

public class Premio {
	private Fruta[] ganadora;
	private int premio;
	
	public Premio(Fruta[] ganadora, int premio){
		this.ganadora = ganadora;
		this.premio = premio;
	}
	
	public Fruta[] getGanadora() {
		return copyOf(ganadora, ganadora.length);
	}
	
	public int getPremio() {
		return premio;
	}
	
}
