package samwells.io.spring_graphql.fetcher;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import lombok.AllArgsConstructor;
import samwells.io.spring_graphql.codegen.types.User;
import samwells.io.spring_graphql.service.UserService;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@DgsComponent
@AllArgsConstructor
public class UserDataFetcher {
    private final UserService userService;

    @DgsQuery
    CompletableFuture<List<User>> getUsers() {
        return userService.getUsers();
    }

    @DgsQuery
    CompletableFuture<User> getUser(@InputArgument String id) {
        return userService.getUser(id);
    }
}
