/*
 * Natural Voice SDK
 * Natural Voice SDKs are easiest and best supported way for most developers to quickly build and iterate Natural Voice applications that integrate with our services programmatically.
 *
 * OpenAPI spec version: 1.2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.model.ValuesResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UploadValuesApi
 */

public class UploadValuesApiTest extends BaseTest{

    private final UploadValuesApi api = new UploadValuesApi();

    
    /**
     * Upload values from your application
     *
     * Use this API to upload values from your application. This is a POST operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void insightsUploadValuesPostTest() throws ApiException {

        JSONObject json = new JSONObject();

        json.put("test1", "value1");
        Object body = "some test";

        ApiResponse<ValuesResponse> res = api.insightsUploadValuesPostWithHttpInfo(body);
        Assert.assertEquals("status", 200, res.getStatusCode());
        ValuesResponse resBody = res.getData();
    }
    
}