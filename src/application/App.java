package application;

import java.util.Date;
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

        System.out.println("\n---- Test 03: Seller findAll ----");
        sellers = sellereDao.findAll();
        for (Seller obj : sellers) {
            System.out.println(obj);
        }

        System.out.println("\n---- Test 04: Seller insert ----");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 3000.0, department);
        sellereDao.insert(newSeller);
        System.out.println("Inserted new id = " + newSeller.getId());

        System.out.println("\n---- Test 05: Seller update ----");
        seller = sellereDao.findById(1);
        seller.setName("Martha Wayne");
        sellereDao.update(seller);
        System.out.println("Update completed");
    }
}
