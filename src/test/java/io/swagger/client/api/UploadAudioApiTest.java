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
import io.swagger.client.ApiResponse;
import io.swagger.client.model.AudioResponse;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * API tests for UploadAudioApi
 */

public class UploadAudioApiTest extends BaseTest {

    private final UploadAudioApi api = new UploadAudioApi();

    
    /**
     * Uploads audio file for analysis
     *
     * Uploads audio file for analysis 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void insightsUploadAudioPostTest() throws ApiException {
        setup(api.getApiClient());

        ClassLoader classLoader = getClass().getClassLoader();
        File uploadFile = new File(classLoader.getResource("outfile.wav").getFile());
        byte[] uploadFileData = {};
        try {
            uploadFileData = Files.readAllBytes(uploadFile.toPath());
        }catch(IOException e){

        }
        /*String deviceLanguage = "en_US";
        Float confidence = 0.84f;
        boolean merge = false;
        String deviceLocation = null;
        Long sampleRate = 44100L;
        Integer ruleTrimEnd = null;*/

        String deviceLanguage = null;
        String confidence = "0.9";
        String merge = "true";
        String deviceLocation = null;
        Integer sampleRate = null;
        Integer ruleTrimEnd = null;

        ApiResponse<AudioResponse> res = api.insightsUploadAudioPostWithHttpInfo(uploadFileData, deviceLanguage, confidence, merge, deviceLocation, sampleRate, ruleTrimEnd);
        Assert.assertEquals("status", 200, res.getStatusCode());
        AudioResponse body = res.getData();
    }
    
}
