package com.develop.test.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.develop.test.model.databasemodel.UserDataBaseModel;

@Repository
public interface IUserRepository extends CrudRepository<UserDataBaseModel, Long>{

	@Query(value = "select top 1 * from user_profile order by id desc",nativeQuery = true)
	public UserDataBaseModel lastUser();
	
	@Query(value = "UPDATE user_profile SET correo=:correo , password=:pass, rol=:rol, sexo=:sexo, user_name=:userName WHERE id=:id",nativeQuery = true)
	public UserDataBaseModel updateuser(@Param("correo") String correo,
		 	                            @Param("pass") String pass, 
			                            @Param("rol") String rol,
										@Param("sexo") String sexo,
										@Param("userName") String userName,
										@Param("id") Long id);
}
