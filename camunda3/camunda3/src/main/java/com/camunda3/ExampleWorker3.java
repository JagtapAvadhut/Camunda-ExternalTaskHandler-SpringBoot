package com.camunda3;

import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskHandler;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@ExternalTaskSubscription("ExampleWorker3") // Name of the topic this worker subscribes to
public class ExampleWorker3 implements ExternalTaskHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExampleWorker3.class);

    @Override
    public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {
        // Your business logic here (e.g., processing the task)
        String someBusinessKey = externalTask.getBusinessKey();
        LOGGER.info("calling ExampleWorker3..");
        LOGGER.info("Processing task with business key: {}", someBusinessKey);

        // Once done, complete the task
        externalTaskService.complete(externalTask);
    }
}
