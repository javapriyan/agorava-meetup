package org.agorava.meetup.response;

import org.agorava.meetup.model.MeetupProfile;

import java.util.List;

/**
 * Created by Karthikeyan Annamalai on 4/25/15.
 */
public class MeetupProfileResponse extends Response<MeetupProfile> {

    public MeetupProfile getListInfo() {
        return retrieveData();
    }

    public List<MeetupProfile> getAllListInfo() {
        return retrieveAllData();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
