package book.ch04;

public interface Customer {
    boolean isVIP();
}



class NativeMerchant extends Merchant {
    @Override
    public Double actionPrice(double price, Customer customer) {
        return 1d;
    }
}

class Merchants<T extends Customer>{
    public double actionPrice(double price, T customer) {
        return 1.0;
    }
}

class VIPOnlyMerchant extends Merchants<VIP> {
    @Override
    public double actionPrice(double price, VIP customer) {
        return 1.0;
    }
}