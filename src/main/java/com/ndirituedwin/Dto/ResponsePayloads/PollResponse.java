package com.ndirituedwin.Dto.ResponsePayloads;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PollResponse {
 private Long id;
 private String question;
 private List<ChoiceResponse> choices;
 private UserSummary createdBy;
 private Instant creationDateTime;
 private Instant expirationDateTime;
 private Boolean isExpired;
 @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long selectedChoice;
 private Long totalVotes;

}
