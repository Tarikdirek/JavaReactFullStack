package oop1;


public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("Deloghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitInStock(15);
        product1.setImageUrl("deloghicoffemachine.jpg");


        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(6500);
        product2.setDiscount(2);
        product2.setUnitInStock(11);
        product2.setImageUrl("smegcoffemachine.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(4500);
        product3.setDiscount(9);
        product3.setUnitInStock(12);
        product3.setImageUrl("kitchenaidcoffemachine.jpg");

        //System.out.println(product1.name);

        Product[] products = {product1, product2, product3};
        for (Product product : products) {
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNum("644645465464");
        individualCustomer.setPhone("053546645644");
        individualCustomer.setFirstName("Tarık");
        individualCustomer.setLastName("Direk");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("053333333");
        corporateCustomer.setTaxNumber("135646458");
        corporateCustomer.setCustomerNum("12346");

        System.out.println();

        Customer[] customers = {individualCustomer,corporateCustomer};
        for (Customer customer:customers) {
            System.out.println(customer.getId());
        }
    }
}
