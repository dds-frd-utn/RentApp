/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frd.tp1vergara.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Juan Manuel Vergara
 */
@Entity
@Table(name = "vehiculos")
@NamedQueries({
    @NamedQuery(name = "Vehiculos.findAll", query = "SELECT v FROM Vehiculos v"),
    @NamedQuery(name = "Vehiculos.findById", query = "SELECT v FROM Vehiculos v WHERE v.id = :id"),
    @NamedQuery(name = "Vehiculos.findByCodTipo", query = "SELECT v FROM Vehiculos v WHERE v.codTipo = :codTipo"),
    @NamedQuery(name = "Vehiculos.findByPatente", query = "SELECT v FROM Vehiculos v WHERE v.patente = :patente"),
    @NamedQuery(name = "Vehiculos.findByMarca", query = "SELECT v FROM Vehiculos v WHERE v.marca = :marca"),
    @NamedQuery(name = "Vehiculos.findByModelo", query = "SELECT v FROM Vehiculos v WHERE v.modelo = :modelo"),
    @NamedQuery(name = "Vehiculos.findByPrecioDiario", query = "SELECT v FROM Vehiculos v WHERE v.precioDiario = :precioDiario"),
    @NamedQuery(name = "Vehiculos.findByCuitConcesionaria", query = "SELECT v FROM Vehiculos v WHERE v.cuitConcesionaria = :cuitConcesionaria")})
public class Vehiculos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_tipo")
    private int codTipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "patente")
    private String patente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "marca")
    private String marca;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "modelo")
    private String modelo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio_diario")
    private float precioDiario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cuit_concesionaria")
    private int cuitConcesionaria;

    public Vehiculos() {
    }

    public Vehiculos(Integer id) {
        this.id = id;
    }

    public Vehiculos(Integer id, int codTipo, String patente, String marca, String modelo, float precioDiario, int cuitConcesionaria) {
        this.id = id;
        this.codTipo = codTipo;
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.precioDiario = precioDiario;
        this.cuitConcesionaria = cuitConcesionaria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCodTipo() {
        return codTipo;
    }

    public void setCodTipo(int codTipo) {
        this.codTipo = codTipo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecioDiario() {
        return precioDiario;
    }

    public void setPrecioDiario(float precioDiario) {
        this.precioDiario = precioDiario;
    }

    public int getCuitConcesionaria() {
        return cuitConcesionaria;
    }

    public void setCuitConcesionaria(int cuitConcesionaria) {
        this.cuitConcesionaria = cuitConcesionaria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vehiculos)) {
            return false;
        }
        Vehiculos other = (Vehiculos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "utn.frd.tp1vergara.entities.Vehiculos[ id=" + id + " ]";
    }
    
}
