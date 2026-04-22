package com.example;

import lombok.Builder;

@Builder
public record Book(String title, String author) {

}
