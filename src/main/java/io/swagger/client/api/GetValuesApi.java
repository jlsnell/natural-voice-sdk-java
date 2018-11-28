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


import io.swagger.client.model.ValuesDocumentResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetValuesApi {
    private ApiClient apiClient;

    public GetValuesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GetValuesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for insightsGetValuesGet
     * @param valuesId (required) String, the valuesId, returned by Upload Values API. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call insightsGetValuesGetCall(String valuesId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/insights/GetValues";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (valuesId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "valuesId", valuesId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call insightsGetValuesGetValidateBeforeCall(String valuesId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'valuesId' is set
        if (valuesId == null) {
            throw new ApiException("Missing the required parameter 'valuesId' when calling insightsGetValuesGet(Async)");
        }
        
        
        com.squareup.okhttp.Call call = insightsGetValuesGetCall(valuesId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieve values uploaded by your application
     * Use this API to retrieve values uploaded by your application. This is a GET operation.
     * @param valuesId (required) String, the valuesId, returned by Upload Values API. (required)
     * @return ValuesDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ValuesDocumentResponse insightsGetValuesGet(String valuesId) throws ApiException {
        ApiResponse<ValuesDocumentResponse> resp = insightsGetValuesGetWithHttpInfo(valuesId);
        return resp.getData();
    }

    /**
     * Retrieve values uploaded by your application
     * Use this API to retrieve values uploaded by your application. This is a GET operation.
     * @param valuesId (required) String, the valuesId, returned by Upload Values API. (required)
     * @return ApiResponse&lt;ValuesDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ValuesDocumentResponse> insightsGetValuesGetWithHttpInfo(String valuesId) throws ApiException {
        com.squareup.okhttp.Call call = insightsGetValuesGetValidateBeforeCall(valuesId, null, null);
        Type localVarReturnType = new TypeToken<ValuesDocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve values uploaded by your application (asynchronously)
     * Use this API to retrieve values uploaded by your application. This is a GET operation.
     * @param valuesId (required) String, the valuesId, returned by Upload Values API. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call insightsGetValuesGetAsync(String valuesId, final ApiCallback<ValuesDocumentResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = insightsGetValuesGetValidateBeforeCall(valuesId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ValuesDocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
