package samwells.io.spring_graphql.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import samwells.io.spring_graphql.codegen.types.User;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
    private final Map<String, User> users;

    public UserServiceImpl() {
        User u1 = new User(UUID.randomUUID().toString(), "S", "W");
        User u2 = new User(UUID.randomUUID().toString(), "S", "B");
        User u3 = new User(UUID.randomUUID().toString(), "C", "W");
        User u4 = new User(UUID.randomUUID().toString(), "C", "B");
        this.users = Map.of(
                u1.getId(), u1,
                u2.getId(), u2,
                u3.getId(), u3,
                u4.getId(), u4
        );
    }

    @Async
    @Override
    public CompletableFuture<List<User>> getUsers() {
        log.info("Retrieving all users");
        return CompletableFuture.completedFuture(users.values().stream().toList());
    }

    @Async
    @Override
    public CompletableFuture<User> getUser(String id) {
        log.info("Retrieving user {}", id);
        return CompletableFuture.completedFuture(users.get(id));
    }
}
