package com.springboot.kotlintest.datasource

import com.springboot.kotlintest.model.Bank

interface BankDataSource {

    fun retrieveBanks() : Collection<Bank>
    fun retrieveBank(accountNumber: String): Bank
    fun createBank(bank: Bank): Bank
    fun updateBank(bank: Bank): Bank
    fun deleteBank(accountNumber: String)
}