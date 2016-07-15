package com.test;

/**
 * Created by 205025 on 6/24/2016.
 */
public class BillPoughSingleton {
    private String username;
    private String password;
    private String address;
    private BillPoughSingleton(){

    }
    private static class Helper{
        private static final BillPoughSingleton billPoughSingleton = new BillPoughSingleton();
    }
    public static BillPoughSingleton getInstance(){
        return Helper.billPoughSingleton;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BillPoughSingleton)) return false;

        BillPoughSingleton that = (BillPoughSingleton) o;

        if (!username.equals(that.username)) return false;
        if (!password.equals(that.password)) return false;
        return address.equals(that.address);

    }

    @Override
    public int hashCode() {
        int result = username.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + address.hashCode();
        return result;
    }
}
