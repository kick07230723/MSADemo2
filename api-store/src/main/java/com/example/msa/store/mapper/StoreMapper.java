package com.example.msa.store.mapper;

import com.example.msa.entity.Store;
import com.example.msa.entity.StoreRdo;
import com.example.msa.store.jpo.StoreJpo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StoreMapper {
    int count(StoreJpo jpo);
    StoreJpo findById(String id);
    List<StoreJpo> findByCondition(StoreJpo jpo);
    int totalCount();
    int update(StoreJpo jpo);
    int insert(StoreJpo jpo);
    int delete(StoreJpo jpo);
}
