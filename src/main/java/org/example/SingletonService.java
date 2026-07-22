package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class SingletonService {

    private final String instanceId = "Singleton-" + System.identityHashCode(this);

    public String getInstanceId() {
        return instanceId;
    }

    public void doWork() {
        System.out.println("SingletonService [" + instanceId + "] doing work");
    }
}