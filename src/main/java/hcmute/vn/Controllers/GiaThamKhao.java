package hcmute.vn.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GiaThamKhao {
	@RequestMapping(value = "/GiaThamKhao.html")
	public String giathamkhao() {
		return "GiaThamKhao";
	}
}
