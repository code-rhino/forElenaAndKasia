package io.zipcode.example;

import org.springframework.data.repository.CrudRepository;

public interface ProfileRepo extends CrudRepository<Profile, Long> {
}
