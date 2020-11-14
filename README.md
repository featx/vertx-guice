# Vert.x Guice Extensions
Enable Verticle dependency injection using Guice.  Deploy your verticle with the `java-guice:` prefix to use the `GuiceVerticleFactory`.

[![Build Status](http://img.shields.io/travis/ef-labs/vertx-guice.svg?maxAge=2592000&style=flat-square)](https://travis-ci.org/ef-labs/vertx-guice)
[![Maven Central](https://img.shields.io/maven-central/v/org.featx.vertx/vertx-guice.svg?maxAge=2592000&style=flat-square)](https://maven-badges.herokuapp.com/maven-central/org.featx.vertx/vertx-guice/)

## License
http://featx.mit-license.org/


## Configuration

Either provide a BootstrapBinder that implements com.google.inject.Module, or via vert.x config, provide a custom class name.

```json
{
    "guice_binder": "my.custom.bootstrap.Binder"
}
```

## Example

```java
package org.featx.vertx.guice;

import org.featx.configuration.ConfigValueManager;
import org.featx.configuration.OtherBinder1;
import org.featx.configuration.OtherBinder2;
import org.featx.configuration.impl.PropertiesConfigValueManager;
import com.google.inject.AbstractModule;

import javax.inject.Singleton;

public class BootstrapBinder extends AbstractModule {

    @Override
    protected void configure() {

        // Configure bindings
        bind(ConfigValueManager.class).to(PropertiesConfigValueManager.class).in(Singleton.class);

        // Install other binders
        install(new OtherBinder1(), new OtherBinder2());

    }

}
```
