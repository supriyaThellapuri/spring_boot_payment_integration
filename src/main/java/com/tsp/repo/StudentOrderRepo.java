package com.tsp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsp.dto.StudentOrder;

public interface StudentOrderRepo extends JpaRepository<StudentOrder, Long> {

	public StudentOrder findByRazorPayOrderId(String razorPayOrderId);

}
