package com.designpattern.designpattern.factory.method;

import lombok.Getter;

public class FacebookSocialMedia implements SocialMedia {
    @Getter
    private final String name = "FACEBOOK";

    @Getter
    private final String link = "https://www.facebook.com/";

    @Getter
    private final SocialMediaType socialMediaType = SocialMediaType.FACEBOOK;
}
