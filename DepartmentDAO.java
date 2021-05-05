package com.dept.dao;

import java.util.List;

//POJO interface to expose CRUD methods
public interface DepartmentDAO {
	void addDepartment(Department dRef);		//	C - add - insert
	Department findDepartment(int dno);			//  R - find - select
	List<Department> findDepartments();			//  R - find - select all
	void modifyDepartment(Department dRef);		//  U - modify - update
	void removeDepartment(Department dRef);  
}
