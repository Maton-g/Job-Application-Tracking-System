/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ejb.bl;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.entities.Applications;

/**
 *
 * @author mojel
 */
@Stateless
public class ApplicationsFacade extends AbstractFacade<Applications> implements ApplicationsFacadeLocal {

    @PersistenceContext(unitName = "JobApplicationEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ApplicationsFacade() {
        super(Applications.class);
    }

    @Override
    public List<Applications> findApplicationByApplicant(Long applicantID) {
        String queryStr = "SELECT a FROM Application a WHERE a.applicant.id = :id";
        Query query = em.createQuery(queryStr);
        query.setParameter("id", applicantID);
        List<Applications> applications =(List<Applications>) query.getResultList();
        return applications;
    }
    
}
