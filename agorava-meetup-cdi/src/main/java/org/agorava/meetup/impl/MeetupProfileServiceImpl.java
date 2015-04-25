package org.agorava.meetup.impl;

import org.agorava.meetup.MeetupBaseService;
import org.agorava.meetup.model.MeetupProfile;
import org.agorava.meetup.response.MeetupProfileResponse;
import org.agorava.meetup.service.ProfileService;

/**
 * @author Karthikeyan Annamalai
 *
 */
public class MeetupProfileServiceImpl extends MeetupBaseService implements ProfileService
{
    @Override
    public MeetupProfileResponse getUserProfile() {
        return getService().get(buildAbsoluteUri(PROFILE_URL),MeetupProfileResponse.class);
    }
}
