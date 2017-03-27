package com.njhy.ts.util;

import java.io.Serializable;
import java.util.List;

/**
 * <分页工具>
 * <功能详细描述>
 * 
 * @author 崔译
 * @version [V1.00, 2012-11-6]
 * @see [相关类/方法]
 * @since V1.00
 */
public class PageResults<T> implements Serializable
{
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    // 下一页的页数
    private int pageNo;
    
    // 当前页的页数
    private int currentPage;
    
    // 每页多少条
    private int pageSize;
    
    // 一共多少条数据
    private int totalCount;
    
    // 一共多少页
    private int pageCount;
    
    // 查出的结果集
    private List<T> results;
    
    public int getPageCount()
    {
        return pageCount;
    }
    
    public void setPageCount(int pageCount)
    {
        this.pageCount = pageCount;
    }
    
    public int getPageNo()
    {
        return pageNo;
    }
    
    public void setPageNo(int pageNo)
    {
        this.pageNo = pageNo;
    }
    
    public List<T> getResults()
    {
        return results;
    }
    
    public void setResults(List<T> results)
    {
//    	List<Users> userList = ....
        this.results = results;
    }
    
    public int getCurrentPage()
    {
        return currentPage;
    }
    
    public void setCurrentPage(int currentPage)
    {
        this.currentPage = currentPage;
    }
    
    public int getPageSize()
    {
        return pageSize;
    }
    
    public void setPageSize(int pageSize)
    {
        this.pageSize = pageSize == 0 ? 10 : pageSize;
    }
    
    public int getTotalCount()
    {
        return totalCount;
    }
    
    public void setTotalCount(int totalCount)
    {
        this.totalCount = totalCount;
    }
    
    public void resetPageNo()
    {
        pageNo = currentPage + 1;
        pageCount = totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1;
    }
    
}
