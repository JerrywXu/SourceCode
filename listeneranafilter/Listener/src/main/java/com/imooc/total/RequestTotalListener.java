package com.imooc.total;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RequestTotalListener implements ServletContextListener, ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {

    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
       HttpServletRequest request = (HttpServletRequest)sre.getServletRequest();
       String url = request.getRequestURL().toString();
       if(url.endsWith("/rt") == true)//排除rt这个url
       {
           return;
       }

        //timeList:  10:02  10:03  10:04
        //valueList:  5       7      10
       List<String> timeList=(List)sre.getServletContext().getAttribute("timeList");
       List<Integer> valueList=(List)sre.getServletContext().getAttribute("valueList");
       Date date=new Date();
       SimpleDateFormat sdf=new SimpleDateFormat("HH:mm");
       String time = sdf.format(date);

       if(timeList.indexOf(time) == -1) {  //==-1证明时间在当前集合中不存在，如果时间不存在，则进行新增操作
           timeList.add(time);//
           valueList.add(1);//arraylist可以重复
           sre.getServletContext().setAttribute("timeList",timeList);
           sre.getServletContext().setAttribute("valueList",valueList);

       }else{//否则在原来的时间上加一
           int index = timeList.indexOf(time);
           int value = valueList.get(index);
           valueList.set(index,value+1);
           sre.getServletContext().setAttribute("valueList",valueList);
       }

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        List timeList = new ArrayList();
        List valueList = new ArrayList();

        sce.getServletContext().setAttribute("timeList",timeList);
        sce.getServletContext().setAttribute("valueList",valueList);
        System.out.println("请求分析统计已经初始化");

    }

}
