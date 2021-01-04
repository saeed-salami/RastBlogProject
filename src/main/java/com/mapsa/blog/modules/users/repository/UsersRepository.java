package com.mapsa.blog.modules.users.repository;

import com.mapsa.blog.modules.users.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,Long> {
}
