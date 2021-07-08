package com.smxy.campus_recruit.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.smxy.campus_recruit.util.ResultData;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

/**
 * 登录拦截器
 *
 * @author 范颂扬
 * @create 2020-09-14 13:10
 */
public class LoginInterceptor implements HandlerInterceptor {

    /**
     * 请求方法执行前拦截请求
     */
    /**
     * @description 添加考勤管理员登录拦截
     * @updateTime 2020-12-23 19:59
     * @author 范颂扬
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 获取请求地址
        String servletPath = request.getServletPath();
        // 获取会话
        HttpSession session = request.getSession();
        // 获取对应的登录标志对象
        Object stu = session.getAttribute("userstu");
        Object ep = session.getAttribute("usereq");
        // 创建对应的类
        ObjectMapper mapper = new ObjectMapper();
        String jsonData1 = mapper.writeValueAsString(ResultData.failure().setMessage("未登录"));
        String jsonData2 = mapper.writeValueAsString(ResultData.failure().setMessage("您无权限，进行该操作"));
        String jsonData3 = mapper.writeValueAsString(ResultData.failure().setMessage("未知权限"));
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        if (servletPath.startsWith("/userstu") && stu == null) {
            PrintWriter writer = response.getWriter();
            writer.append(jsonData1);
            writer.close();
            return false;
        }
        else if(servletPath.startsWith("/userep") && ep==null){
            PrintWriter writer = response.getWriter();
            writer.append(jsonData1);
            writer.close();
            return false;
        }
        return true;
    }
}