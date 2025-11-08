package samwells.io.spring_graphql.fetcher;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import lombok.AllArgsConstructor;
import samwells.io.spring_graphql.codegen.types.User;
import samwells.io.spring_graphql.service.user.UserService;

import java.util.List;

@DgsComponent
@AllArgsConstructor
public class UserDataFetcher {
    private final UserService userService;

    @DgsQuery
    List<User> getUsers() {
        return userService.getUsers();
    }

    @DgsQuery
    User getUser(@InputArgument String id) {
        return userService.getUser(id);
    }
}
