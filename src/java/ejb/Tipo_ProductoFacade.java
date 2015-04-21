/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Tipo_Producto;

/**
 *
 * @author julian.montoyap
 */
@Stateless
public class Tipo_ProductoFacade extends AbstractFacade<Tipo_Producto> {
    @PersistenceContext(unitName = "Lab3fsiPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Tipo_ProductoFacade() {
        super(Tipo_Producto.class);
    }
    
}
