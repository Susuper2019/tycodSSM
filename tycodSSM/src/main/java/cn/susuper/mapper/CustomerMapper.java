package cn.susuper.mapper;

import cn.susuper.pojo.Customer;
import com.github.pagehelper.Page;

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
        //暂时没有用到分页,此方法中page参数为pageHelper中
    Page<Customer> findByPage(Customer customer);
}
