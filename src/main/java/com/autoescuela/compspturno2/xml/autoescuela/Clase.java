//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.02.05 a las 09:49:08 AM CET 
//


package com.autoescuela.compspturno2.xml.autoescuela;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Clase complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Clase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Alumno" type="{http://www.compspturno2.autoescuela.com/xml/autoescuela}Alumno" maxOccurs="10"/>
 *         &lt;element name="Profesor" type="{http://www.compspturno2.autoescuela.com/xml/autoescuela}Profesor"/>
 *         &lt;element name="Vehiculo" type="{http://www.compspturno2.autoescuela.com/xml/autoescuela}Vehiculo" maxOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Clase", propOrder = {
    "nombre",
    "alumno",
    "profesor",
    "vehiculo"
})
public class Clase {

    @XmlElement(required = true)
    protected String nombre;
    @XmlElement(name = "Alumno", required = true)
    protected Map<String, Alumno> alumnos = new HashMap<>();
    @XmlElement(name = "Profesor", required = true)
    protected Profesor profesor;
    @XmlElement(name = "Vehiculo", required = true)
    protected Map<String, Vehiculo> vehiculos = new HashMap<>();

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the alumno property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alumno property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlumno().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Alumno }
     * 
     * 
     */
    public Map<String, Alumno> getAlumnos() {
        return this.alumnos;
    }
    
    public void  setAlumnos(Map<String, Alumno> alus) {
        this.alumnos = alus;
    }
    
    public void addAlumno(Alumno alu) {
    	if (alu != null) {
        	alumnos.put(alu.matricula, alu);
        }
    }

    /**
     * Obtiene el valor de la propiedad profesor.
     * 
     * @return
     *     possible object is
     *     {@link Profesor }
     *     
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * Define el valor de la propiedad profesor.
     * 
     * @param value
     *     allowed object is
     *     {@link Profesor }
     *     
     */
    public void setProfesor(Profesor value) {
        this.profesor = value;
    }

    /**
     * Gets the value of the vehiculo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehiculo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehiculo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vehiculo }
     * 
     * 
     */
    public Map<String, Vehiculo> getVehiculos() {
        return this.vehiculos;
    }
    
    public void  setVehiculos(Map<String, Vehiculo> veh) {
        this.vehiculos = veh;
    }
    
    public void addVehiculo(Vehiculo veh) {
    	if (veh != null) {
        	vehiculos.put(veh.matricula, veh);
    	}
    }

}
