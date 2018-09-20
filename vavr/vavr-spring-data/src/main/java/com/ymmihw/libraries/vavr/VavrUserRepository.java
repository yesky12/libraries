package com.ymmihw.libraries.vavr;

import org.springframework.data.repository.Repository;
import io.vavr.collection.Seq;
import io.vavr.control.Option;

public interface VavrUserRepository extends Repository<User, Long> {

  Option<User> findById(long id);

  Seq<User> findByName(String name);

  User save(User user);

}
