package org.featx.vertx.guice;

import com.google.inject.Injector;
import io.vertx.core.Verticle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

/**
 * Unit tests for {@link GuiceVerticleFactory}
 */
@ExtendWith(MockitoExtension.class)
public class GuiceVerticleFactoryTest {

    private GuiceVerticleFactory factory;

    @BeforeEach
    public void setUp() throws Exception {
        factory = new GuiceVerticleFactory();
    }

    @Test
    public void testPrefix() {
        assertEquals(GuiceVerticleFactory.PREFIX, factory.prefix());
    }

    @Test
    public void testCreateVerticle() throws Exception {
        String identifier = GuiceVerticleFactory.PREFIX + ":" + TestGuiceVerticle.class.getName();
        Verticle verticle = factory.createVerticle(identifier, this.getClass().getClassLoader());
        assertTrue(verticle instanceof GuiceVerticleLoader);

        GuiceVerticleLoader loader = (GuiceVerticleLoader) verticle;
        assertEquals(TestGuiceVerticle.class.getName(), loader.getVerticleName());
    }

    @Test
    public void testSetInjector() throws Exception {

        assertNull(factory.getInjector());

        Injector injector = mock(Injector.class);
        factory.setInjector(injector);

        assertEquals(injector, factory.getInjector());

    }

}
