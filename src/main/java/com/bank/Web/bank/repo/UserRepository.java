package com.bank.Web.bank.repo;

import com.bank.Web.bank.models.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User,Long> {
}
