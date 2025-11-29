package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString


@Entity
public class Member {

    @Id
    private String id;
    private String name;
    private String nic;
    private String address;
    private String phone;


}
