/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.tut.ejb.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.Applicant;

/**
 *
 * @author mojel
 */
@Local
public interface ApplicantFacadeLocal {

    void create(Applicant applicant);

    void edit(Applicant applicant);

    void remove(Applicant applicant);

    Applicant find(Object id);

    List<Applicant> findAll();

    List<Applicant> findRange(int[] range);

    int count();
    
}
