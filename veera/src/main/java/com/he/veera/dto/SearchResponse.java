package com.he.veera.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class SearchResponse {
    private String result;
    private List<String> links;
}