/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.controller;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.Parte;

/**
 *
 * @author joker
 */
@Stateless
public class ParteFacade extends AbstractFacade<Parte> implements ParteFacadeLocal {

    @PersistenceContext(unitName = "mantPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public void setEm(EntityManager em) {
        this.em = em;
    }

    public ParteFacade() {
        super(Parte.class, "Parte.findByNombreLike");
    }
    
}
