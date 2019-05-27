package com.hazelcast.integration.micronaut;

import io.micronaut.cache.SyncCache;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
public class MyBean {
    @Inject
    @Named("foo")
    private SyncCache cache;

    public void foo() {
        System.out.println(cache);
    }
}
