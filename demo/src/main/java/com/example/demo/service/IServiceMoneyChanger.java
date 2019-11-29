package com.example.demo.service;

import com.example.demo.repository.entity.ForeignExchEntity;
import com.example.demo.repository.entity.TransactionDetail;

public interface IServiceMoneyChanger {
    public ForeignExchEntity getExchRateFromCurrToCurr(String fromCurrency,String toCurrency);
    public String getCurrencyAmountFromCurr(String fromCurrAmount,String exchangeRate);
    public void storeTransactionDetails(TransactionDetail forexExchEntity);
}
