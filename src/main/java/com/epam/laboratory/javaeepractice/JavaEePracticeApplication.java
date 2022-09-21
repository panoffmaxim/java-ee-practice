package com.epam.laboratory.javaeepractice;

import com.epam.laboratory.javaeepractice.bottomup.service.RandomApiServiceImpl;
import com.epam.laboratory.javaeepractice.servlet.HelloWorldServlet;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.http.HttpServlet;
import javax.xml.ws.Endpoint;
import java.io.File;

public class JavaEePracticeApplication {
    public static void main(String[] args) throws LifecycleException {
        int port = 8080;
        Tomcat tomcat = new Tomcat();
        tomcat.setBaseDir("temp");
        tomcat.setPort(port);

        String contextPath = "/";
        String docBase = new File(".").getAbsolutePath();

        Context context = tomcat.addContext(contextPath, docBase);

        HttpServlet servlet = new HelloWorldServlet();
        String servletName = "HelloWorld";
        String urlPattern = "/hello";

        tomcat.addServlet(contextPath, servletName, servlet);
        context.addServletMappingDecoded(urlPattern, servletName);

        Endpoint.publish("http://localhost:8088/random", new RandomApiServiceImpl());

        tomcat.start();
        tomcat.getServer().await();
    }
}
