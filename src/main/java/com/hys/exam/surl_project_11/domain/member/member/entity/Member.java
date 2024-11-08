package com.hys.exam.surl_project_11.domain.member.member.entity;

import com.hys.exam.surl_project_11.global.jpa.entity.BaseTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
public class Member extends BaseTime {

    @Column(unique = true)
    private String username;
    private String password;
    private String nickname;
}