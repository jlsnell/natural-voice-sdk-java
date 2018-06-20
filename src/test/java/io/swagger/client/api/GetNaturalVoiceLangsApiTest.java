/*
 * AimMatic API
 * APIs for Natural Voice and placeNext
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.BaseResponse;
import io.swagger.client.model.LangsResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GetNaturalVoiceLangsApi
 */
@Ignore
public class GetNaturalVoiceLangsApiTest extends BaseTest {

    private final GetNaturalVoiceLangsApi api = new GetNaturalVoiceLangsApi();

    
    /**
     * Return Supported Natural Voice Languages
     *
     * Return Supported Natural Voice Languages including the full name and device or speech language name 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void insightsLangsGetTest() throws ApiException {
        setup(api.getApiClient());
        LangsResponse response = api.insightsLangsGet();

        System.err.println(response);
        // TODO: test validations
    }
    
}
