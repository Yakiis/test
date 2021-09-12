package com.develop.test.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.develop.test.model.databasemodel.UserDataBaseModel;

@Repository
public interface IUserRepository extends CrudRepository<UserDataBaseModel, Long>{

	@Query(value = "select top 1 * from user_profile order by id desc",nativeQuery = true)
	public UserDataBaseModel lastUser();
}
