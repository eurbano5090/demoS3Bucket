package com.example.demo.service;

import java.io.InputStream;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;

public interface AWSS3Service {

    void uploadFile(MultipartFile file);

    List<String> getObjectFromS3();

    InputStream downloadFile(String key);
}
