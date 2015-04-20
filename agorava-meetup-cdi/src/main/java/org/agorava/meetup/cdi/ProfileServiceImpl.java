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
package org.agorava.meetup.cdi;

import org.agorava.meetup.MeetupBaseService;
import org.agorava.meetup.model.MeetupProfile;
import org.agorava.meetup.service.ProfileService;

/**
 *
 * @author rhegde
 */
public class ProfileServiceImpl extends MeetupBaseService implements ProfileService {

    @Override
    public MeetupProfile getUserProfile() {
        return getService().get(buildAbsoluteUri(PROFILE_URL), MeetupProfile.class);
    }
    
}
