package com.mkyong.customer.bo;

/**
 * Created by 205025 on 7/7/2016.
 */
public interface CustomerBo {
    void addCustomer();

    String addCustomerReturnValue();

    void addCustomerThrowException() throws Exception;

    void addCustomerAround(String name);
}
