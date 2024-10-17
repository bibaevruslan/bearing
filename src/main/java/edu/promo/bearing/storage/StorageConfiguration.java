package edu.promo.bearing.storage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.nio.ByteBuffer;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class StorageConfiguration {

    @Bean
    public ByteBuffer storageBuffer() {
        return ByteBuffer.allocate(1024 * 8);
    }

}
