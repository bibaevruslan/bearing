package edu.promo.bearing.api;

import edu.promo.bearing.storage.Storage;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/storage")
public class StorageController {

    private final Storage storage;

    @PostMapping(value = "save", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> save() {
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> setValue() {
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getValue() {
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping(value = "{key}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deleteByKey(@PathVariable String key) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

}
