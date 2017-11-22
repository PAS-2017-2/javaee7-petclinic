package org.woehlke.javaee7.petclinic.dao;

import org.woehlke.javaee7.petclinic.entities.Aparelho;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.logging.Logger;

/**
 * 
 * @author marco.mangan@pucrs.br
 *
 */
@Stateless
public class AparelhoDaoImpl implements AparelhoDao {

    private static Logger log = Logger.getLogger(AparelhoDaoImpl.class.getName());

    @PersistenceContext(unitName="javaee7petclinic")
    private EntityManager entityManager;

    @Override
    public void addNew(Aparelho aparelho) {
        log.info("addNewAparelho: "+aparelho.toString());
        entityManager.persist(aparelho);
    }

}
