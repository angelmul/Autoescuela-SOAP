package com.pspturno2.autoescuela;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.autoescuela.compspturno2.xml.autoescuela.AlumnosClaseResponse;
import com.autoescuela.compspturno2.xml.autoescuela.AlumnoRequest;
import com.autoescuela.compspturno2.xml.autoescuela.AlumnoResponse;
import com.autoescuela.compspturno2.xml.autoescuela.AlumnosClaseRequest;
import com.autoescuela.compspturno2.xml.autoescuela.AlumnosRequest;
import com.autoescuela.compspturno2.xml.autoescuela.AlumnosResponse;
import com.autoescuela.compspturno2.xml.autoescuela.ProfesorRequest;
import com.autoescuela.compspturno2.xml.autoescuela.ProfesorResponse;
import com.autoescuela.compspturno2.xml.autoescuela.ProfesoresRequest;
import com.autoescuela.compspturno2.xml.autoescuela.ProfesoresResponse;
import com.autoescuela.compspturno2.xml.autoescuela.ClaseRequest;
import com.autoescuela.compspturno2.xml.autoescuela.ClaseResponse;
import com.autoescuela.compspturno2.xml.autoescuela.ClasesRequest;
import com.autoescuela.compspturno2.xml.autoescuela.ClasesResponse;
import com.autoescuela.compspturno2.xml.autoescuela.ProfesorClaseRequest;
import com.autoescuela.compspturno2.xml.autoescuela.ProfesorClaseResponse;
import com.autoescuela.compspturno2.xml.autoescuela.VehiculoRequest;
import com.autoescuela.compspturno2.xml.autoescuela.VehiculoResponse;
import com.autoescuela.compspturno2.xml.autoescuela.VehiculosClaseRequest;
import com.autoescuela.compspturno2.xml.autoescuela.VehiculosClaseResponse;
import com.autoescuela.compspturno2.xml.autoescuela.VehiculosRequest;
import com.autoescuela.compspturno2.xml.autoescuela.VehiculosResponse;

@Endpoint
public class AutoescuelaEndPoint 
{
    private static final String NAMESPACE_URI = "http://www.compspturno2.autoescuela.com/xml/autoescuela";
 
    private ClaseRepository claseRepository;

 
    @Autowired
    public AutoescuelaEndPoint(ClaseRepository repository) {
        this.claseRepository = repository;
    }
    //Metodo para obtener una clase en su conjunto, (da errores debido a que tiene varios hashmaps con clases)
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ClaseRequest")
    @ResponsePayload
    public ClaseResponse getClase(@RequestPayload ClaseRequest request) {
        ClaseResponse response = new ClaseResponse();
        response.setClase(this.claseRepository.findClase(request.getNombre()));
 
        return response;
    }
    
    //Metodo para obtener todas las clases
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ClasesRequest")
    @ResponsePayload
    public ClasesResponse getClases(@RequestPayload ClasesRequest request) {
    	ClasesResponse response = new ClasesResponse();
        response.setClases(this.claseRepository.findAllClases());
 
        return response;
    }
    
    //Metodo para obtener un alumno introduciendo su matricula(String identificador)
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AlumnoRequest")
    @ResponsePayload
    public AlumnoResponse getAlumno(@RequestPayload AlumnoRequest request) {
        AlumnoResponse response = new AlumnoResponse();
        response.setAlumno(this.claseRepository.findAlumno(request.getMatricula()));
 
        return response;
    }
    
    //Metodo para obtener todos los alumnos de todas las clases, no se introduce nada
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AlumnosRequest")
    @ResponsePayload
    public AlumnosResponse getAlumnos(@RequestPayload AlumnosRequest request) {
    	AlumnosResponse response = new AlumnosResponse();
        response.setAlumnos(this.claseRepository.findAllAlumnos());
 
        return response;
    }
    
    //Metodo para obtener todos los alumnos de una clase, introduciendo el nombre de la clase
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AlumnosClaseRequest")
    @ResponsePayload
    public AlumnosClaseResponse getAlumnosClase(@RequestPayload AlumnosClaseRequest request) {
    	AlumnosClaseResponse response = new AlumnosClaseResponse();
        response.setAlumnos(this.claseRepository.findAllAlumnosDeUnaClase(request.getNombre()));
 
        return response;
    }
    
    //Metodo para obtener un profesor, introduciendo su identificador de profesor
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ProfesorRequest")
    @ResponsePayload
    public ProfesorResponse getProfesor(@RequestPayload ProfesorRequest request) {
        ProfesorResponse response = new ProfesorResponse();
        response.setProfesor(this.claseRepository.findProfesor(request.getIdentificador()));
 
        return response;
    }
    
    //Metodo para obtener todos los profesores, no se introduce nada
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ProfesoresRequest")
    @ResponsePayload
    public ProfesoresResponse getProfesores(@RequestPayload ProfesoresRequest request) {
    	ProfesoresResponse response = new ProfesoresResponse();
        response.setProfesores(this.claseRepository.findAllProfesores());
 
        return response;
    }
    
    //Metodo para obtener el profesor de una clase, introduciendo el nombre de la clase
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ProfesorClaseRequest")
    @ResponsePayload
    public ProfesorClaseResponse getProfesorClase(@RequestPayload ProfesorClaseRequest request) {
    	ProfesorClaseResponse response = new ProfesorClaseResponse();
        response.setProfesor(this.claseRepository.findProferorDeUnaClase(request.getNombre()));
 
        return response;
    }
    
    //Metodo para obtener un vehiculo, itroduciendo su matricula
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "VehiculoRequest")
    @ResponsePayload
    public VehiculoResponse getVehiculo(@RequestPayload VehiculoRequest request) {
    	VehiculoResponse response = new VehiculoResponse();
        response.setVehiculo(this.claseRepository.findVehiculo(request.getMatricula()));
 
        return response;
    }
    
    //Metodo para obtener todos los vehiculos, no se introduce nada
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "VehiculosRequest")
    @ResponsePayload
    public VehiculosResponse getVehiculos(@RequestPayload VehiculosRequest request) {
    	VehiculosResponse response = new VehiculosResponse();
        response.setVehiculos(this.claseRepository.findAllVehiculos());
 
        return response;
    }
    
    //Metodo para obtener todos los vehiculos de una clase, introduciendo el nombre de la clase
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "VehiculosClaseRequest")
    @ResponsePayload
    public VehiculosClaseResponse getVehiculosClase(@RequestPayload VehiculosClaseRequest request) {
    	VehiculosClaseResponse response = new VehiculosClaseResponse();
        response.setVehiculos(this.claseRepository.findAllVehiculosDeUnaClase(request.getNombre()));
 
        return response;
    }
}