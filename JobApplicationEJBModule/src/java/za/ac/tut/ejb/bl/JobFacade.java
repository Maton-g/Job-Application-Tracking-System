/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ejb.bl;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.entities.Job;

/**
 *
 * @author mojel
 */
@Stateless
public class JobFacade extends AbstractFacade<Job> implements JobFacadeLocal {

    @PersistenceContext(unitName = "JobApplicationEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public JobFacade() {
        super(Job.class);
    }

    @Override
    public void createJob(Job job) {
        create(job);
    }

    @Override
    public List<Job> findAllJobs() {
       return findAll();
    }


}
