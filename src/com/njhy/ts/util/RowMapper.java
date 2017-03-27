package com.njhy.ts.util;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author 贲辉
 * @version [V1.00, 2012-11-6]
 * @see [相关类/方法]
 * @since V1.00
 */
public interface RowMapper
{
    public Object mapRow(ResultSet rs, int index)
        throws SQLException;
}
