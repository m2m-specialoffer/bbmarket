package com.specialoffer.offer.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.specialoffer.common.config.TcodeRepository;
import com.specialoffer.offer.mapper.OfferProdMapper;
import com.specialoffer.offer.service.OfferProdService;
import com.specialoffer.offer.vo.TcodeVo;

@Service
@Transactional
public class OfferProdServiceImpl implements OfferProdService {

	@Autowired
	private OfferProdMapper mapper;
	
	@Autowired
	private TcodeRepository tcodeRepository;
	
	public List<HashMap<Object,Object>> offerProdList(HashMap<Object,Object> parmMap) {

		return mapper.selectOfferProdList(parmMap);
	}
	
	public List<TcodeVo> tcodefindAll() {
		List<TcodeVo> tcodeList = new ArrayList<>(); 
		
		tcodeRepository.findAll().forEach(e -> tcodeList.add(e));

		return tcodeList;
	}
	
	public List<TcodeVo> tcodefindByCd(String cd) {

		List<TcodeVo> tcodeList = new ArrayList<>(); 
		
		tcodeRepository.findByCd(cd).forEach(e -> tcodeList.add(e));;

		return tcodeList;
	}
	
}
