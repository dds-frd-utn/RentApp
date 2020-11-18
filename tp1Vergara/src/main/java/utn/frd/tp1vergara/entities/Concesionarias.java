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
@Table(name = "concesionarias")
@NamedQueries({
    @NamedQuery(name = "Concesionarias.findAll", query = "SELECT c FROM Concesionarias c"),
    @NamedQuery(name = "Concesionarias.findById", query = "SELECT c FROM Concesionarias c WHERE c.id = :id"),
    @NamedQuery(name = "Concesionarias.findByNombre", query = "SELECT c FROM Concesionarias c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Concesionarias.findByDireccion", query = "SELECT c FROM Concesionarias c WHERE c.direccion = :direccion"),
    @NamedQuery(name = "Concesionarias.findByCuit", query = "SELECT c FROM Concesionarias c WHERE c.cuit = :cuit")})
public class Concesionarias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cuit")
    private int cuit;

    public Concesionarias() {
    }

    public Concesionarias(Integer id) {
        this.id = id;
    }

    public Concesionarias(Integer id, String nombre, String direccion, int cuit) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuit = cuit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
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
        if (!(object instanceof Concesionarias)) {
            return false;
        }
        Concesionarias other = (Concesionarias) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "utn.frd.tp1vergara.entities.Concesionarias[ id=" + id + " ]";
    }
    
}
