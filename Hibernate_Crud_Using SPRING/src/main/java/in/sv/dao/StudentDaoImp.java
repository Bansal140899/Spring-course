package in.sv.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import in.sv.beans.Empl;
//import jakarta.transaction.Transactional;
import org.springframework.transaction.annotation.Transactional;

public class StudentDaoImp implements StudentDao {

    private HibernateTemplate hibernateTemplate;

    
    @Transactional
    public void addEmpDetails(Empl emp) {

        hibernateTemplate.save(emp);   // Save employee object into database
        System.out.println("Employee data inserted successfully");

    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
