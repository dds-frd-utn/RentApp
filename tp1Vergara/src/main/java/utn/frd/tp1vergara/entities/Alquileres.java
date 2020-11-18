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

/**
 *
 * @author Juan Manuel Vergara
 */
@Entity
@Table(name = "alquileres")
@NamedQueries({
    @NamedQuery(name = "Alquileres.findAll", query = "SELECT a FROM Alquileres a"),
    @NamedQuery(name = "Alquileres.findByIdOrden", query = "SELECT a FROM Alquileres a WHERE a.idOrden = :idOrden"),
    @NamedQuery(name = "Alquileres.findByIdCliente", query = "SELECT a FROM Alquileres a WHERE a.idCliente = :idCliente"),
    @NamedQuery(name = "Alquileres.findByIdVehiculo", query = "SELECT a FROM Alquileres a WHERE a.idVehiculo = :idVehiculo"),
    @NamedQuery(name = "Alquileres.findByIdConcesionaria", query = "SELECT a FROM Alquileres a WHERE a.idConcesionaria = :idConcesionaria"),
    @NamedQuery(name = "Alquileres.findByFechaAlquiler", query = "SELECT a FROM Alquileres a WHERE a.fechaAlquiler = :fechaAlquiler"),
    @NamedQuery(name = "Alquileres.findByFechaDevolucion", query = "SELECT a FROM Alquileres a WHERE a.fechaDevolucion = :fechaDevolucion")})
public class Alquileres implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_orden")
    private Integer idOrden;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_cliente")
    private int idCliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_vehiculo")
    private int idVehiculo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_concesionaria")
    private int idConcesionaria;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_alquiler")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlquiler;
    @Column(name = "fecha_devolucion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDevolucion;

    public Alquileres() {
    }

    public Alquileres(Integer idOrden) {
        this.idOrden = idOrden;
    }

    public Alquileres(Integer idOrden, int idCliente, int idVehiculo, int idConcesionaria, Date fechaAlquiler) {
        this.idOrden = idOrden;
        this.idCliente = idCliente;
        this.idVehiculo = idVehiculo;
        this.idConcesionaria = idConcesionaria;
        this.fechaAlquiler = fechaAlquiler;
    }

    public Integer getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Integer idOrden) {
        this.idOrden = idOrden;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public int getIdConcesionaria() {
        return idConcesionaria;
    }

    public void setIdConcesionaria(int idConcesionaria) {
        this.idConcesionaria = idConcesionaria;
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
