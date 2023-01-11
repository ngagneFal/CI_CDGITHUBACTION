package com.groupeisi.scolarite.repository;

import com.groupeisi.scolarite.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
