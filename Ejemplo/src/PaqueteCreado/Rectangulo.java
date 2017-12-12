package PaqueteCreado;

public class Rectangulo {

private float lado1;
private float lado2;
public Rectangulo(float lado1, float lado2) {
	
	this.lado1 = lado1;
	this.lado2 = lado2;
}


public float getLado1() {
	return lado1;
}


public void setLado1(float lado1) {
	this.lado1 = lado1;
}


public float getLado2() {
	return lado2;
}


public void setLado2(float lado2) {
	this.lado2 = lado2;
}


public float calcularArea() {
	return this.lado1*this.lado2;
}

public float calcularPerimetro() {
	return 2*this.lado1 + 2*this.lado2;
}

public boolean esCuadrado() {
	return this.lado1==this.lado2;
}

public void pintarRectangulo() {
	int l1=(int) this.lado1;
	int l2 =(int)this.lado2;
	for (int i=1;i<=l1;i++) System.out.print("*");
	
	for (int j=1; j<l2-1;j++) {
		System.out.print("\n*");
		for (int k=2; k<l1;k++)System.out.print(" ");
		System.out.print("*");
	}
	System.out.println();
	
	for (int i=1;i<=l1;i++) System.out.print("*");
}

public static void main(String[] args) {
	Rectangulo rtng= new Rectangulo (7.3F,6.4F);
	System.out.println(rtng.esCuadrado());
	rtng.pintarRectangulo();
}

}