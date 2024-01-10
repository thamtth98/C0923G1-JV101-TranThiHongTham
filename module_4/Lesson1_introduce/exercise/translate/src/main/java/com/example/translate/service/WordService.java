package com.example.translate.service;

import com.example.translate.repository.IWordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordService implements IWordService{
    @Autowired
    private IWordRepository wordRepository;
    @Override
    public String translate(String english) {
        return wordRepository.translate(english);
    }
}
