package org.featx.vertx.guice.integration;

import com.google.inject.AbstractModule;
import com.google.inject.Binder;

/**
 * NOP binder
 */
public class NOPBinder extends AbstractModule {
    /**
     * Configures a {@link Binder} via the exposed methods.
     */
    @Override
    protected void configure() {
    }
}
