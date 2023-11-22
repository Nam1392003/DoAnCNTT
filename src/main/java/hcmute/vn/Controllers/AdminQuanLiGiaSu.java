package hcmute.vn.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import hcmute.vn.Entity.GiaSu;
import hcmute.vn.Services.IGiaSuService;

@Controller
public class AdminQuanLiGiaSu {

	@Autowired
	IGiaSuService giasuService;
	
	@RequestMapping("/AdminQuanLiGiaSu")
	public String list(ModelMap model) {
		List<GiaSu> list = giasuService.findAll();
		model.addAttribute("giasu", list);
		return "AdminQuanLiGiaSu";
	}
}
