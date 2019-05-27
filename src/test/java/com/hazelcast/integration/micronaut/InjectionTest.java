package com.hazelcast.integration.micronaut;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.Micronaut;
import org.junit.Test;

public class InjectionTest {
    @Test
    public void foo() {
        ApplicationContext run = Micronaut.run(InjectionTest.class);
        MyBean bean = run.getBean(MyBean.class);

        bean.foo();
    }
}
