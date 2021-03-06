/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.controller.AbstractInterface;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.controller.PrioridadFacadeLocal;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.Prioridad;

/**
 *
 * @author joker
 */
@Path("prioridad")
public class PrioridadResource extends AbstractResource<Prioridad> implements FindByName<Prioridad>{
    
    @EJB
    private PrioridadFacadeLocal pfl;

    @Override
    protected AbstractInterface<Prioridad> getFacade() {
        return pfl;
    }

    @Override
    protected Prioridad crearNuevo() {
        return new Prioridad();
    }

    @Override
    public AbstractInterface<Prioridad> getFacadeName() {
        return pfl;
    }
    
    
}
