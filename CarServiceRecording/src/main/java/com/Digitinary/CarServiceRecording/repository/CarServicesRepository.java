package com.Digitinary.CarServiceRecording.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.Digitinary.CarServiceRecording.entity.CarService;

@Transactional
public interface CarServicesRepository extends JpaRepository<CarService, Long> {

	final String FIND_BY_CUSTOMER_QUERY = 
			"select carService.* from Customer customer "
			+ "left join Car car on car.customer_id=customer.id "
			+ "left join SERVICES_CARS carsServices on carsServices.car_id=car.id "
			+ "left join car_service carService on carService.id=carsServices.car_service_id "
			+ "where customer.id= :id";

	final String FIND_BY_CAR_QUERY = 
			"SELECT  carService.* FROM CAR car "
			+ "left join SERVICES_CARS carsServices on carsServices.car_id=car.id "
			+ "left join car_service carService on carService.id=carsServices.car_service_id " 
			+ "where car.id= :id";
	
	final String SAVE_CAR_SERVICE = "insert into SERVICES_CARS ( CAR_SERVICE_ID,car_id ) values( ?1,?2 ) ";
	
	final String EXISTS_SERVICES_CARS_QUERY ="select case when count(*)> 0 then true else false end from SERVICES_CARS  where CAR_SERVICE_ID =:carServiceId and car_id =:carId";
	
	
	@Query(value = EXISTS_SERVICES_CARS_QUERY, nativeQuery = true)
 	boolean existsServicesCarsQuery(@Param("carServiceId") Long carServiceId, @Param("carId") Long carId);
 
	@Query(value = FIND_BY_CUSTOMER_QUERY, nativeQuery = true)
	List<CarService> findByCustomer(@Param("id") Long id);

	@Query(value = FIND_BY_CAR_QUERY, nativeQuery = true)
	List<CarService> findByCar(@Param("id") Long id);

	@Modifying
	@Query(value = SAVE_CAR_SERVICE, nativeQuery = true)
	void add(Long carServiceId, Long carId);

 
}
