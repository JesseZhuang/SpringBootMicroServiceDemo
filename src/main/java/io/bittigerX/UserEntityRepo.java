package io.bittigerX;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserEntityRepo extends JpaRepository<UserEntity, Long> {

    // spring data generates query according to method name
    List<UserEntity> findByName(String name);
}
