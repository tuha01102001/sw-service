package com.example.demo.common.tiktok.response.order;

import com.example.demo.common.tiktok.model.order.TiktokOrdersModel;
import com.example.demo.common.tiktok.response.TiktokBaseResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TiktokOrdersResponse extends TiktokBaseResponse implements Serializable{
    private static final long serialVersionUID = 1L;

    @JsonProperty("data")
    private TiktokOrdersModel data;
}
