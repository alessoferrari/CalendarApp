package com.kenzie.unit.one.project.conferencelink;

import com.kenzie.unit.one.project.backend.Backend;

public class ConferenceLinkContext implements ConferenceLinkHandler {

    private ConferenceLinkHandler handler;


    public ConferenceLinkContext(String conferenceLinkType) {


    }

    @Override
    public void join(String meetingCode) {
        handler.join(meetingCode);
    }
}
