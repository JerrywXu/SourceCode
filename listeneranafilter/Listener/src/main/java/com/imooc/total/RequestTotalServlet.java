package com.imooc.total;

import com.alibaba.fastjson.JSON;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/rt")
public class RequestTotalServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         ServletContext context = request.getServletContext();
         List<String> timeList = (List) context.getAttribute("timeList");
         List<Integer> valueList = (List)context.getAttribute("valueList");
         response.setContentType("text/html;charset=utf-8");
        /* response.getWriter().println(timeList.toString());
         response.getWriter().println("<br/>");
         response.getWriter().println("1234565");
         response.getWriter().println(valueList.toString());*/

        Map result = new HashMap();
        result.put("timeList",timeList);
        result.put("valueList",valueList);
        String json = JSON.toJSONString(result);
        response.getWriter().println(json);



    }
}
