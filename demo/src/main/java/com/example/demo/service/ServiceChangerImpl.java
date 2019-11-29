package com.example.demo.service;

import com.example.demo.repository.entity.ForeignExchEntity;
import com.example.demo.repository.entity.TransactionDetail;
import org.springframework.stereotype.Service;

@Service("changerService")
public class ServiceChangerImpl implements IServiceMoneyChanger{
    public ForeignExchEntity getExchRateFromCurrToCurr(String fromCurrency,String toCurrency){

        return null;
    }

    @Override
    public String getCurrencyAmountFromCurr(String fromCurrAmount, String exchangeRate) {
        return null;
    }

    @Override
    public void storeTransactionDetails(TransactionDetail transactionDetail) {

    }
}
