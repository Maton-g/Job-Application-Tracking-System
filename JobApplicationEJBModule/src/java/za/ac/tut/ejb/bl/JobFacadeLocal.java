/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.tut.ejb.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.Job;

/**
 *
 * @author mojel
 */
@Local
public interface JobFacadeLocal {

    void create(Job job);

    void edit(Job job);

    void remove(Job job);

    Job find(Object id);

    List<Job> findAll();

    List<Job> findRange(int[] range);

    int count();
    
}
