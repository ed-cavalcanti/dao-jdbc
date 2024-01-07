package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        SellerDao sellereDao = DaoFactory.createSellerDAO();

        System.out.println();

        System.out.println("--- Test 01: Seller findById ---");
        Seller seller = sellereDao.findById(3);

        System.out.println(seller);
    }
}
