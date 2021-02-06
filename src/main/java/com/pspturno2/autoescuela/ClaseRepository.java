package com.pspturno2.autoescuela;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.autoescuela.compspturno2.xml.autoescuela.Alumno;
import com.autoescuela.compspturno2.xml.autoescuela.Clase;
import com.autoescuela.compspturno2.xml.autoescuela.Profesor;
import com.autoescuela.compspturno2.xml.autoescuela.Vehiculo;

@Component
public class ClaseRepository {
	private static final Map<String, Clase> clases = new HashMap<>();

	@PostConstruct
	public void initData() {
		// Clases //
		Clase clase1 = new Clase();
		clase1.setNombre("Turno_1");

		Clase clase2 = new Clase();
		clase1.setNombre("Turno_2");

		// Alumnos //
		// Alumnos Clase 1
		Alumno alumno = new Alumno();
		alumno.setNombre("Rafael");
		alumno.setMatricula("001A");
		alumno.setEstadoMatricula(true);
		alumno.setExamenTeorico(false);
		alumno.setExamenPractico(false);
		alumno.setDireccion("Calle Espinosa y carcel");
		clase1.addAlumno(alumno);

		alumno = new Alumno();
		alumno.setNombre("Pablo");
		alumno.setMatricula("002A");
		alumno.setEstadoMatricula(true);
		alumno.setExamenTeorico(true);
		alumno.setExamenPractico(false);
		alumno.setDireccion("Calle Estrella Porcion");
		clase1.addAlumno(alumno);

		alumno = new Alumno();
		alumno.setNombre("David");
		alumno.setMatricula("003A");
		alumno.setEstadoMatricula(false);
		alumno.setExamenTeorico(true);
		alumno.setExamenPractico(true);
		alumno.setDireccion("Calle Lisboa");
		clase1.addAlumno(alumno);

		// Alumnos Clase 2

		alumno = new Alumno();
		alumno.setNombre("Miguel");
		alumno.setMatricula("004A");
		alumno.setEstadoMatricula(true);
		alumno.setExamenTeorico(true);
		alumno.setExamenPractico(false);
		alumno.setDireccion("Calle Galicia");
		clase2.addAlumno(alumno);

		alumno = new Alumno();
		alumno.setNombre("Angel");
		alumno.setMatricula("005A");
		alumno.setEstadoMatricula(true);
		alumno.setExamenTeorico(false);
		alumno.setExamenPractico(false);
		alumno.setDireccion("Calle MF");
		clase2.addAlumno(alumno);

		// Profesores //
		Profesor profesor = new Profesor();
		profesor.setNombre("Jorge");
		profesor.setIdentificador("P1");
		profesor.setDireccion("Calle Feria");
		clase1.setProfesor(profesor);

		profesor = new Profesor();
		profesor.setNombre("Adolfo");
		profesor.setIdentificador("P2");
		profesor.setDireccion("Calle Interfaz");
		clase2.setProfesor(profesor);

		// Vehiculos //
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setModelo("Clio");
		vehiculo.setMatricula("0001ABC");
		vehiculo.setFechaAdquisicion("01/01/2021");
		vehiculo.setEnUso(true);
		clase1.addVehiculo(vehiculo);

		vehiculo = new Vehiculo();
		vehiculo.setModelo("Seat");
		vehiculo.setMatricula("0002ABC");
		vehiculo.setFechaAdquisicion("10/05/2020");
		vehiculo.setEnUso(false);
		clase1.addVehiculo(vehiculo);

		vehiculo = new Vehiculo();
		vehiculo.setModelo("Seat");
		vehiculo.setMatricula("1000CBA");
		vehiculo.setFechaAdquisicion("10/05/2020");
		vehiculo.setEnUso(false);
		clase1.addVehiculo(vehiculo);

		vehiculo = new Vehiculo();
		vehiculo.setModelo("Seat");
		vehiculo.setMatricula("2000CBA");
		vehiculo.setFechaAdquisicion("28/01/2020");
		vehiculo.setEnUso(true);
		clase1.addVehiculo(vehiculo);

		// Importacion de las clases al hashmap
		clases.put(clase1.getNombre(), clase1);
		clases.put(clase2.getNombre(), clase2);
	}

	
	//Obtencion de clases
	public Clase findClase(String nombre) {
		Assert.notNull(nombre, "El nombre de la clase no es correcta");
		return clases.get(nombre);
	}

	public List<Clase> findAllClases() {
		ArrayList<Clase> clas = new ArrayList<>();
		for (Clase clase : this.clases.values()) {
			clas.add(clase);
		}
		return clas;
	}
	
	//Obtencion de alumnos
	public List<Alumno> findAllAlumnos() {
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		for (Clase clase : clases.values()) {
			for (Alumno alu : clase.getAlumnos().values()) {
				alumnos.add(alu);
			}
		}

		return alumnos;
	}

	public List<Alumno> findAllAlumnosDeUnaClase(String nomClase) {
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		for (Alumno alu : clases.get(nomClase).getAlumnos().values()) {
			alumnos.add(alu);
		}

		return alumnos;
	}
	
	public Alumno findAlumno(String matricula) {
		Alumno alumno = null;
		for (Clase clase : clases.values()) {
			if (clase.getAlumnos().containsKey(matricula)) {
				alumno = clase.getAlumnos().get(matricula);
			}
		}

		return alumno;
	}
	
	//Obtencion de profesores
	public List<Profesor> findAllProfesores() {
		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		for (Clase clase : clases.values()) {
			profesores.add(clase.getProfesor());
		}

		return profesores;
	}

	public Profesor findProferorDeUnaClase(String nomClase) {
		return clases.get(nomClase).getProfesor();
	}
	
	public Profesor findProfesor(String identificador) {
		Profesor prof = null;
		for (Clase clase : clases.values()) {
			if (clase.getProfesor().getIdentificador() == identificador) {
				prof = clase.getProfesor();
			}
		}

		return prof;
	}
	
	//Obtencion de vehiculos
	public List<Vehiculo> findAllVehiculos() {
		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		for (Clase clase : clases.values()) {
			for (Vehiculo veh : clase.getVehiculos().values()) {
				vehiculos.add(veh);
			}
		}

		return vehiculos;
	}

	public List<Vehiculo> findAllVehiculosDeUnaClase(String nomClase) {
		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		for (Vehiculo veh : clases.get(nomClase).getVehiculos().values()) {
			vehiculos.add(veh);
		}

		return vehiculos;
	}
	
	public Vehiculo findVehiculo(String matricula) {
		Vehiculo vehiculo = null;
		for (Clase clase : clases.values()) {
			if (clase.getVehiculos().containsKey(matricula)) {
				vehiculo = clase.getVehiculos().get(matricula);
			}
		}

		return vehiculo;
	}
}