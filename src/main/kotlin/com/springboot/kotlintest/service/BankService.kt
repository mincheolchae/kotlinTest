package com.springboot.kotlintest.service

import com.springboot.kotlintest.datasource.BankDataSource
import com.springboot.kotlintest.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService (private val dataSource: BankDataSource) {

    fun getBanks() : Collection<Bank> = dataSource.retrieveBanks()

    fun getBank(accountNumber: String): Bank = dataSource.retrieveBank(accountNumber)
    fun addBank(bank: Bank): Bank = dataSource.createBank(bank)
    fun updateBank(bank: Bank): Bank = dataSource.updateBank(bank)
    fun deleteBank(accountNumber: String): Unit = dataSource.deleteBank(accountNumber)

}