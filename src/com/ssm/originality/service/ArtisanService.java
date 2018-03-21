package com.ssm.originality.service;

import java.util.List;

import com.ssm.originality.po.Artisan;

public interface ArtisanService {
	List<Artisan> selectArtisan()throws Exception; 
    Artisan selectOneArtisan(Integer ids)throws Exception;
}
