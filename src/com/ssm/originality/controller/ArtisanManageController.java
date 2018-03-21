package com.ssm.originality.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.originality.po.Artisan;
import com.ssm.originality.service.ArtisanService;

@Controller
public class ArtisanManageController {
	@Resource
	private ArtisanService artisanService;
	/**
	 * 查找6个匠人，放在匠人的首页
	 * @param model
	 * @return "jsp/master" 匠人首页 
	 * @throws Exception
	 */
    @RequestMapping("/selectArtisan")
	public String selectArtisan(Model model)throws Exception{
	    List<Artisan> Listartisan = artisanService.selectArtisan();
        List<Artisan> list=new ArrayList<Artisan>();
	    for (int i=0;i<6;i++){
        	list.add(Listartisan.get(i));
        }
	    model.addAttribute("artisan", list);
	    return "jsp/master";		
	}
    /**
     *  具体的工匠信息
     *  返回到具体的工匠信息页面
     * @param ids
     * @return
     * @throws Exception
     */
    @RequestMapping("/artisanDetail")
    public String artisanDetail(Integer ids)throws Exception{
		Artisan artisan=artisanService.selectOneArtisan(ids);
		
    	return null;    	
    }

}
