package com.hazelcast.integration.micronaut.configuration;

import io.micronaut.cache.CacheConfiguration;
import io.micronaut.runtime.ApplicationConfiguration;

/**
 *
 * {@link CacheConfiguration} implementation for Hazelcast caches.
 *
 */
public class HazelcastCacheConfiguration  {
    private final String cacheName;

    protected HazelcastCacheConfiguration(String cacheName, ApplicationConfiguration applicationConfiguration) {
        this.cacheName = cacheName;
    }

    public String getCacheName() {
        return cacheName;
    }
}
