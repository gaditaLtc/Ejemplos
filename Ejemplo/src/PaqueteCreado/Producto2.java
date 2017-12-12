package PaqueteCreado;

import java.util.Scanner;
public class Producto2 {
	

		private String codigo;
		private String tipo;
		private String descripcion;
		private int cantidad;
		private int stockMinimo;
		private float precio;
		
		
		public Producto2(String codigo, String tipo, String descripcion, int cantidad, int stockMinimo, float precio) {
			this.codigo = codigo;
			this.tipo = tipo;
			this.descripcion = descripcion;
			this.cantidad = cantidad;
			this.stockMinimo = stockMinimo;
			this.precio = precio;
		}
		public Producto2() {
			this.codigo = "Def";
			this.tipo = "";
			this.descripcion = "";
			this.cantidad = 1;
			this.stockMinimo = 5;
			this.precio = 0;
		}
		
		public String getCodigo() {
			return codigo;
		}
		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public int getCantidad() {
			return cantidad;
		}
		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}
		public int getStockMinimo() {
			return stockMinimo;
		}
		public void setStockMinimo(int stockMinimo) {
			this.stockMinimo = stockMinimo;
		}
		public float getPrecio() {
			return precio;
		}
		public void setPrecio(float precio) {
			this.precio = precio;
		}
		public void incrementarCantidad (int cant) {
			this.cantidad+=cant;
		}
		public void decrementarCantidad (int cant) {
			this.cantidad-=cant;
		}
		public void subirPrecio (float pr) {
			this.precio= this.precio + pr;
		}
		
		@Override
		public String toString() {
			return "Producto [codigo=" + codigo + ", tipo=" + tipo + ", descripcion=" + descripcion + ", cantidad="
					+ cantidad + ", stockMinimo=" + stockMinimo + ", precio=" + precio + "]";
		}
		
		public static String escanString (String mensaje, Scanner sc) {
			
			System.out.println(mensaje);
			return sc.next();
		}
		
		public static int escanInt (String mensaje, Scanner sc) {
			System.out.println(mensaje);
			return sc.nextInt();
		}
		public static float escanFloat (String mensaje, Scanner sc) {
			System.out.println(mensaje);
			return sc.nextFloat();
		}
		public static void main (String arg[]) {
			Scanner scan=new Scanner (System.in);
			String cod=escanString ("Escriba un código", scan);
			String tp =escanString ("Escriba un tipo", scan);
			String desc=escanString ("Escriba una descripcion", scan);
			int cant = escanInt ("Escriba la cantidad",scan);
			int stMin=escanInt ("Escriba el stock mínimo",scan);
			float prc=escanFloat ("Escriba un precio con decimal", scan);
			Producto2 prod1=new Producto2 (cod, tp, desc, cant, stMin, prc );
			
			scan.close();
			prc=65.9F;
			prod1.subirPrecio(prc);
			prod1.incrementarCantidad(45);
			System.out.println(prod1.toString());
			
			if (prod1.getStockMinimo()<prod1.getCantidad()) System.out.println("tiene el stock minimo disponible");
			
			System.out.println(prod1.descripcion);
			
		}
	}