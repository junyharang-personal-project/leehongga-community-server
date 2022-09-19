package com.leehongga.community.config.logback.service;

import com.leehongga.community.config.logback.entity.ErrorLog;
import com.leehongga.community.config.logback.entity.ErrorLogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@RequiredArgsConstructor
@Service
public class ErrorLogServiceImpl implements ErrorLogService{

    private final ErrorLogRepository errorLogRepository;

    @Transactional
    public void save(ErrorLog errorLog) {
        errorLogRepository.save(errorLog);
    }
}