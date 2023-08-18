package com.isrartest.orderservice.config;

import com.isrartest.orderservice.dto.InventoryResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@FeignClient(value = "inventory-service")
public interface FeignServiceUtil {

    @GetMapping("/api/inventory")
    InventoryResponse[] isInStock(@RequestParam("skuCode") List<String> skuCode);

}
