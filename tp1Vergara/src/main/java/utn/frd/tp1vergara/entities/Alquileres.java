/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frd.tp1vergara.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Juan Manuel Vergara
 */
@Entity
@Table(name = "alquileres")
@NamedQueries({
    @NamedQuery(name = "Alquileres.findAll", query = "SELECT a FROM Alquileres a"),
    @NamedQuery(name = "Alquileres.findByIdOrden", query = "SELECT a FROM Alquileres a WHERE a.idOrden = :idOrden"),
    @NamedQuery(name = "Alquileres.findByDniCliente", query = "SELECT a FROM Alquileres a WHERE a.dniCliente = :dniCliente"),
    @NamedQuery(name = "Alquileres.findByPatente", query = "SELECT a FROM Alquileres a WHERE a.patente = :patente"),
    @NamedQuery(name = "Alquileres.findByIdConsecionaria", query = "SELECT a FROM Alquileres a WHERE a.idConsecionaria = :idConsecionaria"),
    @NamedQuery(name = "Alquileres.findByFechaAlquiler", query = "SELECT a FROM Alquileres a WHERE a.fechaAlquiler = :fechaAlquiler"),
    @NamedQuery(name = "Alquileres.findByFechaDevolucion", query = "SELECT a FROM Alquileres a WHERE a.fechaDevolucion = :fechaDevolucion"),
    @NamedQuery(name = "Alquileres.findByKilometrosRecorridos", query = "SELECT a FROM Alquileres a WHERE a.kilometrosRecorridos = :kilometrosRecorridos")})
public class Alquileres implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_orden")
    private Integer idOrden;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dni_cliente")
    private int dniCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "patente")
    private String patente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_consecionaria")
    private int idConsecionaria;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_alquiler")
    @Temporal(TemporalType.DATE)
    private Date fechaAlquiler;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_devolucion")
    @Temporal(TemporalType.DATE)
    private Date fechaDevolucion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "kilometros_recorridos")
    private int kilometrosRecorridos;

    public Alquileres() {
    }

    public Alquileres(Integer idOrden) {
        this.idOrden = idOrden;
    }

    public Alquileres(Integer idOrden, int dniCliente, String patente, int idConsecionaria, Date fechaAlquiler, Date fechaDevolucion, int kilometrosRecorridos) {
        this.idOrden = idOrden;
        this.dniCliente = dniCliente;
        this.patente = patente;
        this.idConsecionaria = idConsecionaria;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public Integer getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Integer idOrden) {
        this.idOrden = idOrden;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getIdConsecionaria() {
        return idConsecionaria;
    }

    public void setIdConsecionaria(int idConsecionaria) {
        this.idConsecionaria = idConsecionaria;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrden != null ? idOrden.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alquileres)) {
            return false;
        }
        Alquileres other = (Alquileres) object;
        if ((this.idOrden == null && other.idOrden != null) || (this.idOrden != null && !this.idOrden.equals(other.idOrden))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "utn.frd.tp1vergara.entities.Alquileres[ idOrden=" + idOrden + " ]";
    }
    
}
