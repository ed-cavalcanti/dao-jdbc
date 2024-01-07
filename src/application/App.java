package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        SellerDao sellereDao = DaoFactory.createSellerDAO();

        Seller seller = sellereDao.findById(3);

        System.out.println(seller);
    }
}
