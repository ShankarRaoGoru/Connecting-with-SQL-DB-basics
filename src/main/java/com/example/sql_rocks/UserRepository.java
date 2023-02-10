package com.example.sql_rocks;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    //first part in <> is with whome to connect
    //second part-datatype of pk
    //in this layer we will write custom queries
}
