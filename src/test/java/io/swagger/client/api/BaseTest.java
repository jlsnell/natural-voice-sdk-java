package io.swagger.client.api;

import com.aimmatic.auth.AimMaticCredentials;
import com.aimmatic.auth.InvalidKeyException;
import com.aimmatic.auth.RuntimeCredentialsProvider;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public void setup(ApiClient client) throws ApiException {
        String apiKey = "hS7HxAtwiag3ORXgalKfiA00gDFT9A";
        String secretKey = "apjjUgtwKqg3ORVaWGQyVFJneHlMSAmIRkMtqEqfAAGE0RADH9HceA";
        try {
            RuntimeCredentialsProvider.setAimMaticCredentials(new AimMaticCredentials(apiKey, secretKey));
        } catch (InvalidKeyException e) {
            throw new ApiException(e);
        }
        //String baseApiUrl = "http://api.aimmatic.info/v1";
        String baseApiUrl = "http://127.0.0.1:8080/v1";
        client.setDebugging(true);
        client.setBasePath(baseApiUrl);
        client.setConnectTimeout(6000);
        client.getHttpClient().setReadTimeout(5, TimeUnit.MINUTES);
    }


}
