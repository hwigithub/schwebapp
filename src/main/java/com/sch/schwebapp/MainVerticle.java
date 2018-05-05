package com.sch.schwebapp;

import io.vertx.core.AbstractVerticle;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.StaticHandler;

import java.util.logging.Logger;

public class MainVerticle extends AbstractVerticle {

    private static Logger log = Logger.getLogger(MainVerticle.class.getName());

    @Override
    public void start() {

        int port = 8080;
        try {
            if (System.getenv("PORT") != null)  port = Integer.parseInt(System.getenv("PORT"));
        } catch (NullPointerException e) {
            log.info("Issue with setting the port");
        }

        Router router = Router.router(vertx);
        router.route("/*").handler(StaticHandler.create().setCachingEnabled(false));
        router.route("/dist/*").handler(StaticHandler.create().setCachingEnabled(false));

        vertx.createHttpServer().requestHandler(router::accept).listen(port);

        System.out.println("HTTP server started on port: " + port);
    }
}
