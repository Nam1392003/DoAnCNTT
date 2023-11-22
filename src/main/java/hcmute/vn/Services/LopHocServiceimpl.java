package hcmute.vn.Services;

import hcmute.vn.Entity.LopHoc;
import hcmute.vn.Repository.ILopHocRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class LopHocServiceimpl implements ILopHocService{
    @Autowired
    private ILopHocRepository lophoc;
    @Override
    public List<LopHoc> findAll() {
        return lophoc.findAll();
    }
}
