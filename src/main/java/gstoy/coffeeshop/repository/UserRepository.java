package gstoy.coffeeshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gstoy.coffeeshop.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
