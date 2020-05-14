package org.enlighted.users.lambda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.amazon.lambda.test.LambdaClient;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class LambdaHandlerTest {

    @Test
    public void testSimpleLambdaSuccess() throws Exception {
        InputObject in = new InputObject();
        in.setGreeting("Hello");
        OutputObject out = LambdaClient.invoke(OutputObject.class, in);
        Assertions.assertTrue(out.getResult().contains("Hello"));
        Assertions.assertTrue(out.getRequestId().matches("aws-request-\\d"),
                "Expected requestId as 'aws-request-<number>'");
    }

}
