package com.example.msa.rest;

import com.example.msa.entity.ResultMessage;
import com.example.msa.entity.Store;
import com.example.msa.entity.StoreRdo;
import com.example.msa.spec.StoreService;
import com.example.msa.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Slf4j
@RequestMapping("/demo/v0.1/stores")
@CrossOrigin("*")
@RestController
public class StoreResource {

//    @Autowired
    private final StoreService storeService;
    public StoreResource(StoreService storeService){
        this.storeService = storeService;
    }

//    http://localhost:8086/demo/v0.1/stores/kick23
    @GetMapping("/{id}")
    public ResponseEntity<ResultMessage> findById(@PathVariable String id) throws Exception{
        log.debug("### findById : {}", id);
        StoreRdo store = storeService.findById(id);
        ResultMessage message = ResultUtil.getResultMessage(store);
        return ResponseEntity.status(HttpStatus.OK).body(message);
    }

//    http://localhost:8086/demo/v0.1/stores?id=kick23
    @GetMapping
    public ResponseEntity<ResultMessage> findByCondition(Store store) throws Exception{
        log.debug("### findByCondition : {}", store);
        List<StoreRdo> storeList = storeService.findByCondition(store);
        ResultMessage message = ResultUtil.getResultMessage(storeList);
        return ResponseEntity.status(HttpStatus.OK).body(message);
    }

//    http://localhost:8086/demo/v0.1/stores/totalCount
    @GetMapping("/totalCount")
    public ResponseEntity<ResultMessage> totalCount() throws Exception{
        log.debug("### totalCount");
        Integer count = storeService.totalCount();
        ResultMessage message = ResultUtil.getResultMessage(count);
        return ResponseEntity.status(HttpStatus.OK).body(message);
    }

//    http://localhost:8086/demo/v0.1/stores/count/?id=kick23
    @GetMapping("/count")
    public ResponseEntity<ResultMessage> count(Store store) throws Exception{
        log.debug("### count");
        Integer count = storeService.count(store);
        ResultMessage message = ResultUtil.getResultMessage(count);
        return ResponseEntity.status(HttpStatus.OK).body(message);
    }

//    http://localhost:8086/demo/v0.1/stores?id=test1&password=1234&name=tester&email=tester@mail
    @PostMapping
    public ResponseEntity<ResultMessage> insert(Store store, HttpServletRequest request) throws Exception{
        log.debug("### insert {}", store.toString());
        Integer count = storeService.insert(store);
        ResultMessage message = ResultUtil.getResultMessage(count);
        return ResponseEntity.status(HttpStatus.OK).body(message);
    }

//    http://localhost:8086/demo/v0.1/stores?id=test1&password=1111&name=tester&email=tester@mail
    @PutMapping
    public ResponseEntity<ResultMessage> update(Store store, HttpServletRequest request) throws Exception{
        log.debug("### update {}", store.toString());
        Integer count = storeService.update(store);
        ResultMessage message = ResultUtil.getResultMessage(count);
        return ResponseEntity.status(HttpStatus.OK).body(message);
    }

//    http://localhost:8086/demo/v0.1/stores?id=store1
    @DeleteMapping
    public ResponseEntity<ResultMessage> delete(Store store, HttpServletRequest request) throws Exception{
        log.debug("### delete {}", store.toString());
        Integer count = storeService.delete(store);
        ResultMessage message = ResultUtil.getResultMessage(count);
        return ResponseEntity.status(HttpStatus.OK).body(message);
    }

}
