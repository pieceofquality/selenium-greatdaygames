package com.selenium.template.model;

public class ProfileData {
    private final String to;
    private final String subject;

    public ProfileData(String to, String subject) {
        this.to = to;
        this.subject = subject;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }
}
