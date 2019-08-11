package cn.susuper.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @Author susuper
 * @Date 2019/8/11 17:13
 * @description:
 */
public class PageBean<T> implements Serializable {
    //当前页
    private int pageCode;
    //总页数
    private int totalPage;
    //总记录数
    private int totalCount;
    //每页最大长度
    private int pageSize;
    //开始页
    //结束页
    //每页显示的数据
    private List<T> beanList;

    public PageBean() {
    }

    public PageBean(int pageCode, int totalPage, int totalCount, int pageSize, List<T> beanList) {
        this.pageCode = pageCode;
        this.totalPage = totalPage;
        this.totalCount = totalCount;
        this.pageSize = pageSize;
        this.beanList = beanList;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "pageCode=" + pageCode +
                ", totalPage=" + totalPage +
                ", totalCount=" + totalCount +
                ", pageSize=" + pageSize +
                ", beanList=" + beanList +
                '}';
    }

    public int getPageCode() {
        return pageCode;
    }

    public void setPageCode(int pageCode) {
        this.pageCode = pageCode;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getBeanList() {
        return beanList;
    }

    public void setBeanList(List<T> beanList) {
        this.beanList = beanList;
    }
}
