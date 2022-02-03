package com.specialoffer.offer.vo;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
//@NoArgsConstrucor
@Entity(name="tcode")
public class TcodeVo {

	private TcodeVo() {
	}
	
	@Id
	@ApiModelProperty(value="코드", notes = "코드")
	private String cd; // 코드

	@ApiModelProperty(value="명칭", notes = "명칭")
	private String nm; // 명칭
/*
	@Builder
	public TcodeVo(String cd, String nm) {
		this.cd = cd;
		this.nm = nm;
	}
*/
}
