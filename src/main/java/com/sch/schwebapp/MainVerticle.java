package com.sch.schwebapp;

import io.vertx.core.AbstractVerticle;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.StaticHandler;

public class MainVerticle extends AbstractVerticle {

    @Override
    public void start() throws Exception {

        int port =  (System.getenv("PORT").isEmpty()) ? 8080 : Integer.parseInt(System.getenv("PORT"));


        Router router = Router.router(vertx);
        router.route("/*").handler(StaticHandler.create().setCachingEnabled(false));
        router.route("/dist/*").handler(StaticHandler.create().setCachingEnabled(false));

        vertx.createHttpServer().requestHandler(router::accept).listen(port);

        System.out.println("HTTP server started on port 8080");
    }
}
