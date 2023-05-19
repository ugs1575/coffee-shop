package gstoy.coffeeshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gstoy.coffeeshop.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
