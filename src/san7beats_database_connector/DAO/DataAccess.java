/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package san7beats_database_connector.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import san7beats_database_connector.Entity.SoundcloudLinks;
import san7beats_database_connector.Handler.EntityManagerFactoryHandler;

/**
 *
 * @author Sango
 */
public class DataAccess {
    
    public void persist(String code) {
        SoundcloudLinks newCode = new SoundcloudLinks();
        newCode.setCode(code);
        EntityManager em = EntityManagerFactoryHandler.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        em.persist(newCode);
        em.getTransaction().commit();
        em.clear();
        em.close();
    }  
    public List<SoundcloudLinks> findAll() {
        EntityManager em = EntityManagerFactoryHandler.getEntityManagerFactory().createEntityManager();
        List<SoundcloudLinks> codes = em.createNamedQuery("SoundcloudLinks.findAll").getResultList();
        return codes;
    }
}
