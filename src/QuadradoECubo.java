public class QuadradoECubo {

	public static void main(String[] args) {
		int i, quadrado, cubo;
		for (i=0; i<=10; i++) {
		quadrado = i*i;
		cubo = i*i*i;
		System.out.println("Quadrado de "+i+" � igual a: "  +quadrado+"\nCubo de "+i+" � igual a: "+cubo);
		}
	}
}