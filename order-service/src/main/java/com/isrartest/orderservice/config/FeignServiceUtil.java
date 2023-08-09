package com.isrartest.orderservice.config;

import com.isrartest.orderservice.dto.InventoryResponse;
import org.hibernate.query.QueryParameter;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.management.Query;
import java.util.List;

@FeignClient(value = "feignClient", url = "http://localhost:8082/api/inventory")
public interface FeignServiceUtil {

    @GetMapping
    InventoryResponse[] isInStock(@RequestParam("skuCode") List<String> skuCode);

}
