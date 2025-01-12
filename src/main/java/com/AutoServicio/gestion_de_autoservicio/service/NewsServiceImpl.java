package com.AutoServicio.gestion_de_autoservicio.service;

import com.AutoServicio.gestion_de_autoservicio.persistence.repository.INewsRepository;
import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl {

    private final INewsRepository newsRepository;

    public NewsServiceImpl(INewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

}
