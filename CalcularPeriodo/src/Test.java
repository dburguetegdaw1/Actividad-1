

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

class Test {

	@org.junit.jupiter.api.Test
	void testCalcularPeriodo() {
		LocalDate fecha = LocalDate.of(2021, 05, 25);
		String cadena = CalcularPeriodo.calcularPeriodo("ayer", fecha);
		assertEquals("ayer ocurrio hace 0 años, 0 meses y 1 dias.", cadena);
	}

}
