package by.akimova.document_management_system.security.oauth2.user;

import by.akimova.document_management_system.exception.OAuth2AuthenticationProcessingException;

import java.util.Map;

import static org.springframework.security.config.oauth2.client.CommonOAuth2Provider.GOOGLE;


public class OAuth2UserInfoFactory {
    public static OAuth2UserInfo getOAuth2UserInfo(String registrationId, Map<String, Object> attributes) {
        if (registrationId.equalsIgnoreCase(GOOGLE.toString())) {
            return new GoogleOAuth2UserInfo(attributes);
        } else {
            throw new OAuth2AuthenticationProcessingException("Sorry! Login with " + registrationId + " is not supported yet.");
        }
    }
}
