package com.foksman.jsonapi.model;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@NoArgsConstructor
@Data
public class QueryRequestDto {
    @NonNull
    private  String tags;
    private  String sortBy;
    private  String direction;

}
