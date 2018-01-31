package guru.springframework.spring5restapi.service;

import guru.springframework.api.domain.User;

import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);
}
