package com.yunhui;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.NetworkTrafficServerConnector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class Main {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        Connector connector = new NetworkTrafficServerConnector(server);
        server.addConnector(connector);
        String[] strs = Main.class.getResource("").getPath().split("springmvc");

        WebAppContext context = new WebAppContext(strs[0] + "/springmvc/web", "");

        context.setClassLoader(Thread.currentThread().getContextClassLoader());
        context.setConfigurationClasses(new String[]{
                "org.eclipse.jetty.webapp.WebInfConfiguration",
                "org.eclipse.jetty.plus.webapp.EnvConfiguration",
                "org.eclipse.jetty.plus.webapp.PlusConfiguration",
                "org.eclipse.jetty.webapp.WebXmlConfiguration"});
        server.setHandler(context);
        server.setStopAtShutdown(true);
        server.start();
        server.join();

    }
}
