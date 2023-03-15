package com.wrp.week2.demo;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
public class HelloWorldServlet extends HttpServlet{
    public void doGet(HttpServletRequest request,HttpServletResponse response)
            throws IOException {
        //when client request method is Get - here - inside doGet()
        PrintWriter writer =response.getWriter();
        writer.println("Hello Client!!!");
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response){
        //when client request method is Post - here - inside doPost()
    }
}
