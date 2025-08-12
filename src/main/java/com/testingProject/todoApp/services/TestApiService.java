package com.testingProject.todoApp.services;

import com.testingProject.todoApp.dto.PostsResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TestApiService {

    private static String postsApi = "https://jsonplaceholder.typicode.com/posts";
    private RestTemplate restTemplate;

    public List<PostsResponse> getPostsFromApi(){
        try {
            ResponseEntity<PostsResponse[]> response = restTemplate.exchange(postsApi, HttpMethod.GET, null, PostsResponse[].class);

            PostsResponse[] postsArray = response.getBody();

            assert postsArray != null;
            return Arrays.asList(postsArray);
        } catch (RestClientException e) {
            throw new RuntimeException(e);
        }

    }

    public List<PostsResponse> getPostsFromApiByUserId(int userId){
        List<PostsResponse> postsFromApi = getPostsFromApi();
        return postsFromApi.stream()
                .filter(post -> post.getUserId().equals( userId))
                .collect(Collectors.toList());
       }
}
