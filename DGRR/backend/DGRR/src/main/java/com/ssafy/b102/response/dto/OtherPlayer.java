package com.ssafy.b102.response.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OtherPlayer {
	private String nickname;
	private String profileImg;
	private List<Integer> score;
	private List<Integer> sumScore;
	private Integer rank;
}
