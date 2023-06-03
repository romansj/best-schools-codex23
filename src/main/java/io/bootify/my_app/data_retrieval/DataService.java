package io.bootify.my_app.data_retrieval;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.time.Duration;

@Service
public class DataService {

    private static final Duration REQUEST_TIMEOUT = Duration.ofSeconds(3);


    private final WebClient localApiClient;

    @Autowired
    public DataService(WebClient localApiClient) {
        this.localApiClient = localApiClient;
    }

//    public User getUser(long id) {
//        return localApiClient
//                .get()
//                .uri("/users/" + id)
//                .retrieve()
//                .bodyToMono(User.class)
//                .block(REQUEST_TIMEOUT);
//    }

}
