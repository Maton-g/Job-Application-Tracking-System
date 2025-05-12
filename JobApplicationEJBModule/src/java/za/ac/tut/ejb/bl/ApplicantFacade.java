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
import za.ac.tut.entities.Applicant;

/**
 *
 * @author mojel
 */
@Stateless
public class ApplicantFacade extends AbstractFacade<Applicant> implements ApplicantFacadeLocal {

    @PersistenceContext(unitName = "JobApplicationEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ApplicantFacade() {
        super(Applicant.class);
    }

    @Override
    public void createApplicant(Applicant applicant) {
        create(applicant);
    }

    @Override
    public void removeApplicant(Applicant applicant) {
        remove(applicant);
    }

    @Override
    public List<Applicant> findAllApplicants() {
        List<Applicant> applicants = findAll();
        return applicants;
    }

    @Override
    public Applicant checkLoginDetails(String email, String password) {
        String queryStr = "SELECT u FROM User u WHERE u.email = :email AND u.password = :password";
        Query query = em.createNamedQuery(queryStr);
        query.setParameter("email", email);
        query.setParameter("password", password);
        Applicant user = (Applicant)query.getSingleResult();
        
        return user;
    }
    
}
