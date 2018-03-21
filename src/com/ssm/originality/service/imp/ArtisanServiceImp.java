package com.ssm.originality.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.originality.mapper.ArtisanMapper;
import com.ssm.originality.po.Artisan;
import com.ssm.originality.service.ArtisanService;
@Service
public class ArtisanServiceImp implements ArtisanService {
    @Resource   
	private ArtisanMapper artisanMapper;
    /**
     * 查找所有的工匠
     */
	@Override
	public List<Artisan> selectArtisan() throws Exception {
		return artisanMapper.selectArtisan();
	}
    /**
     * 查找单个的工匠
     */
	@Override
	public Artisan selectOneArtisan(Integer ids) throws Exception {
		return artisanMapper.selectByPrimaryKey(ids);
	}
}
