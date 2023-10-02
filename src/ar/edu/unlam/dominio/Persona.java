package ar.edu.unlam.dominio;

public class Persona {

	private String nombre;
	private String apellido;
	private Integer dni;
	private String contrasenia;
	private Carrera carrera;
	private Nota parcial1;
	private Nota parcial2;

	/**
	 * El constructor debe generar las condiciones necesaias para garantizar el
	 * correcto funcionamiento de la app
	 */
	public Persona(String nombre, String apellido, Integer dni, String contrasenia, Carrera carrera, Nota primerParcial,
			Nota segundoParcial) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.contrasenia = contrasenia;
		this.carrera = carrera;
		this.parcial1 = primerParcial;
		this.parcial2 = segundoParcial;

	}

	/**
	 * Actualiza la nota del alumno a partir de una nota proporcionada.
	 * 
	 * @param notaARecuperar Nota para recuperar el parcial 1 o el parcial 2.
	 * @return true si fue posible actualizar la nota
	 * 
	 *         Debe proporcionar el codigo necesario para que funcione
	 *         correctamente.
	 * 
	 */
	public boolean recuperarNota(Nota notaARecuperar) {
		// La nota solo puede recuperarse si es menor o igual a 6
		// isEsPrimerParcial boolean
		if (notaARecuperar.isEsPrimerParcial()) {
			if (this.parcial1.getValor() <= 6) {
				parcial1 = notaARecuperar;
				return true;
			}
		}
		if (!notaARecuperar.isEsPrimerParcial()) {
			if (this.parcial2.getValor() <= 6) {
				parcial2 = notaARecuperar;
				return true;
			}
		}
		return false;
	}

	/**
	 * Indica la condicion de la persona frente a la materia
	 * 
	 * Debe proporcionar el codigo necesario para que funcione correctamente
	 * 
	 * - Si tiene 1 parcial con nota inferior a 4 la condicion final es DESAPROBADO.
	 * - Si tiene las dos notas entre 4 y 6 (inclusive ambos), la condicion final es
	 * CURSA. - Si ambas notas son mayores o iguales a 7, la condicion final es
	 * PROMOCIONA.
	 * 
	 */
	public CondicionFinal obtenerCondicionFinal() {

		if (parcial1.getValor() == 4 || parcial2.getValor() <= 4) {
			return CondicionFinal.DESAPROBADO;
		}

		if (parcial1.getValor() >= 7 && parcial2.getValor() >= 7) {
			return CondicionFinal.PROMOCIONA;
		}

		return CondicionFinal.CURSA;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	public Nota getParcial1() {
		return parcial1;
	}

	public void setParcial1(Nota parcial1) {
		this.parcial1 = parcial1;
	}

	public Nota getParcial2() {
		return parcial2;
	}

	public void setParcial2(Nota parcial2) {
		this.parcial2 = parcial2;
	}

	@Override
	public String toString() {
		return " [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", contrasenia=" + contrasenia
				+ ", carrera=" + carrera + ", parcial1=" + parcial1 + ", parcial2=" + parcial2 + "]";
	}

}
