package com.example.demo_batch_alejandro.Repository;

import com.example.demo_batch_alejandro.domain.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProfileRepository extends CrudRepository<Profile,Integer> {
}
