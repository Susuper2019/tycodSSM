package cn.susuper.mapper;

import cn.susuper.pojo.Customer;

/**
 * @Author susuper
 * @Date 2019/8/10 18:11
 * @description:
 */
public interface CustomerMapper {
    void create(Customer customer);
    void delete(Long id);
    Customer findById(Long id);
    void update(Customer customer);
        //暂时没有用到分页
//    Page<Customer> findByPage(Customer customer);
}
