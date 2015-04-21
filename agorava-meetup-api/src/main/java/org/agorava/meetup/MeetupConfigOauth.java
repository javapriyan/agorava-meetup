/*
 * Copyright 2015 Agorava
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.agorava.meetup;

import org.agorava.api.oauth.OAuth;
import org.agorava.api.oauth.application.OAuthAppSettings;
import org.agorava.api.service.OAuthEncoder;
import org.agorava.spi.ProviderConfigOauth20Final;

/**
 *
 * @author rhegde
 */
@Meetup
public class MeetupConfigOauth extends ProviderConfigOauth20Final {

    //https://secure.meetup.com/oauth2/authorize?client_id=YOUR_CONSUMER_KEY&response_type=token&redirect_uri=YOUR_CONSUMER_REDIRECT_URI

    private static final String AUTHORIZE_URL = "https://secure.meetup.com/oauth2/authorize?client_id=%s&response_type=token&redirect_uri=%s";

    @Override
    public String getAccessTokenEndpoint() {
        return "https://secure.meetup.com/oauth2/access";
    }

    @Override
    public String getAuthorizationUrl(OAuthAppSettings config) {
        return String.format(AUTHORIZE_URL, config.getApiKey(), OAuthEncoder.encode(config.getCallback()));
    }

    @Override
    public OAuth.OAuthVersion getOAuthVersion() {
        return OAuth.OAuthVersion.OTHER;
    }
}
