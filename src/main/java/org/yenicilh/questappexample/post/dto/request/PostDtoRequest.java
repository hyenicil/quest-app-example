package org.yenicilh.questappexample.post.dto.request;

import org.yenicilh.questappexample.user.dto.request.UserDtoRequest;

public record PostDtoRequest(
        UserDtoRequest user,
        String title,
        String text
) {
}
