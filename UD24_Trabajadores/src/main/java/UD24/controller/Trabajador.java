package UD24.controller;

public enum Trabajador {

	COMERCIAL, ELECTRICISTA, PROGRAMADOR, ANALISTA, RECURSOSHUMANOS;

	/**
	 * Devuelve el salario del trabajo
	 * @param trabajo
	 * @return
	 */
	
	public static int definirSalario(Trabajador trabajador) {
		
		switch (trabajador) {
		case COMERCIAL:
			return 1250;
			
		case ELECTRICISTA:
			return 1100;
			
		case PROGRAMADOR:
			return 1300;
			
		case ANALISTA:
			return 1350;
			
		case RECURSOSHUMANOS:
			return 1200;
			
		default:
			return 0;
		}
		
	}
	
	/**
	 * Devuelver el nombre del trabajo
	 * @param trabajo
	 * @return
	 */
	public static String getTrabajo(Trabajador trabajador) {
		
		switch (trabajador) {
		
		case COMERCIAL:
			
			return "comercial";
			
		case ELECTRICISTA:
			
			return "electricista";
			
		case PROGRAMADOR:
			
			return "programador";
			
		case ANALISTA:
			
			return "analista";
			
		case RECURSOSHUMANOS:
			
			return "recursos humanos";
			
		default:
			
			return "trabajo predeterminado";
		}
		
	}
	
}