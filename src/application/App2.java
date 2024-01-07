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
    }
}
