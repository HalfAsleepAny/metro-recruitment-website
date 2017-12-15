package org.fiberhome.metrorec.web.filter;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.fiberhome.common.support.asyn.AsynTaskExecutor;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * 
 * 监听器，关闭线程池
 * @author mafei
 * @version C01 2017年8月4日
 */
public class ThreadPoolListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        final WebApplicationContext wac = WebApplicationContextUtils.getWebApplicationContext(sce.getServletContext());
        new Thread(new Runnable() {

            @Override
            public void run() {
            }
        }).start();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        AsynTaskExecutor.getIntsance().shutdown();
        System.out.println("线程池关闭");
    }

}
