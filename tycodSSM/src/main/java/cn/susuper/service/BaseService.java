package cn.susuper.service;

import java.util.List;

/**
 * @author susuper
 * @date 2019/8/8 18:04
 */
public interface BaseService<T> {
    List<T> findAll();
    T findById(Long id);
    void create(T t);
    void delete(Long id);

    /**
     * 修改
     *
     * @param t
     */
    void update(T t);
}
