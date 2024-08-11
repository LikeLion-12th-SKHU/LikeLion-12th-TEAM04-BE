package com.likelion.neighbor.global.cache;

import org.springframework.data.repository.CrudRepository;

import com.likelion.neighbor.global.dto.ShortUrlReponseDto;

public interface ShortUrlRedisRepository extends CrudRepository<ShortUrlReponseDto, String> {
}
