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

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.AudioResponse;
import java.io.File;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UploadAudioApi {
    private ApiClient apiClient;

    public UploadAudioApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UploadAudioApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for insightsUploadAudioPost
     * @param uploadFile (required) Audio binary file, two formats are supported “WAV” and “FLAC” (required)
     * @param deviceLanguage (required) String, BCP-47 identifier, language code parameter for speech recognition. For best results use speechLang value defined by user. Device language should be used only if speechLang is not available from the user. (required)
     * @param confidence (optional) String, minimum estimated speech-to-text confidence level that accepted for sending transcript to natural language processing, default is 0.90 (optional)
     * @param merge (optional) String, “true” or “false” used to determine if all speech should be merged into single transcript, default is “true” (optional)
     * @param deviceLocation (optional) String, it will be available when the application has location permission (optional)
     * @param sampleRate (optional) Int32, sample rate (in Hertz) of the audio binary file (optional)
     * @param ruleTrimEnd (optional) Integer, value indicates a % * 1.5 to truncate the audio file, e.g. 1 will use 98.5% of original audio file, 2 &#x3D; 3%, default is 0 (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call insightsUploadAudioPostCall(File uploadFile, String deviceLanguage, String confidence, String merge, String deviceLocation, Integer sampleRate, Integer ruleTrimEnd, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/insights/UploadAudio";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (uploadFile != null)
        localVarFormParams.put("uploadFile", uploadFile);
        if (deviceLanguage != null)
        localVarFormParams.put("deviceLanguage", deviceLanguage);
        if (confidence != null)
        localVarFormParams.put("confidence", confidence);
        if (merge != null)
        localVarFormParams.put("merge", merge);
        if (deviceLocation != null)
        localVarFormParams.put("deviceLocation", deviceLocation);
        if (sampleRate != null)
        localVarFormParams.put("sampleRate", sampleRate);
        if (ruleTrimEnd != null)
        localVarFormParams.put("ruleTrimEnd", ruleTrimEnd);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call insightsUploadAudioPostValidateBeforeCall(File uploadFile, String deviceLanguage, String confidence, String merge, String deviceLocation, Integer sampleRate, Integer ruleTrimEnd, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'uploadFile' is set
        if (uploadFile == null) {
            throw new ApiException("Missing the required parameter 'uploadFile' when calling insightsUploadAudioPost(Async)");
        }
        
        // verify the required parameter 'deviceLanguage' is set
        if (deviceLanguage == null) {
            throw new ApiException("Missing the required parameter 'deviceLanguage' when calling insightsUploadAudioPost(Async)");
        }
        
        
        com.squareup.okhttp.Call call = insightsUploadAudioPostCall(uploadFile, deviceLanguage, confidence, merge, deviceLocation, sampleRate, ruleTrimEnd, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Upload audio from your application
     * Use this API to upload audio from your application for speech recognition with unparalleled accuracy as well as automated text analysis by natural language processing (NLP). This is a POST operation.
     * @param uploadFile (required) Audio binary file, two formats are supported “WAV” and “FLAC” (required)
     * @param deviceLanguage (required) String, BCP-47 identifier, language code parameter for speech recognition. For best results use speechLang value defined by user. Device language should be used only if speechLang is not available from the user. (required)
     * @param confidence (optional) String, minimum estimated speech-to-text confidence level that accepted for sending transcript to natural language processing, default is 0.90 (optional)
     * @param merge (optional) String, “true” or “false” used to determine if all speech should be merged into single transcript, default is “true” (optional)
     * @param deviceLocation (optional) String, it will be available when the application has location permission (optional)
     * @param sampleRate (optional) Int32, sample rate (in Hertz) of the audio binary file (optional)
     * @param ruleTrimEnd (optional) Integer, value indicates a % * 1.5 to truncate the audio file, e.g. 1 will use 98.5% of original audio file, 2 &#x3D; 3%, default is 0 (optional)
     * @return AudioResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AudioResponse insightsUploadAudioPost(File uploadFile, String deviceLanguage, String confidence, String merge, String deviceLocation, Integer sampleRate, Integer ruleTrimEnd) throws ApiException {
        ApiResponse<AudioResponse> resp = insightsUploadAudioPostWithHttpInfo(uploadFile, deviceLanguage, confidence, merge, deviceLocation, sampleRate, ruleTrimEnd);
        return resp.getData();
    }

    /**
     * Upload audio from your application
     * Use this API to upload audio from your application for speech recognition with unparalleled accuracy as well as automated text analysis by natural language processing (NLP). This is a POST operation.
     * @param uploadFile (required) Audio binary file, two formats are supported “WAV” and “FLAC” (required)
     * @param deviceLanguage (required) String, BCP-47 identifier, language code parameter for speech recognition. For best results use speechLang value defined by user. Device language should be used only if speechLang is not available from the user. (required)
     * @param confidence (optional) String, minimum estimated speech-to-text confidence level that accepted for sending transcript to natural language processing, default is 0.90 (optional)
     * @param merge (optional) String, “true” or “false” used to determine if all speech should be merged into single transcript, default is “true” (optional)
     * @param deviceLocation (optional) String, it will be available when the application has location permission (optional)
     * @param sampleRate (optional) Int32, sample rate (in Hertz) of the audio binary file (optional)
     * @param ruleTrimEnd (optional) Integer, value indicates a % * 1.5 to truncate the audio file, e.g. 1 will use 98.5% of original audio file, 2 &#x3D; 3%, default is 0 (optional)
     * @return ApiResponse&lt;AudioResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AudioResponse> insightsUploadAudioPostWithHttpInfo(File uploadFile, String deviceLanguage, String confidence, String merge, String deviceLocation, Integer sampleRate, Integer ruleTrimEnd) throws ApiException {
        com.squareup.okhttp.Call call = insightsUploadAudioPostValidateBeforeCall(uploadFile, deviceLanguage, confidence, merge, deviceLocation, sampleRate, ruleTrimEnd, null, null);
        Type localVarReturnType = new TypeToken<AudioResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Upload audio from your application (asynchronously)
     * Use this API to upload audio from your application for speech recognition with unparalleled accuracy as well as automated text analysis by natural language processing (NLP). This is a POST operation.
     * @param uploadFile (required) Audio binary file, two formats are supported “WAV” and “FLAC” (required)
     * @param deviceLanguage (required) String, BCP-47 identifier, language code parameter for speech recognition. For best results use speechLang value defined by user. Device language should be used only if speechLang is not available from the user. (required)
     * @param confidence (optional) String, minimum estimated speech-to-text confidence level that accepted for sending transcript to natural language processing, default is 0.90 (optional)
     * @param merge (optional) String, “true” or “false” used to determine if all speech should be merged into single transcript, default is “true” (optional)
     * @param deviceLocation (optional) String, it will be available when the application has location permission (optional)
     * @param sampleRate (optional) Int32, sample rate (in Hertz) of the audio binary file (optional)
     * @param ruleTrimEnd (optional) Integer, value indicates a % * 1.5 to truncate the audio file, e.g. 1 will use 98.5% of original audio file, 2 &#x3D; 3%, default is 0 (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call insightsUploadAudioPostAsync(File uploadFile, String deviceLanguage, String confidence, String merge, String deviceLocation, Integer sampleRate, Integer ruleTrimEnd, final ApiCallback<AudioResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = insightsUploadAudioPostValidateBeforeCall(uploadFile, deviceLanguage, confidence, merge, deviceLocation, sampleRate, ruleTrimEnd, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AudioResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
