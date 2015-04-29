package com.squareup.otto;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Anotation to instruct {@link AnnotatedHandlerFinder} to recurse into class parent when
 * looking for Subscribers and Producers.
 *
 * @author Kamil Wisniewski
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface InheritSubscribers {
}
