package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        SellerDao sellereDao = DaoFactory.createSellerDAO();

        System.out.println("\n---- Test 01: Seller findById ----");
        Seller seller = sellereDao.findById(3);
        System.out.println(seller);

        System.out.println("\n---- Test 02: Seller findByDepartment ----");
        Department department = new Department(1, null);
        List<Seller> sellers = sellereDao.findByDepartment(department);
        for (Seller obj : sellers) {
            System.out.println(obj);
        }
    }
}
