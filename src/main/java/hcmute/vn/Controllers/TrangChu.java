package hcmute.vn.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TrangChu {
	@RequestMapping(value = "/")
	public String trangchu() {
		return "TrangChu";
	}
	
	@RequestMapping(value = "/TrangChu.html")
	public String trangchu1() {
		return "TrangChu";
	}
}
