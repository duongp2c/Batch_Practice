package com.example.demo_batch_alejandro.Repository;

import com.example.demo_batch_alejandro.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends PagingAndSortingRepository<User,Integer> {
    Page<User> findByStatusAndEmailVerified(String status, boolean emailVerified,
                                            Pageable pageable);
}
