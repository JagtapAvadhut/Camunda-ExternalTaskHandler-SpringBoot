package com.camunda;

import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.camunda.bpm.client.task.ExternalTaskHandler;
import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@ExternalTaskSubscription("ExampleWorker1") // Name of the topic this worker subscribes to
public class ExampleWorker1 implements ExternalTaskHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExampleWorker1.class);

    @Override
    public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {
        // Your business logic here (e.g., processing the task)
        LOGGER.info("calling ExampleWorker1..");

        String someBusinessKey = externalTask.getBusinessKey();
        LOGGER.info("Processing task with business key: {}", someBusinessKey);

        // Once done, complete the task
        externalTaskService.complete(externalTask);
    }
}
