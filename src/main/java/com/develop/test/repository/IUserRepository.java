package com.develop.test.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.develop.test.model.databasemodel.UserDataBaseModel;

@Repository
public interface IUserRepository extends CrudRepository<UserDataBaseModel, Long>{

}
