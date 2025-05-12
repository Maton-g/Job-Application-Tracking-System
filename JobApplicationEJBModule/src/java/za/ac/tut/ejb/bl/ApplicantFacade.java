/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ejb.bl;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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
    
}
