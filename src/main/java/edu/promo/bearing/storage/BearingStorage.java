package edu.promo.bearing.storage;

import java.nio.ByteBuffer;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class BearingStorage implements Storage {

    private final ByteBuffer buffer;

}
