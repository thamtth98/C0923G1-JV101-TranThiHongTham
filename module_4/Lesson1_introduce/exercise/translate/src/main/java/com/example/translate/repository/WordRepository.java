package com.example.translate.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class WordRepository implements IWordRepository {
    private static final Map<String, String> listWord = new HashMap<>();

    static {
        listWord.put("book", "vở");
        listWord.put("pen", "bút");
        listWord.put("apple", "táo");
        listWord.put("bottle", "chai");
        listWord.put("cycle", "xe đạp");
    }

    public String translate(String english) {
        String result = listWord.get(english);
        if (result == null) {
            return "Từ điển của tui hạn hẹp, không có từ " + english;
        } else {
            return result;
        }
    }
}
