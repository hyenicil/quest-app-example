package org.yenicilh.questappexample.post.dto.response;

import org.yenicilh.questappexample.user.dto.response.UserDtoResponse;

public record PostDtoResponse(
        UserDtoResponse user,
        String title,
        String text
) {
}
