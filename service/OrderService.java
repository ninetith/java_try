package service;

import utils.LoggerUtil;
import utils.StringHelper;

public class OrderService {
    private ProductService productService = new ProductService();

    public void processOrder(String productName, int quantity) {
        LoggerUtil.log("Processing order...");
        if (StringHelper.isNullOrEmpty(productName)) {
            LoggerUtil.log("Invalid product name.");
            return;
        }
        productService.checkInventory(productName, quantity);
        LoggerUtil.log("Order processed successfully.");
    }
}
