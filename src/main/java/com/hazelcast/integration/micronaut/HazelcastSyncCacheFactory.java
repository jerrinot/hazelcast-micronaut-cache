package com.hazelcast.integration.micronaut;

import com.hazelcast.core.HazelcastInstance;
import io.micronaut.cache.SyncCache;
import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Parameter;
import io.micronaut.context.annotation.Requires;

import javax.inject.Singleton;

//@Requires(beans = HazelcastInstance.class)
@Singleton
@Factory
public class HazelcastSyncCacheFactory {

    public HazelcastSyncCacheFactory() {
        System.out.println("Creating HazelcastSyncCacheFactory factory");
    }

    @Bean
    public HazelcastSyncCache hazelcastSyncCache(HazelcastInstance instance) {
        return new HazelcastSyncCache(name, instance);
    }

//    @Bean
//    public SyncCache hazelcastSyncCache(HazelcastInstance instance) {
//        return new HazelcastSyncCache("default", instance);
//    }
}
