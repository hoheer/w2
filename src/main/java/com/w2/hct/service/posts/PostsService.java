package com.w2.hct.service.posts;

import com.w2.hct.domain.posts.PostsRepository;
import com.w2.hct.web.Dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
       return postsRepository.save(requestDto.toEntity()).getId();
    }
}
