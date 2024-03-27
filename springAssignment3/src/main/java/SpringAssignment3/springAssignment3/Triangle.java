package SpringAssignment3.springAssignment3;

public class Triangle {
	private String type;
	private int a, b, c;
	
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Triangle(String type, int a, int b, int c) {
		super();
		this.type = type;
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Triangle [type=" + type + ", a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	
	
}
