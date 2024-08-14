package com.oauth2.resourceserver;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Photo {
    private String userId;
    private String photoId;
    private String photoTitle;
    private String photoDescription;
}
