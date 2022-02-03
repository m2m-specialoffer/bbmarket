package com.specialoffer.offer.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OfferProdVo {

	@ApiModelProperty(value="페이지번호", notes = "페이지번호(default:1)")
	private int pageNumber = 1;
	
	@ApiModelProperty(value="페이지별 목록수", notes = "페이지별 목록수(default:10)")
	private int rowsPerPage = 10;

	@ApiModelProperty(value="오퍼코드", notes = "오퍼코드")
	private String offerCd; // 오퍼코드

	@ApiModelProperty(value="오퍼명", notes = "오퍼명칭")
	private String offerNm; // 오퍼명

	@ApiModelProperty(value="상품코드", notes = "상품코드")
	private String prodCd; // 상품코드

	@ApiModelProperty(value="상품명", notes = "상품명")
	private String prodNm; // 상품명

	@ApiModelProperty(value="상품명", notes = "상품명")
	private String offerStartDt; // 오퍼 시작일

	@ApiModelProperty(value="상품명", notes = "상품명")
	private String offerEndDt; // 오퍼 마감일

	@ApiModelProperty(value="구분", notes = "구분", example = "1")
	private String offerEventType;  // 구분 - 1:할인, 2:행사

	@ApiModelProperty(value="판매구분", notes = "판매구분")
	private String offerSaleType; // 판매구분 (1:온라인.....)

	@ApiModelProperty(value="오퍼가격", notes = "해당오퍼의 상품가격")
	private long offerPrice; // 오퍼가격

	@ApiModelProperty(value="적용회원등급", notes = "해당오퍼에 적용되는 회원등급")
	private String memberGrade; // 적용회원등급

	@ApiModelProperty(value="발주사", notes = "발주사, 판매자")
	private String sellerFirmNm; // 발주사

	@ApiModelProperty(value="최소판매수량", notes = "해당 오퍼의 최소판매수량")
	private int minimumQty; // 최소판매수량

	@ApiModelProperty(value="최대판매수량", notes = "해당 오퍼의 최대판매수량")
	private int maximumQty; // 최대판매수량

}
