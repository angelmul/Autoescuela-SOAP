//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.02.06 a las 06:59:33 PM CET 
//


package com.autoescuela.compspturno2.xml.autoescuela;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Alumno complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Alumno">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="matricula" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estadoMatricula" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="examenTeorico" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="examenPractico" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Alumno", propOrder = {
    "nombre",
    "matricula",
    "estadoMatricula",
    "examenTeorico",
    "examenPractico",
    "direccion"
})
public class Alumno {

    @XmlElement(required = true)
    protected String nombre;
    @XmlElement(required = true)
    protected String matricula;
    protected boolean estadoMatricula;
    protected boolean examenTeorico;
    protected boolean examenPractico;
    @XmlElement(required = true)
    protected String direccion;

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
     * Obtiene el valor de la propiedad matricula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Define el valor de la propiedad matricula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricula(String value) {
        this.matricula = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoMatricula.
     * 
     */
    public boolean isEstadoMatricula() {
        return estadoMatricula;
    }

    /**
     * Define el valor de la propiedad estadoMatricula.
     * 
     */
    public void setEstadoMatricula(boolean value) {
        this.estadoMatricula = value;
    }

    /**
     * Obtiene el valor de la propiedad examenTeorico.
     * 
     */
    public boolean isExamenTeorico() {
        return examenTeorico;
    }

    /**
     * Define el valor de la propiedad examenTeorico.
     * 
     */
    public void setExamenTeorico(boolean value) {
        this.examenTeorico = value;
    }

    /**
     * Obtiene el valor de la propiedad examenPractico.
     * 
     */
    public boolean isExamenPractico() {
        return examenPractico;
    }

    /**
     * Define el valor de la propiedad examenPractico.
     * 
     */
    public void setExamenPractico(boolean value) {
        this.examenPractico = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

}
