package com.msa.gathering.controller.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdatePointRequest {
    private Long accountId;
    private PointReason reason;
}
