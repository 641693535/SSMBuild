package com.service;

import com.dao.BooksMapper;
import com.pojo.Books;

import java.util.List;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-07-07 13:25
 */
public class BooksServiceImp implements BooksService {

    private BooksMapper booksMapper;

    public void setBooksMapper(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }

    @Override
    public int insertData(Books books) {
        return booksMapper.insertData(books);
    }

    @Override
    public int deleteDataById(int id) {
        return booksMapper.deleteDataById(id);
    }

    @Override
    public int updateData(Books books) {
        return booksMapper.updateData(books);
    }

    @Override
    public Books queryDataById(int id) {
        return booksMapper.queryDataById(id);
    }

    @Override
    public List<Books> queryDataByName(String name) {
        return booksMapper.queryDataByName(name);
    }

    @Override
    public List<Books> queryAllData() {
        return booksMapper.queryAllData();
    }
}
