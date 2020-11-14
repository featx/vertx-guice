package org.featx.vertx.guice.integration;

import io.vertx.core.AbstractVerticle;

import javax.inject.Inject;

import org.featx.vertx.guice.MyDependency2;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Verticle with dependencies injected
 */
public class DependencyInjectionVerticle2 extends AbstractVerticle {

    @SuppressWarnings("unused")
    private final MyDependency2 myDependency;

    @Inject
    public DependencyInjectionVerticle2(MyDependency2 myDependency) {
        this.myDependency = myDependency;
        assertNotNull(myDependency);
    }

}
