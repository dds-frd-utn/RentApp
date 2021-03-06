/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frd.tp1vergara.sessions;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import utn.frd.tp1vergara.entities.Alquileres;

/**
 *
 * @author Juan Manuel Vergara
 */
@Stateless
public class AlquileresFacade extends AbstractFacade<Alquileres> {

    @PersistenceContext(unitName = "jdbc/dds")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AlquileresFacade() {
        super(Alquileres.class);
    }
    
}
