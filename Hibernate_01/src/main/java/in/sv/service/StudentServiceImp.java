package in.sv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sv.beans.Studentt;
import in.sv.dao.StudentDao;

@Service
public class StudentServiceImp implements StudentService {

	@Autowired
	private StudentDao stdDao;
	public StudentDao getStdDao() {
		return stdDao;
	}
	public void setStdDao(StudentDao stdDao) {
		this.stdDao = stdDao;
	}
	@Override
	public boolean addstdservice(Studentt std) {
		
		boolean status = stdDao.addStdDaodetails(std);
		
		return status;
	}
	

}
