package com.example;

import lombok.Builder;

@Builder
public record Library(String name, Book bestseller) {

}
