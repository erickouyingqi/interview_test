package com.example.demo.controller;

import com.example.demo.repository.entity.ForeignExchEntity;
import com.example.demo.repository.entity.TransactionDetail;
import com.example.demo.service.IServiceMoneyChanger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoneyChangerController {
   @Autowired
   public IServiceMoneyChanger  changerService;

   @PostMapping("/getExchangeRate")
   @ResponseBody
   public ForeignExchEntity getExchRateFromCurrToCurr(@RequestParam(value="fromCurrency") String fromCurr,@RequestParam(value="toCurrency") String toCurr){
       return changerService.getExchRateFromCurrToCurr(fromCurr,toCurr);
   }

   @PostMapping("/getCurrencyAmount")
   @ResponseBody
   public String getCurrencyAmountFromCurr(@RequestParam(value="fromCurrAmount") String fromCurrAmount,@RequestParam(value="exchangeRate") String exchangeRate){
       return changerService.getCurrencyAmountFromCurr(fromCurrAmount,exchangeRate);
   }

   @PostMapping("/saveTransaction")
   @ResponseBody
   public void storeTransactionDetails(@RequestParam(value="fromCurrency") String fromCurrency,@RequestParam(value="toCurrency") String toCurrency,@RequestParam(value="exchangeRate") String exchangeRate,@RequestParam(value="fromAmount") String fromAmount,@RequestParam(value="toAmount") String toAmount){
       TransactionDetail transactionDetail=new TransactionDetail();
       transactionDetail.setFromCurrency(fromCurrency);
       transactionDetail.setToCurrency(toCurrency);
       transactionDetail.setExchangeRate(exchangeRate);
       transactionDetail.setFromAmount(fromAmount);
       transactionDetail.setToAmount(toAmount);

       changerService.storeTransactionDetails(transactionDetail);
   }
}
