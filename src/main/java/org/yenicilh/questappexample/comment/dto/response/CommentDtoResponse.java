package org.yenicilh.questappexample.comment.dto.response;

import org.yenicilh.questappexample.post.dto.response.PostDtoResponse;
import org.yenicilh.questappexample.user.dto.response.UserDtoResponse;

public record CommentDtoResponse(
        PostDtoResponse post,
        UserDtoResponse user,
        String text
) {
}
