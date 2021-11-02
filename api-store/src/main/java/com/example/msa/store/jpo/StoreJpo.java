package com.example.msa.store.jpo;

import com.example.msa.entity.Store;
import com.example.msa.entity.StoreRdo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
@Alias("storeJpo")
public class StoreJpo extends Store{
    private String id;
    private String name;
    private String address;
    private String category;
    private String keyword;

    public StoreJpo(Store store) {
        if (store != null) {
            BeanUtils.copyProperties(store, this);
        }
    }

    public StoreRdo toDomain() {
        StoreRdo store = new StoreRdo();
        BeanUtils.copyProperties(this, store);
        return store;
    }


}
