package com.pluralsight.service;
import java.util.List;
import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRespository;
//import com.pluralsight.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

//    private CustomerRespository customerRespository = new HibernateCustomerRepositoryImpl();

    private CustomerRespository customerRespository;

    public CustomerServiceImpl() {

    }

    public CustomerServiceImpl(CustomerRespository customerRespository) {
        this.customerRespository = customerRespository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRespository.findAll();
    }

    public void setCustomerRespository(CustomerRespository customerRespository) {
        this.customerRespository = customerRespository;
    }


}
