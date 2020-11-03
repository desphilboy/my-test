package com.anz.mytest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.anz.mytest.model.Transaction;

@Repository
public interface TransactionsRepository extends JpaRepository<Transaction, Long> {
	
	@Query(value="select * from transactions where acct_number = ?1", nativeQuery=true)
	 List<Transaction> findByAccountNumber(Long accountNumber);

}
