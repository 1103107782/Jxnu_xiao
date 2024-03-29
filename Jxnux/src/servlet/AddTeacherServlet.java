package servlet;

import database.DatabaseCon;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AddTeacherServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String gh = request.getParameter("gh");
        String xm = request.getParameter("xm");
        String xb = request.getParameter("xb");
        String csrq = request.getParameter("csrq");
        String xl = request.getParameter("xl");
        String jbgz = request.getParameter("jbgz");
        String yxh = request.getParameter("yxh");
        String pwd = request.getParameter("pwd");
     /*   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//小写的mm表示的是分钟
        java.util.Date date = null;
        try {
            date = sdf.parse(String.valueOf(csrq));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());*/
        PreparedStatement statement;
        try {
            DatabaseCon databaseCon = new DatabaseCon();
            Connection connection = databaseCon.getConnection();
            statement = connection.prepareStatement("insert into T(gh,xm,xb,csrq,xl,jbgz,yxh,pwd) VALUES(?,?,?,?,?,?,?,?)");
            statement.setString(1, gh);
            statement.setString(2, xm);
            statement.setString(3, xb);
            statement.setString(4, csrq);
            statement.setString(5, xl);
            statement.setString(6, jbgz);
            statement.setString(7, yxh);
            statement.setString(8, pwd);
            statement.executeUpdate();
            databaseCon.closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        response.sendRedirect("FindTeacher");


    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
