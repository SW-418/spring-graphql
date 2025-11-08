package samwells.io.spring_graphql.service.user;

import samwells.io.spring_graphql.codegen.types.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User getUser(String id);
}
