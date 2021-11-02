package com.example.msa.store;

import com.example.msa.entity.Store;
import com.example.msa.entity.StoreRdo;
import com.example.msa.store.jpo.StoreJpo;
import com.example.msa.store.mapper.StoreMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StoreMapperStore implements StoreStore {

    private final StoreMapper storeMapper;

    public StoreMapperStore(StoreMapper storeMapper) {
        this.storeMapper = storeMapper;
    }

    @Override
    public StoreRdo findById(String id) {
        StoreJpo storeJpo =  storeMapper.findById(id);
        if(storeJpo != null) {
            return storeJpo.toDomain();
        } else {
            return null;
        }
    }

    @Override
    public List<StoreRdo> findByCondition(Store store) {
        //return storeMapper.findByCondition(new StoreJpo(store));
        List<StoreJpo> storeList = storeMapper.findByCondition(new StoreJpo(store));
        return storeList.stream().map(StoreJpo::toDomain).collect(Collectors.toList());
    }

    @Override
    public int count(Store store) {
        return storeMapper.count(new StoreJpo(store));
    }

    @Override
    public int totalCount() {
        return storeMapper.totalCount();
    }

    @Override
    public int update(Store store) {
        return storeMapper.update(new StoreJpo(store));
    }

    @Override
    public int insert(Store store) {
        return storeMapper.insert(new StoreJpo(store));
    }

    @Override
    public int delete(Store store) {
        return storeMapper.delete(new StoreJpo(store));
    }

}
