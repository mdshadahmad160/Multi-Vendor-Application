package com.zosh.ecommerce.multivendor.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userCode;
    private String name;
    private String lastName;
    private String email; // username
    private String password;
    private String phoneNumber;
    private String address;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER)
    @Nullable
    private Set<AppUserRole> roles;
    private LocalDateTime createdAt;
    private LocalDateTime expiredAt;
    private Boolean isLocked;
    private Boolean isCredentialsExpired;
    private Boolean isEnabled;
}
