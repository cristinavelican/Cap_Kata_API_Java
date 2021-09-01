package models;
import lombok.*;

@Value
@AllArgsConstructor
@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
@Builder(toBuilder = true, builderClassName = "Builder")
public class Pets {

    String id;
    String category;
    String name;
    String status;


}
