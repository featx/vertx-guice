package org.featx.vertx.guice;

import io.vertx.core.AbstractVerticle;

import javax.inject.Inject;

public class TestGuiceVerticle extends AbstractVerticle {

    private final MyDependency dependency;

    @Inject
    public TestGuiceVerticle(MyDependency dependency) {
        this.dependency = dependency;
    }

}
