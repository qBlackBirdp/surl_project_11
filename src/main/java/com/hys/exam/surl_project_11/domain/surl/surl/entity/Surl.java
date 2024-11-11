package com.hys.exam.surl_project_11.domain.surl.surl.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hys.exam.surl_project_11.domain.member.member.entity.Member;
import com.hys.exam.surl_project_11.global.jpa.entity.BaseTime;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
public class Surl extends BaseTime {
    private String body;
    private String url;
    @Setter(AccessLevel.NONE)
    private long count;

    @ManyToOne
    @JsonIgnore
    private Member author;

    public void increaseCount() {
        count++;
    }

}
