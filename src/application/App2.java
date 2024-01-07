package application;

import java.util.List;

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

        System.out.println("\n---- Test 04: Department findById ----");
        dep = departmentDao.findById(1);
        System.out.println(dep);

        System.out.println("\n---- Test 05: Department findAll ----");
        List<Department> departments = departmentDao.findAll();
        for (Department depart : departments) {
            System.out.println(depart);
        }
    }
}
