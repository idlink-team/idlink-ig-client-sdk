/*
 * ID LINK
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package idlink.ig.client.api;

import io.swagger.client.ApiException;
import idlink.ig.client.model.OAuth2GetAuthCodeResponse;
import idlink.ig.client.model.OAuth2GetReqCodeResponse;
import idlink.ig.client.model.OAuth2GetUserInfoResponse;
import idlink.ig.client.model.OAuth2LoginResponse;
import idlink.ig.client.model.OAuth2VerifyAccessTokenResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OAuth2Api
 */
@Ignore
public class OAuth2ApiTest {

    private final OAuth2Api api = new OAuth2Api();

    /**
     * jwt list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void jwkListTest() throws ApiException {
        Map<String, Object> response = api.jwkList();

        // TODO: test validations
    }
    /**
     * oauth2 user&#x27;s getCode
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void oAuth2AuthorizeGetCodeTest() throws ApiException {
        String redirectUri = null;
        String state = null;
        String authorization = null;
        OAuth2GetReqCodeResponse response = api.oAuth2AuthorizeGetCode(redirectUri, state, authorization);

        // TODO: test validations
    }
    /**
     * OAuth2 get user info
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void oAuth2GetUserInfoTest() throws ApiException {
        String token = null;
        String authorization = null;
        OAuth2GetUserInfoResponse response = api.oAuth2GetUserInfo(token, authorization);

        // TODO: test validations
    }
    /**
     * oauth2 user&#x27;s login getCode
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void oAuth2OAuth2LoginGetCodeTest() throws ApiException {
        String password = null;
        String reqcode = null;
        String userName = null;
        String authorization = null;
        OAuth2GetAuthCodeResponse response = api.oAuth2OAuth2LoginGetCode(password, reqcode, userName, authorization);

        // TODO: test validations
    }
    /**
     * oauth2 user&#x27;s token
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void oAuth2TokenTest() throws ApiException {
        String clientId = null;
        String clientSecret = null;
        String code = null;
        String grantType = null;
        String password = null;
        String redirectUri = null;
        String refreshToken = null;
        String username = null;
        String authorization = null;
        OAuth2LoginResponse response = api.oAuth2Token(clientId, clientSecret, code, grantType, password, redirectUri, refreshToken, username, authorization);

        // TODO: test validations
    }
    /**
     * OAuth2 verify Access Token
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void oAuth2VerifyAccessTokenTest() throws ApiException {
        String token = null;
        String authorization = null;
        OAuth2VerifyAccessTokenResponse response = api.oAuth2VerifyAccessToken(token, authorization);

        // TODO: test validations
    }
    /**
     * openid configuration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void openidConfigurationTest() throws ApiException {
        Map<String, Object> response = api.openidConfiguration();

        // TODO: test validations
    }
    /**
     * verify jwt token
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void verifyJWTTest() throws ApiException {
        String authorization = null;
        String token = null;
        Boolean response = api.verifyJWT(authorization, token);

        // TODO: test validations
    }
}
