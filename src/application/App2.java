package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class App2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n---- Test 01: Department insert ----");
        Department dep = new Department();
        dep.setName("Home");
        departmentDao.insert(dep);
        System.out.println("Done! new department id: " + dep.getId());

        System.out.println("\n---- Test 02: Department update ----");
        Department updateDepartment = new Department(4, "Internet");
        departmentDao.update(updateDepartment);
        System.out.println("Done! department updated");

        System.out.println("\n---- Test 03: Department delete ----");
        departmentDao.deleteById(6);
        System.out.println("Done! department deleted");
    }
}
