package cn.susuper.service;

import cn.susuper.pojo.Customer;
import cn.susuper.pojo.PageBean;

/**
 * @Author susuper
 * @Date 2019/8/10 22:35
 * @description:
 */
public interface CustomerService extends BaseService<Customer> {
    //一个分页查询，其余方法在baseservice中已经写好
    public PageBean findByPage(Customer customer, int pageCode, int pageSize);
}
