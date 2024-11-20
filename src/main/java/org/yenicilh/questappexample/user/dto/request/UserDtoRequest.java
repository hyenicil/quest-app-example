package org.yenicilh.questappexample.user.dto.request;

public record UserDtoRequest(
        String username,
        String firstName,
        String lastName,
        String password,
        String email
) {
}
