/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frd.tp1vergara.rest.services;


import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import utn.frd.tp1vergara.entities.Concesionarias;
import utn.frd.tp1vergara.sessions.ConcesionariasFacade;

/**
 *
 * @author Sergio
 */
@Path("/concesionarias")
public class ConcesionariasRest {
    @EJB
    private ConcesionariasFacade ejbConcesionariasFacade;
    
    //obtener todas las entidades
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Concesionarias> findAll(){
        return ejbConcesionariasFacade.findAll();
    }
    
    //crear entidades
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public void create(Concesionarias concesionaria){
        ejbConcesionariasFacade.create(concesionaria);
    }
    
    //actualizar entidades
    @PUT
    @Consumes({MediaType.APPLICATION_JSON})
    @Path("/{id}")
    public void edit(@PathParam("id")long id, Concesionarias concesionaria){
        ejbConcesionariasFacade.edit(concesionaria);
    }
    
    //eliminar entidades
    @DELETE
    @Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN})
    @Path("/{id}")
    public void remove(@PathParam("id")long id){
        ejbConcesionariasFacade.remove( ejbConcesionariasFacade.find(id) );
    }
    
    //obtener una entidad por id
    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Concesionarias findById(@PathParam("id")long id){
        return ejbConcesionariasFacade.find(id);
    }
}
