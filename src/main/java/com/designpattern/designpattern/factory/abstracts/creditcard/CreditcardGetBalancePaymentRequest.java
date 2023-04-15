package com.designpattern.designpattern.factory.abstracts.creditcard;

import com.designpattern.designpattern.factory.abstracts.EPaymentMethod;
import com.designpattern.designpattern.factory.abstracts.IGetBalancePaymentRequest;

public class CreditcardGetBalancePaymentRequest implements IGetBalancePaymentRequest {

    private String id;
    private Long amount;
    private Long fee;

    @Override
    public String getUserId() {
        throw new UnsupportedOperationException("Unimplemented method 'getUserId'");
    }

    @Override
    public void setUserId(String userId) {
        throw new UnsupportedOperationException("Unimplemented method 'setUserId'");
    }

    @Override
    public EPaymentMethod getMethod() {
        return EPaymentMethod.CREDIT_CARD;
    }

}
