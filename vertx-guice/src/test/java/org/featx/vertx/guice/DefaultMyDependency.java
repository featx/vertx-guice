package org.featx.vertx.guice;

import io.vertx.core.Vertx;

import javax.inject.Inject;

public class DefaultMyDependency implements MyDependency {

    @SuppressWarnings("unused")
    private final Vertx vertx;

    @Inject
    public DefaultMyDependency(Vertx vertx) {
        this.vertx = vertx;
    }

}
