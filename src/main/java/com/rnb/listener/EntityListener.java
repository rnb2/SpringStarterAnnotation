package com.rnb.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EntityListener {

    @EventListener(condition = "#p0.accessType.name == 'READ'")
    public void accept(EntityEvent event) {
        System.out.println("event: " + event.getAccessType() + ", source " + event.getSource());
    }

}
