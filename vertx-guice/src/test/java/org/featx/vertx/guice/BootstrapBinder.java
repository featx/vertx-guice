package org.featx.vertx.guice;

import com.google.inject.AbstractModule;

/**
 * BootstrapBinder implementation
 */
public class BootstrapBinder extends AbstractModule {
    /**
     * Implement to provide binding definitions using the exposed binding
     * methods.
     */
    @Override
    protected void configure() {
        bind(MyDependency.class).to(DefaultMyDependency.class);
    }
}
