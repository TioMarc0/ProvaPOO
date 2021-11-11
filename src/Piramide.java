
public class Piramide {
	private float ab;
	private float h;
	private float a1;
	private float tipo;
	
	public float getAb() {
		return ab;
	}
	
	public Piramide(float ab, float h, float a1, float tipo) {
		super();
		this.ab = ab;
		this.h = h;
		this.a1 = a1;
		this.tipo = tipo;
	}
	public void setAb(float ab) {
		this.ab = ab;
	}
	public float getH() {
		return h;
	}
	public void setH(float h) {
		this.h = h;
	}
	public float getA1() {
		return a1;
	}
	public void setA1(float a1) {
		this.a1 = a1;
	}
	public float getTipo() {
		return tipo;
	}
	public void setTipo(float tipo) {
		this.tipo = tipo;
	}
	
	
	
	public float a1() {
		return (float) Math.sqrt((ab*ab) + (h*h));	
		}
	public float areaTriangulo() {
		return	areaTriangulo();
		}	
	public float areatotal () {
		return areatotal();
	}
	public float areaBase() {
		return areaBase();
	}
	public float tipo() {
		return tipo();
	}
	public float litros() {
		return litros();
	}
	public float latas() {
		return latas();
	}
	public float preco() {
		return preco();
	}
	public float volume() {
		return volume();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("-->Piramide");
		builder.append("\nTipo: "+ tipo );
		builder.append("\nArea1: "+ a1);
		return builder.toString();
	

}	
	
}	
