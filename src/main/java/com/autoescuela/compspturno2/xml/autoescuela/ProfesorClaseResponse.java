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
 *         &lt;element name="Profesor" type="{http://www.compspturno2.autoescuela.com/xml/autoescuela}Profesor"/>
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
    "profesor"
})
@XmlRootElement(name = "ProfesorClaseResponse")
public class ProfesorClaseResponse {

    @XmlElement(name = "Profesor", required = true)
    protected Profesor profesor;

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

}
