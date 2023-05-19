package gstoy.coffeeshop.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gstoy.coffeeshop.repository.MemberRepository;
import lombok.RequiredArgsConstructor;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

	private final MemberRepository memberRepository;

}
