package com.kenzie.unit.one.project.conferencelink;

import com.kenzie.unit.one.project.backend.Backend;
import com.kenzie.unit.one.project.models.EventDto;
import com.kenzie.unit.one.project.models.VideoConferenceLinkDto;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import static java.lang.String.format;

public class GoogleConferenceLinkHandler implements ConferenceLinkHandler {

    private final Backend backend;

    public GoogleConferenceLinkHandler(Backend backend) {
        this.backend = backend;
    }

    @Override
    public void join(String meetingCode) {

        EventDto eventResponse = backend.getEvent(meetingCode);
        VideoConferenceLinkDto videoConferenceResponse = backend.getEventVideoLink(meetingCode);
        if (eventResponse == null || videoConferenceResponse == null) {
            throw new IllegalArgumentException("Conference link does not exist");
        }
        try {
            if (eventResponse.getVideoConferenceProvider().equalsIgnoreCase("google")) {
                String formattedCode = format("%s-%s-%s",
                        videoConferenceResponse.getMeetingCode().substring(0, 3),
                        videoConferenceResponse.getMeetingCode().substring(3, 6),
                        videoConferenceResponse.getMeetingCode().substring(6));
                Desktop.getDesktop().browse(new URL(format("https://meet.google.com", formattedCode)).toURI());
            }
           
        } catch (IOException | URISyntaxException e) {
            throw new IllegalArgumentException("Could not join video conference");
        }
    }
    }

