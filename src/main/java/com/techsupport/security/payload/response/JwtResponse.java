package com.techsupport.security.payload.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private Long id;
    private String username;
    private String name;
    private String email;
    private List<String> authoritiesList;

    public JwtResponse(String accessToken, Long id, String username, String name, String email, List<String> authoritiesList) {
        this.token = accessToken;
        this.id = id;
        this.username = username;
        this.name = name;
        this.email = email;
        this.authoritiesList = authoritiesList;
    }
}
