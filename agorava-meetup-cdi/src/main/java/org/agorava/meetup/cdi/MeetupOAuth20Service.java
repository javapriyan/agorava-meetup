/*
 * Copyright 2015 rhegde.
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
package org.agorava.meetup.cdi;

import org.agorava.AgoravaConstants;
import org.agorava.api.atinject.GenericBean;
import org.agorava.api.oauth.OAuth;
import org.agorava.api.oauth.OAuthRequest;
import org.agorava.api.oauth.Token;
import org.agorava.api.oauth.application.OAuthAppSettings;
import org.agorava.oauth.OAuth20FinalServiceImpl;

/**
 *
 * @author rhegde
 */
@GenericBean
@OAuth(OAuth.OAuthVersion.OTHER)
public class MeetupOAuth20Service extends OAuth20FinalServiceImpl {

    @Override
    public void signRequest(Token accessToken, OAuthRequest request) {
        OAuthAppSettings config = getTunedOAuthAppSettings();
        super.signRequest(accessToken, request);
        request.addQuerystringParameter(AgoravaConstants.CLIENT_ID, config.getApiKey());
    }
}