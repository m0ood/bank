package com.bank.Web.bank.repo;

import com.bank.Web.bank.models.Money;
import org.springframework.data.repository.CrudRepository;


public interface MoneyRepository extends CrudRepository<Money,Long> {
}
