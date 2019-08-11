package cn.susuper.service.impl;

import cn.susuper.mapper.CustomerMapper;
import cn.susuper.pojo.Customer;
import cn.susuper.pojo.PageBean;
import cn.susuper.service.CustomerService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
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

    /**
     * 分页查询-条件查询方法
     * @param customer
     * @param pageCode
     * @param pageSize
     * @return
     */
    public PageBean findByPage(Customer customer,int pageCode,int pageSize){
        //使用mybatis中配置的分页查询插件
        PageHelper.startPage(pageCode,pageSize);
        //调用分页查询方法，其实就是查询所有的数据，mybatis自动帮我们进行分页计算
        Page<Customer> page = customerMapper.findByPage(customer);
//        return new PageBean(pageCode,(int)Math.ceil((double)(page.getTotal()/(double)pageSize)),(int)page.getTotal(),pageSize,page.getResult());
        return new PageBean(pageCode, (int)Math.ceil((double)(page.getTotal() / (double)pageSize)), (int)page.getTotal(), pageSize, page.getResult());
    }
}
