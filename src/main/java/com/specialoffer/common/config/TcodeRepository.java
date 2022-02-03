package com.specialoffer.common.config;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.specialoffer.offer.vo.TcodeVo;

@Repository
public interface TcodeRepository extends JpaRepository<TcodeVo, Long>, JpaSpecificationExecutor<TcodeVo> {

	// findBy뒤에 컬럼명을 붙여주면 이를 이용한 검색이 가능하다
	public List<TcodeVo> findByCd(String cd);
	
	public List<TcodeVo> findByNm(String name);
	
	public List<TcodeVo> findByNmLike(String keyword);

}

