package eje2;

public class operacion {
	private int n,n2;

	public operacion(int n, int n2) {
		this.n = n;
		this.n2 = n2;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}
	
	public String operacionNumeros(int n, int n2) {
		int suma = 0,multiplicacion = 1;
		String resultado;
		for(int i=n ; i<n2; i++) {
			if(i %2 ==0) {
				suma = suma +1;
			}else {
				multiplicacion = multiplicacion * i;
			}
		}
		return resultado ="NUM1: " + n + "\nNUM2: " + n2 + "\nResultado: Suma pares: " + suma + "\nProductoImpares: " + multiplicacion ;
	}
}
