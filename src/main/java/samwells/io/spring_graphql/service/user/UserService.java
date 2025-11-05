package samwells.io.spring_graphql.service.user;

import samwells.io.spring_graphql.codegen.types.User;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface UserService {
    CompletableFuture<List<User>> getUsers();
    CompletableFuture<User> getUser(String id);
}
