package com.controller;

        import com.pojo.Books;
        import com.service.BooksServiceImp;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.beans.factory.annotation.Qualifier;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.RequestMapping;

        import javax.servlet.jsp.PageContext;
        import java.util.ArrayList;
        import java.util.List;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-07-07 16:44
 */
@Controller
@RequestMapping("/book")
public class BooksController {

    @Autowired
    @Qualifier("booksServiceImp")
    private BooksServiceImp booksServiceImp;

    /**
     * 展示所有的书籍
     * @param model
     * @return 返回所有书籍的列表
     */
    @RequestMapping("/allBook")
    public String listAllBook(Model model) {
        List<Books> books = booksServiceImp.queryAllData();
        model.addAttribute("list", books);

        return "allBook";
    }

    /**
     * 跳转到添加书籍的页面
     * @return
     */
    @RequestMapping("/toAddPaper")
    public String toAddBook(){
        return "addBook";
    }

    /**
     * 添加书籍到数据库
     * @param books
     * @return
     */
    @RequestMapping("/addBook")
    public String addBook(Books books){
//        System.out.println("book=>" + books);
        booksServiceImp.insertData(books);
        return "redirect:/book/allBook";//重定向到/allBook请求,重定向可以避免重复提交数据
    }

    /**
     * 跳转到修改书籍的页面
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/toUpdatePaper")
    public String toUpdateBook(int id,Model model) {
        Books books = booksServiceImp.queryDataById(id);
        model.addAttribute("QBook", books);
        return "updateBook";
    }

    /**
     * 修改书籍到数据库
     * @param books
     * @return
     */
    @RequestMapping("/updateBook")
    public String updateBook(Books books) {
//        System.out.println("book=>" + books);
        booksServiceImp.updateData(books);
        return "redirect:/book/allBook";//重定向到/allBook请求,重定向可以避免重复提交数据
    }

    /**
     * 从数据库依据Id删除指定书籍
     * @param id
     * @return
     */
    @RequestMapping("/deleteBook")
    public String deleteBook(int id) {
        booksServiceImp.deleteDataById(id);
        return "redirect:/book/allBook";
    }

    /**
     * 根据书名查询书籍信息
     * @param bookName
     * @param model
     * @return
     */
    @RequestMapping("/queryBookByName")
    public String queryBookByName(String bookName,Model model) {
        //如果没有输入字符串,代表用户只点了查询,则重定向到查询所有书籍
        if (bookName.length() <= 0) {
            return "redirect:/book/allBook";
        }
        List<Books> books = booksServiceImp.queryDataByName(bookName);
        model.addAttribute("list", books);
        return "allBook";
    }
}
