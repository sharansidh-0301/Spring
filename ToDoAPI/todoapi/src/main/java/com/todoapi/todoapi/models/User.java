package com.todoapi.todoapi.models;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Enabled
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="userTable")
public class User {

    @Id
    @GeneratedValue
    Long id;
    @Email
    String email;
    String password;

}
