package no.ovstetun;

import org.mortbay.jetty.Connector;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.nio.SelectChannelConnector;
import org.mortbay.jetty.webapp.WebAppContext;

public final class JettyStarter {

    private JettyStarter() {
    }

    @SuppressWarnings({ "unchecked" })
    public static void main(final String[] args) throws Exception {
        Server server = new Server(8080);

        final WebAppContext context = new WebAppContext();
        context.setContextPath("/rectag");
        context.setWar("src/main/webapp");

        server.addHandler(context);
        server.start();
        server.join();
    }
}
