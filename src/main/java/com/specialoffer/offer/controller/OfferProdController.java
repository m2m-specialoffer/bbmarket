package com.specialoffer.offer.controller;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.specialoffer.offer.service.OfferProdService;
import com.specialoffer.offer.vo.OfferProdVo;
import com.specialoffer.offer.vo.TcodeVo;

import io.swagger.annotations.ApiOperation;

//@slf4j
@RestController
@RequestMapping("/offer/api")
public class OfferProdController {

	@Autowired
	private OfferProdService service;
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	
	@PostMapping(value = "/offerProdList")
	@ApiOperation(value="오퍼상품 목록 조회", notes="오퍼상품 목록을 조회한다.")
	public ResponseEntity<OfferProdVo> offerProdList(@RequestBody String id){

		logger.info("TEST ################################");
		
		OfferProdVo vo = new OfferProdVo();
		vo.setOfferCd("11234567");
		vo.setOfferNm("신년맞이 특별 할인 행사");

		return ResponseEntity.ok(vo); 
	}

	@PostMapping(value = "/mybatisTest")
	@ApiOperation(value="mybatisTest", notes="mybatisTest")
	public ResponseEntity<List<HashMap<Object, Object>>> mybatisTest(@RequestBody HashMap<Object, Object> paramMap){
		
		List<HashMap<Object, Object>> offerProdList = service.offerProdList(paramMap);
		
		return ResponseEntity.ok(offerProdList); 
	}
	
	@PostMapping(value = "/jpaTestFindByAll")
	@ApiOperation(value="jpaTest", notes="jpaTest")
	public ResponseEntity<List<TcodeVo>> jpaTest(@RequestBody String cd){
		
		List<TcodeVo> tcodeList = service.tcodefindAll();
		
		return ResponseEntity.ok(tcodeList); 
	}
	
	@PostMapping(value = "/jpaTestFindByCd")
	@ApiOperation(value="jpaTest", notes="jpaTest")
	public ResponseEntity<List<TcodeVo>> jpaTest2(@RequestBody String cd){
		
		logger.info("cd : {}", cd);
		
		List<TcodeVo> tcodeList  = service.tcodefindByCd(cd);
		
		return ResponseEntity.ok(tcodeList); 
	}
	
}
