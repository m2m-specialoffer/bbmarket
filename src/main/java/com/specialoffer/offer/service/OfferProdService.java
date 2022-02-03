package com.specialoffer.offer.service;

import java.util.HashMap;
import java.util.List;

import com.specialoffer.offer.vo.TcodeVo;

public interface OfferProdService {
	
	
	public List<HashMap<Object,Object>> offerProdList(HashMap<Object,Object> parmMap);

	public List<TcodeVo> tcodefindAll();
	
	public List<TcodeVo> tcodefindByCd(String cd);
}
