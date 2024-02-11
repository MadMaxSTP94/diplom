package com.liiga.hockeysite.model.media.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum MediaType {
    MEDIA_TYPE_VIDEO("VIDEO"),
    MEDIA_TYPE_ARTICLE("ARTICLE");
    private final String value;
}
