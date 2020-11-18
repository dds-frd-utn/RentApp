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
    @NamedQuery(name = "Vehiculos.findByCodVin", query = "SELECT v FROM Vehiculos v WHERE v.codVin = :codVin"),
    @NamedQuery(name = "Vehiculos.findByPatente", query = "SELECT v FROM Vehiculos v WHERE v.patente = :patente"),
    @NamedQuery(name = "Vehiculos.findByMarca", query = "SELECT v FROM Vehiculos v WHERE v.marca = :marca"),
    @NamedQuery(name = "Vehiculos.findByModelo", query = "SELECT v FROM Vehiculos v WHERE v.modelo = :modelo"),
    @NamedQuery(name = "Vehiculos.findByA\u00f1o", query = "SELECT v FROM Vehiculos v WHERE v.a\u00f1o = :a\u00f1o"),
    @NamedQuery(name = "Vehiculos.findByCilindrada", query = "SELECT v FROM Vehiculos v WHERE v.cilindrada = :cilindrada"),
    @NamedQuery(name = "Vehiculos.findByPrecioDiario", query = "SELECT v FROM Vehiculos v WHERE v.precioDiario = :precioDiario")})
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
    @Column(name = "cod_vin")
    private int codVin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "patente")
    private int patente;
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
    @Column(name = "a\u00f1o")
    private int año;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cilindrada")
    private int cilindrada;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio_diario")
    private double precioDiario;

    public Vehiculos() {
    }

    public Vehiculos(Integer id) {
        this.id = id;
    }

    public Vehiculos(Integer id, int codTipo, int codVin, int patente, String marca, String modelo, int año, int cilindrada, double precioDiario) {
        this.id = id;
        this.codTipo = codTipo;
        this.codVin = codVin;
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.cilindrada = cilindrada;
        this.precioDiario = precioDiario;
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

    public int getCodVin() {
        return codVin;
    }

    public void setCodVin(int codVin) {
        this.codVin = codVin;
    }

    public int getPatente() {
        return patente;
    }

    public void setPatente(int patente) {
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

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public double getPrecioDiario() {
        return precioDiario;
    }

    public void setPrecioDiario(double precioDiario) {
        this.precioDiario = precioDiario;
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
