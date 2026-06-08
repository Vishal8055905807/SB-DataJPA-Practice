package com.vishal.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.vishal.entity.AnimalInfo;



//No need to write @Repository annotation here cause JPA will itself understand this as we have extended CrusRepository 
public interface AnimalInfoRepo extends CrudRepository<AnimalInfo, Integer>{
// takes generics as <Entity class, Datatype of primary key>	

	
	
	
	
// Query Methods : Allows you to define queries just by method names 	
	
public List<AnimalInfo> findByNoOfLegsGreaterThanEqual(Integer noOfLegs);	

public List<AnimalInfo> findByCountryOfOrigin(String countryOfOrigin);
public List<AnimalInfo> findByCountryOfOriginIgnoreCase(String countryOfOrigin);

public List<AnimalInfo> findByAgeLimitGreaterThanAndName(Integer ageLimit,String name);


//--------------------------------------------------------------------------------------------


// Creating our own custom method with SQL and giving it to jpa to execute
//nativeQuery = true is provided when we use any query other than HQL

@Query(value =  "SELECT * FROM animal_info" , nativeQuery = true )
public List<AnimalInfo> fetchAllAnimals();

//--------------------------------------------------------------------------------------------

// Creating our own custom method with HQL and giving it to jpa to execute
@Query("FROM AnimalInfo")
public List<AnimalInfo> fetchAllAnimals2();	

//Performing DML operations usinf HQL
// ? - parameter placholder is now supoorted here.Instead use " :variablename"
// @Modifying annotation is used to inform JPA that this method performs DML(modifying) operations orelse JPA will consider this method as select method
//@Transactional annotation is also used 

@Modifying
@Transactional
@Query("delete from AnimalInfo where id = :id")   
public int deleteByIdHQLUsed(@Param("id") Integer id);




}

