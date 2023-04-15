package com.designpattern.designpattern.factory.method;

import lombok.Getter;

public class InstagramSocialMedia implements SocialMedia {
    @Getter
    private final String name = "INSTAGRAM";

    @Getter
    private final String link = "https://www.instagram.com/";

    @Getter
    private final SocialMediaType socialMediaType = SocialMediaType.INSTAGRAM;
}
