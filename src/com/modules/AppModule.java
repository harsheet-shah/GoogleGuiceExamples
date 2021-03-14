package com.modules;

import com.google.inject.AbstractModule;
import com.google.inject.ScopeAnnotation;
import com.google.inject.Scopes;
import com.guice.annotations.ColorValue;
import com.guice.annotations.EdgeValue;
import com.guice.requests.SquareRequest;
import com.guice.services.DrawShape;
import com.guice.services.DrawSquare;

import javax.inject.Scope;
import javax.inject.Singleton;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        //sometime to instantiate a object there is heaving processing, so is recommended to reuse the object
        bind(DrawShape.class).to(DrawSquare.class);
        //whenever u get a request for drawshape class, give the instance of DrawSquare Class
        bind(String.class).annotatedWith(ColorValue.class).toInstance("Green");
        bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(88);
        bind(SquareRequest.class).in(Scopes.SINGLETON);

    }
}
