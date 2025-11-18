package edu.icet.model.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Member {

    private String id;
    private String name;
    private String nic;
    private String address;
    private String phone;


}
