/**
 * Debitoor.com Api Client
 * This is an unofficial api client for the debitoor api. Still in development, don´t use it in production! More information at [https://developers.debitoor.com/api-reference](https://developers.debitoor.com/api-reference).
 *
 * OpenAPI spec version: 0.0.1
 * Contact: pascal.wild@mallorca-software.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.mallorcasoftware.debitoorapiclient.api;

import com.mallorcasoftware.debitoorapiclient.ApiCallback;
import com.mallorcasoftware.debitoorapiclient.ApiClient;
import com.mallorcasoftware.debitoorapiclient.ApiException;
import com.mallorcasoftware.debitoorapiclient.ApiResponse;
import com.mallorcasoftware.debitoorapiclient.Configuration;
import com.mallorcasoftware.debitoorapiclient.Pair;
import com.mallorcasoftware.debitoorapiclient.ProgressRequestBody;
import com.mallorcasoftware.debitoorapiclient.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import com.mallorcasoftware.debitoorapiclient.model.CountryDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountriesApi {
    private ApiClient apiClient;

    public CountriesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CountriesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getCountriesTranslatedByLanguageCode */
    private com.squareup.okhttp.Call getCountriesTranslatedByLanguageCodeCall(String languagecode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'languagecode' is set
        if (languagecode == null) {
            throw new ApiException("Missing the required parameter 'languagecode' when calling getCountriesTranslatedByLanguageCode(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/countries/{languagecode}/v1".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "languagecode" + "\\}", apiClient.escapeString(languagecode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

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

    /**
     * 
     * Get sorted list of countries translated to the specified language 
     * @param languagecode Given language code (required)
     * @return List&lt;CountryDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<CountryDto> getCountriesTranslatedByLanguageCode(String languagecode) throws ApiException {
        ApiResponse<List<CountryDto>> resp = getCountriesTranslatedByLanguageCodeWithHttpInfo(languagecode);
        return resp.getData();
    }

    /**
     * 
     * Get sorted list of countries translated to the specified language 
     * @param languagecode Given language code (required)
     * @return ApiResponse&lt;List&lt;CountryDto&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<CountryDto>> getCountriesTranslatedByLanguageCodeWithHttpInfo(String languagecode) throws ApiException {
        com.squareup.okhttp.Call call = getCountriesTranslatedByLanguageCodeCall(languagecode, null, null);
        Type localVarReturnType = new TypeToken<List<CountryDto>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get sorted list of countries translated to the specified language 
     * @param languagecode Given language code (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCountriesTranslatedByLanguageCodeAsync(String languagecode, final ApiCallback<List<CountryDto>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCountriesTranslatedByLanguageCodeCall(languagecode, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<CountryDto>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
