package org.featx.vertx.guice.integration;

import org.featx.vertx.guice.DefaultMyDependency;
import org.featx.vertx.guice.MyDependency;
import com.google.inject.AbstractModule;

/**
 * Custom Guice binder
 */
public class CustomBinder extends AbstractModule {
    @Override
    protected void configure() {
        bind(MyDependency.class).to(DefaultMyDependency.class);
    }
}
