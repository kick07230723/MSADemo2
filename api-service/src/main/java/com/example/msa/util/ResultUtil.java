package com.example.msa.util;

import com.example.msa.entity.ResultMessage;
import com.example.msa.entity.Store;
import com.example.msa.entity.StoreRdo;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
public class ResultUtil {

    public static ResultMessage getResultMessage(StoreRdo store) {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("result", store);

        if (store != null)
            log.debug("### Result(Store) : {}", store.toString());

        ResultMessage message = new ResultMessage();
        message.setPayload(resultMap);
        return message;
    }

    public static ResultMessage getResultMessage(Integer count) {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("result", count);

        if (count != null)
            log.debug("### Result(Count) : {}", count);

        ResultMessage message = new ResultMessage();
        message.setPayload(resultMap);
        return message;
    }


    public static ResultMessage getResultMessage(List<StoreRdo> storeList) {
        Map<String, Object> resultMap = new HashMap<>();

        resultMap.put("result", storeList);
        if (storeList != null)
            log.debug("### Result(List) : {}", storeList.toString());

        ResultMessage message = new ResultMessage();
        message.setPayload(resultMap);
        return message;
    }
}
