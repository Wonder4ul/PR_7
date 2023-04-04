package com.example.pr_71.Repositoryes;

import androidx.lifecycle.LiveData;

import com.example.pr_71.DataSources.BookDataSource;
import com.example.pr_71.Models.BookInfo;

import java.util.ArrayList;
import java.util.List;

public class BookRepos {
    public LiveData<List<BookInfo>> generateData(){
        return BookDataSource.setInitialData();
    }
}
