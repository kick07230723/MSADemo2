package com.example.msa.store;

import com.example.msa.entity.Store;
import com.example.msa.entity.StoreRdo;

import java.util.List;

public interface StoreStore {

    StoreRdo findById(String id);
    List<StoreRdo> findByCondition(Store store);
    int totalCount();
    int count(Store store);
    int update(Store store);
    int insert(Store store);
    int delete(Store store);
}
