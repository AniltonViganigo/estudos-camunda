package com.estudos.camunda;

import camundajar.impl.com.google.gson.JsonObject;
import com.estudos.camunda.client.ProductsClient;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ProductIdDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        ProductsClient productId = new ProductsClient();
            System.out.println(productId.getProductID());
        //execution.setVariable(); -> 

    }
}
