//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.02.06 a las 06:41:46 PM CET 
//


package com.autoescuela.compspturno2.xml.autoescuela;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Alumno" type="{http://www.compspturno2.autoescuela.com/xml/autoescuela}Alumno"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "alumno"
})
@XmlRootElement(name = "AlumnoResponse")
public class AlumnoResponse {

    @XmlElement(name = "Alumno", required = true)
    protected Alumno alumno;

    /**
     * Obtiene el valor de la propiedad alumno.
     * 
     * @return
     *     possible object is
     *     {@link Alumno }
     *     
     */
    public Alumno getAlumno() {
        return alumno;
    }

    /**
     * Define el valor de la propiedad alumno.
     * 
     * @param value
     *     allowed object is
     *     {@link Alumno }
     *     
     */
    public void setAlumno(Alumno value) {
        this.alumno = value;
    }

}
