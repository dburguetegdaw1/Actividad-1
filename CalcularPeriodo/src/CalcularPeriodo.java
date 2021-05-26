import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CalcularPeriodo {
	
	public static void main(String[] args) {
		
		//Creamos la fecha 
		LocalDate fecha = LocalDate.of(1492, Month.OCTOBER, 12);	 
		// Mostramos cuánto tiempo ha pasado
		System.out.println(calcularPeriodo("El descubrimiento de Am�rica", fecha));
		
		//Creamos la fecha
		LocalDate fecha2 = LocalDate.of(1789, Month.MAY, 5);	 
		// Mostramos cuánto tiempo ha pasado
		System.out.println(calcularPeriodo("La revolucion francesa", fecha2));
				
		//Creamos la fecha
		LocalDate fecha3 = LocalDate.of(2021, Month.MAY, 26);	 
		// Mostramos cuánto tiempo ha pasado
		System.out.println(calcularPeriodo("Plin Plin Plon", fecha3));
		
	}
	
	public static String calcularPeriodo(String nombre, LocalDate fecha) {
        
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fecha, fechaActual);
        
        // Cálculo de las diferencias
        int anyos = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();
        
        String texto = String.format(nombre + " ocurrio hace %d a�os, %d meses y %d dias.", anyos, meses, dias);
         
        return texto;
    }
 
}
