/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.tut.ejb.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.Applications;

/**
 *
 * @author mojel
 */
@Local
public interface ApplicationsFacadeLocal {

    void create(Applications applications);

    void edit(Applications applications);

    void remove(Applications applications);

    Applications find(Object id);

    List<Applications> findAll();

    List<Applications> findRange(int[] range);

    int count();
    
    List<Applications> findApplicationByApplicant(Long applicantID);
    
}
