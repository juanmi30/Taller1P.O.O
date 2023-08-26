package uniandes.dpoo.taller0.modificacion;

import java.io.IOException;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion {

	
	
	public static void main(String[] args) {
		System.out.println("Hola, Mundo.");
		try {
			CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
			System.out.println(calc.paisConMasMedallistas());
		} catch (IOException e) {
			System.out.println("ERROR: hubo un problema leyendo el archivo.");
			e.printStackTrace();
		}
		
	}

}
