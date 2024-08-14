package com.oauth2.client;

import lombok.Data;

@Data
public class Photo {
  private String photoId;
  private String photoTitle;
  private String photoDescription;
  private String userId;
}
