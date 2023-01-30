package com.example.dogservice.model.dto_for_data_migration;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Data
@Builder
@EqualsAndHashCode(exclude = "success")
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SubBreedsDTO {
    private List<Object> message;
    private String status;
	
    
}
