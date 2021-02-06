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
 * <p>Clase Java para Vehiculo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Vehiculo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="matricula" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaAdquisicion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="enUso" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vehiculo", propOrder = {
    "modelo",
    "matricula",
    "fechaAdquisicion",
    "enUso"
})
public class Vehiculo {

    @XmlElement(required = true)
    protected String modelo;
    @XmlElement(required = true)
    protected String matricula;
    @XmlElement(required = true)
    protected String fechaAdquisicion;
    protected boolean enUso;

    /**
     * Obtiene el valor de la propiedad modelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Define el valor de la propiedad modelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelo(String value) {
        this.modelo = value;
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
     * Obtiene el valor de la propiedad fechaAdquisicion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    /**
     * Define el valor de la propiedad fechaAdquisicion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaAdquisicion(String value) {
        this.fechaAdquisicion = value;
    }

    /**
     * Obtiene el valor de la propiedad enUso.
     * 
     */
    public boolean isEnUso() {
        return enUso;
    }

    /**
     * Define el valor de la propiedad enUso.
     * 
     */
    public void setEnUso(boolean value) {
        this.enUso = value;
    }

}
