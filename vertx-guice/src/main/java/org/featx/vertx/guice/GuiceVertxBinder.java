package org.featx.vertx.guice;

import com.google.inject.AbstractModule;
import io.vertx.core.Vertx;

/**
 * Guice {@link AbstractModule} for vertx and container injections
 */
public class GuiceVertxBinder extends AbstractModule {

    private final Vertx vertx;

    public GuiceVertxBinder(Vertx vertx) {
        this.vertx = vertx;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void configure() {
        bind(Vertx.class).toInstance(vertx);
    }
}
