package com.yash.JPAAssignment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.JPAAssignment.entity.MemberEntity;



public interface MemberRepo extends JpaRepository<MemberEntity, String> {

	//MemberEntity findByMemberId(String memberid);
	//MemberEntity findByGender(String gender);
	List<MemberEntity> findByName(String name);
	List<MemberEntity> findByJoinyear(int join_year);
}
