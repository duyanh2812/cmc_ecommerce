package com.cmc.ecommerce.dto;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductAddRequestDTO {
    private String displayName;
    private Double price;
    private String description;
    private MultipartFile[] images;
    private String[] categories;
}
