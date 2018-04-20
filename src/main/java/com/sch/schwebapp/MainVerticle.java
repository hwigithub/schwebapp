package com.sch.schwebapp;

import io.vertx.core.AbstractVerticle;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.StaticHandler;

public class MainVerticle extends AbstractVerticle {

    @Override
    public void start() throws Exception {
        Router router = Router.router(vertx);

        router.route("/app/*").handler(StaticHandler.create().setCachingEnabled(false).setWebRoot("frontend"));

        vertx.createHttpServer().requestHandler(router::accept).listen(8080);

        System.out.println("HTTP server started on port 8080");
    }
}
