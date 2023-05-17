package gstoy.coffeeshop.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gstoy.coffeeshop.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepository;

}
