package com.example.msa.logic;

import com.example.msa.entity.Store;
import com.example.msa.entity.StoreRdo;
import com.example.msa.spec.StoreService;
import com.example.msa.store.StoreStore;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
public class StoreLogic implements StoreService {

    private final StoreStore storeStore;

    public StoreLogic(@Lazy StoreStore storeStore) {
        this.storeStore = storeStore;
    }


    @Override
    public StoreRdo findById(String id) {
        return storeStore.findById(id);
    }

    @Override
    public int totalCount() {
        return storeStore.totalCount();
    }

    @Override
    public List<StoreRdo> findByCondition(Store store) {
        return storeStore.findByCondition(store);
    }

    @Override
    public int count(Store store) {
        return storeStore.count(store);
    }

    @Override
    public int update(Store store) {
        return storeStore.update(store);
    }

    @Override
    public int insert(Store store) {
        return storeStore.insert(store);
    }

    @Override
    public int delete(Store store) {
        return storeStore.delete(store);
    }
}
