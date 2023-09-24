package org.tms.lessons23;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add")
public class AddBookServlet extends HttpServlet {
    private final Database database = new Database();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String author = req.getParameter("author");
        String title = req.getParameter("title");
        String category = req.getParameter("category");

        Book book = new Book();
        book.setAuthor(author);
        book.setTitle(title);
        book.setCategory(category);

        database.addBook(book);
        req.getRequestDispatcher("/home").forward(req,resp);
    }
}
