package com.nttdata.aws.lambda;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

import java.util.function.Supplier;

public class HelloWorld implements Supplier{
    @Override
    public Object get() {
        return "hello world !";
    }
}
