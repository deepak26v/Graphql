package com.org.graphql.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by deepakvalechha on 05/06/18.
 */
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
