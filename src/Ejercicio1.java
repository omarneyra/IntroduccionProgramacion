
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		color2grisTest();
	}
	
    // Test para color2grisTest 
	public static void color2grisTest(){
		assert color2gris(255.0, 0.0, 0.0) == 76.5;
		assert color2gris(0.0, 255.0, 0.0) == 150.45;
		assert color2gris(0.0, 0.0, 255.0) == 28.05;
		assert color2gris(140.0, 100.0, 200.0) == 123.0;
		assert color2gris(0.0, 0.0, 0.0) == 0.0;
		assert color2gris(255.0, 255.0, 255.0) == 255.0;
		//assert color2gris(140.0, 100.0, 200.0) == 167.0;
	}
	
	// color2gris: num num num -> double
    // Calcula la tonalidad en gris de un color en su representación RGB
    // Ejemplo: color2gris(255.0, 0.0, 0.0) devuelve 76.5
	public static double color2gris(double intensidadRojo, double intensidadVerde, double intensidadAzul){
		return tonalidadGrisDesdeRojo(intensidadRojo) + 
				tonalidadGrisDesdeVerde(intensidadVerde) + 
				tonalidadGrisDesdeAzul(intensidadAzul);
	}
	
	// tonalidadGrisDesdeRojo: num -> double
    // Calcula la tonalidad en gris de una intensidad del color rojo
    // Ejemplo: tonalidadGrisDesdeRojo(255.0) devuelve 76.5
	public static double tonalidadGrisDesdeRojo(double intensidadRojo){
		double ponderacionRojo = 0.3;
		return ponderacionRojo * intensidadRojo;
	}

	// tonalidadGrisDesdeVerde: num -> double
    // Calcula la tonalidad en gris de una intensidad del color verde
    // Ejemplo: tonalidadGrisDesdeVerde(255.0) devuelve 150.45
	public static double tonalidadGrisDesdeVerde(double intensidadVerde){
		double ponderacionVerde = 0.59;
		return ponderacionVerde * intensidadVerde;
	}

	// tonalidadGrisDesdeAzul: num -> double
    // Calcula la tonalidad en gris de una intensidad del color azul
    // Ejemplo: tonalidadGrisDesdeAzul(255.0) devuelve 28.05
	public static double tonalidadGrisDesdeAzul(double intensidadAzul){
		double ponderacionAzul = 0.11;
		return ponderacionAzul * intensidadAzul;
	}
}
