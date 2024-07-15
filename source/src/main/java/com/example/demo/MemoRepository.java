package com.example.demo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import jakarta.transaction.Transactional;

@Repository
public interface MemoRepository extends JpaRepository<Memo, Long> { //ID 타입이 Long
	Long countByUserIdAndPassword(String userId, String password);
	@Transactional
	Long deleteByUserId(String userId);
	Optional<Memo> findByUserId(String userId);
}
