package com.itdr.controller;

import com.itdr.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/home")
@Controller
public class homeServlet extends HttpServlet {
    @Autowired
    private IndexService indexServiceImpl;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String yx = yx(request, response);
//        System.out.println(yx);
        //request.getRequestDispatcher("/WEB-INF/home.jsp").forward(request,response);
        String ming = request.getParameter("ming");
        String yue = request.getParameter("yue");
        String dong = request.getParameter("dong");
        String jg = indexServiceImpl.jg(ming, yue, dong);
        System.out.println(jg);
        request.setAttribute("name",jg);
        request.getRequestDispatcher("/WEB-INF/yx.jsp").forward(request,response);
    }


//    private void yx(HttpServletRequest request, HttpServletResponse response){
//        String ming = request.getParameter("ming");
//        String yue = request.getParameter("yue");
//        String dong = request.getParameter("dong");
//        String jg = indexServiceImpl.jg(ming, yue, dong);
//        request.setAttribute("name",jg);
////        request.getRequestDispatcher("WEB-INF/yx.jsp");
//    }

}
