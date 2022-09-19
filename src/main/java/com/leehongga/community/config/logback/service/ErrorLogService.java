package com.leehongga.community.config.logback.service;

import com.leehongga.community.config.logback.entity.ErrorLog;

public interface ErrorLogService {

    void save(ErrorLog errorLog);
}