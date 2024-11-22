package com.ecommerce.eCommerce.controller;

import com.ecommerce.eCommerce.dto.Purchase;
import com.ecommerce.eCommerce.dto.PurchaseResponse;
import com.ecommerce.eCommerce.service.CheckOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author vikashkumar
 */
@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/chekout")
public class CheckoutController {
    
    @Autowired
    private CheckOutService checkoutService;
    
    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase)
    {
        return checkoutService.placeOrder(purchase);
    }
    
    
}
