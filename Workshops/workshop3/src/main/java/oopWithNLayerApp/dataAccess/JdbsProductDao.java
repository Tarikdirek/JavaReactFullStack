package oopWithNLayerApp.dataAccess;

import oopWithNLayerApp.entities.Product;

public class JdbsProductDao implements ProductDao {
    public void add(Product product){
        System.out.println("JDBS ile veritabanına eklendi");
    }
}
