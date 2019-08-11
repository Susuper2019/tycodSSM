package cn.susuper.service.impl;

import cn.susuper.mapper.CustomerMapper;
import cn.susuper.pojo.Customer;
import cn.susuper.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author susuper
 * @Date 2019/8/10 22:36
 * @description:
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public Customer findById(Long id) {
        return  customerMapper.findById(id);
    }

    @Override
    public void create(Customer customer) {
        customerMapper.create(customer);
    }

    @Override
    public void delete(Long id) {
        customerMapper.delete(id);
    }

    @Override
    public void update(Customer customer) {
        customerMapper.update(customer);
    }
}
