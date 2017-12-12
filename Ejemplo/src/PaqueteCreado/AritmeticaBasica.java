package PaqueteCreado;

public class AritmeticaBasica {

	private double operando1;
	private double operando2;
	
	public AritmeticaBasica(double operando1, double operando2) {
		
		this.operando1 = operando1;
		this.operando2 = operando2;
	}
	

	public double getOperando1() {
		return operando1;
	}


	public void setOperando1(double operando1) {
		this.operando1 = operando1;
	}


	public double getOperando2() {
		return operando2;
	}


	public void setOperando2(double operando2) {
		this.operando2 = operando2;
	}

public double sumaBasica () {
	return this.operando1+this.operando2;
	
}
public double restaBasica() {
	return this.operando1-this.operando2;
}
public double multiBasica() {
	return this.operando1*this.operando2;
}


public String escribirDatos() {
	return "AritmeticaBasica [operando1=" + operando1 + ", operando2=" + operando2 + "]";
}


public static void main(String[] args) {
		AritmeticaBasica ab1=new AritmeticaBasica (8.54,5.89);
		System.out.println("Para los operandos: "+ ab1.getOperando1() +" y "+ ab1.getOperando2());
		System.out.println("La suma básica es:"+ ab1.sumaBasica());
		System.out.println("La resta básica es:"+ ab1.restaBasica());
		System.out.println("La multiplicación básica es:"+ ab1.multiBasica());
		System.out.println(ab1.escribirDatos());
	}

}
