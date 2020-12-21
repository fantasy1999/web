package com.example.webproject.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataGripView {

    private Integer code = 0;
    private String msg = "";
    private Long count;
    private Object data;

    public DataGripView(Long count, Object data) {
        this.count = count;
        this.data = data;
    }

}
