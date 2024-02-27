package com.javaacademy;

import lombok.*;
import lombok.experimental.FieldDefaults;

/**
 * Город
 */

@AllArgsConstructor
@ToString(exclude = {"peopleCount"})
@Getter
@FieldDefaults(level = AccessLevel.PUBLIC)
public class City {
    @NonNull
    final String name;
    @Setter
    int peopleCount;

    public Garbage[] createGarbage() {
        return new Garbage[]{
                new Garbage(GarbageType.GLASS, 1000, this.name),
                new Garbage(GarbageType.PAPER, 15000, this.name),
                new Garbage(GarbageType.MIXED, 200000, this.name),
        };
    }
}