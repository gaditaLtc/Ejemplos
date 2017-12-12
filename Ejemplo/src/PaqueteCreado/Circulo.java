package PaqueteCreado;

public class Circulo {

	private float radio;
	private final double PI=3.1416;
	
	public Circulo(float radio) {
		
		this.radio = radio;
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	public double area () {
		return PI*(this.radio*this.radio);
		
	}
	public double perimetro () {
		return 2*PI*this.radio;
	}
	
	public static void main(String[] args) {

		Circulo c1= new Circulo (3.5F);
		System.out.println("Para una circunferencia de radio: "+ c1.getRadio());
		System.out.println("El area es: "+c1.area());
		System.out.println("El perimetro es: "+c1.perimetro());

	}

}
