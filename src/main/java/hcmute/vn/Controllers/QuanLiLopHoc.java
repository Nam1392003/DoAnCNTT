package hcmute.vn.Controllers;

import hcmute.vn.Entity.LopHoc;
import hcmute.vn.Services.ILopHocService;
import hcmute.vn.Services.LopHocServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class QuanLiLopHoc {
    @Autowired
    ILopHocService lophocservice = new LopHocServiceimpl();
    @GetMapping("/lophoc")
    public String xemLopHoc(Model model) {
        List<LopHoc> lophoc = lophocservice.findAll();
        model.addAttribute("lophoc", lophoc);
        return "CacLopHienCo";
    }

}
