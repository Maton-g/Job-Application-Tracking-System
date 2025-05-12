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

    void createApplicant(Applicant applicant);

    void edit(Applicant applicant);

    void removeApplicant(Applicant applicant);

    Applicant find(Object id);

    List<Applicant> findAllApplicants();

    List<Applicant> findRange(int[] range);

    Applicant checkLoginDetails(String email, String password);
    int count();
    
}
