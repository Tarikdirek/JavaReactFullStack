package oopWithNLayerApp;

import oopWithNLayerApp.business.ProductManager;
import oopWithNLayerApp.core.logging.DatabaseLogger;
import oopWithNLayerApp.core.logging.FileLogger;
import oopWithNLayerApp.core.logging.Logger;
import oopWithNLayerApp.core.logging.MailLogger;
import oopWithNLayerApp.dataAccess.HibernateProductDao;
import oopWithNLayerApp.dataAccess.JdbsProductDao;
import oopWithNLayerApp.entities.Product;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1,"Iphone XR",10);

        List<Logger> loggers = Arrays.asList(new DatabaseLogger(),new FileLogger(),new MailLogger());

        ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
        productManager.add(product1);
    }
}