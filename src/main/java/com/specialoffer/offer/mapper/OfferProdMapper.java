package com.specialoffer.offer.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface OfferProdMapper {

	
	List<HashMap<Object, Object>> selectOfferProdList(HashMap<Object, Object> paramMap);
}
