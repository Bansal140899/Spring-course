package in.sv.service;

import in.sv.beans.Student;
import in.sv.dao.StudentDao;

public class StudentServiceImp implements StudentService {

	
	private StudentDao stdDao;
	public StudentDao getStdDao() {
		return stdDao;
	}
	public void setStdDao(StudentDao stdDao) {
		this.stdDao = stdDao;
	}
	@Override
	public boolean addstdservice(Student std) {
		
		boolean status = stdDao.addStdDaodetails(std);
		
		return false;
	}
	

}
