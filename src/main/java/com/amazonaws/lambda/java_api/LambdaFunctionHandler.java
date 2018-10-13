package com.amazonaws.lambda.java_api;

import com.amazonaws.lambda.java_api.tweet_query;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;

public class LambdaFunctionHandler implements RequestStreamHandler {

    @Override
    public void handleRequest(InputStream input, OutputStream output, Context context) throws IOException {

        // TODO: Implement your stream handler. See https://docs.aws.amazon.com/lambda/latest/dg/java-handler-io-type-stream.html for more information.
        // This demo implementation capitalizes the characters from the input stream.
//        int letter = 0;
//        
//        while((letter = input.read()) >= 0) {
//            output.write(Character.toUpperCase(letter));
//        }
    	tweet_query query = new tweet_query();
    	output.write(query.five_more_followed_users().getBytes());  	
    }

}
