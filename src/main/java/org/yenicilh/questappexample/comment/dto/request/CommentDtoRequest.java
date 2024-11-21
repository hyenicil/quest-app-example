package org.yenicilh.questappexample.comment.dto.request;

import org.yenicilh.questappexample.post.dto.request.PostDtoRequest;
import org.yenicilh.questappexample.user.dto.request.UserDtoRequest;

public record CommentDtoRequest(
        PostDtoRequest post,
        UserDtoRequest user,
        String text
) {
}
