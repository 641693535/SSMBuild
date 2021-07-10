package com.service;

import com.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-07-07 13:25
 */
public interface BooksService {
    //增加
    int insertData(Books books);

    //删除
    int deleteDataById(@Param("bookID") int id);

    //修改
    int updateData(Books books);

    //查询
    Books queryDataById(@Param("bookID") int id);

    //通过Name查询
    List<Books> queryDataByName(@Param("bookName") String name);

    //查询所有数据
    List<Books> queryAllData();

}
