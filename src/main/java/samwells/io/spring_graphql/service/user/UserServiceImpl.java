package samwells.io.spring_graphql.service.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import samwells.io.spring_graphql.codegen.types.User;

import java.util.List;
import java.util.Map;
import java.util.UUID;

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

    @Override
    public List<User> getUsers() {
        log.info("Retrieving all users");
        return users.values().stream().toList();
    }

    @Override
    public User getUser(String id) {
        log.info("Retrieving user {}", id);
        return users.get(id);
    }
}
