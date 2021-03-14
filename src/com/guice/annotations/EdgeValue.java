package com.guice.annotations;

import com.google.inject.BindingAnnotation;
import lombok.Value;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

@BindingAnnotation
//@Target({Parameter, Field, Method}) @Retention(Runtime);
@Target({ElementType.PARAMETER,ElementType.FIELD,ElementType.METHOD}) @Retention(RetentionPolicy.RUNTIME)
public @interface EdgeValue {
}
