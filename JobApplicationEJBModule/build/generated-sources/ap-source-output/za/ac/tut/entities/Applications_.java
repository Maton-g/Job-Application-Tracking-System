package za.ac.tut.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.ac.tut.entities.Applicant;
import za.ac.tut.entities.Job;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2025-05-12T13:06:58")
@StaticMetamodel(Applications.class)
public class Applications_ { 

    public static volatile SingularAttribute<Applications, Long> id;
    public static volatile SingularAttribute<Applications, Job> job;
    public static volatile SingularAttribute<Applications, Applicant> applicant;
    public static volatile SingularAttribute<Applications, String> status;

}