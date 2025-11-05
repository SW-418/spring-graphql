package samwells.io.spring_graphql.fetcher;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import samwells.io.spring_graphql.codegen.types.User;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@DgsComponent
public class UserDataFetcher {
    private final Map<String, User> users;

    public UserDataFetcher() {
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

    @DgsQuery
    List<User> getUsers() {
        return users.values().stream().toList();
    }

    @DgsQuery
    User getUser(@InputArgument String id) {
        return users.get(id);
    }
}
