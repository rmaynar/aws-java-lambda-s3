package com.maynar;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.s3.event.S3EventNotification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Handler for requests to Lambda function.
 */
public class App implements RequestHandler<S3EventNotification, String> {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    @Override
    public String handleRequest(S3EventNotification s3EventNotification, Context context) {
        LOGGER.info("Lambda triggered by S3 - " + s3EventNotification.toJson());
        return null;
    }
}
