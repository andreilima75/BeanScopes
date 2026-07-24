package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeService {

    private final String instanceId = "Prototype-" + System.identityHashCode(this);

    public String getInstanceId() {
        return instanceId;
    }

    public void doWork() {
        System.out.println("PrototypeService [" + instanceId + "] doing work");
    }
}