package hcmute.vn.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hcmute.vn.Entity.GiaSu;
import hcmute.vn.Repository.IGiaSuRepository;

@Service
public class GiaSuServiceImpl implements IGiaSuService {

	@Autowired
	private IGiaSuRepository giasuRepo;

	public GiaSuServiceImpl(IGiaSuRepository giasuRepo) {
		this.giasuRepo = giasuRepo;
	}

	@Override
	public <S extends GiaSu> S save(S entity) {
		return giasuRepo.save(entity);
	}

	@Override
	public List<GiaSu> findAll() {
		return giasuRepo.findAll();
	}

	@Override
	public List<GiaSu> findAllById(Iterable<Integer> ids) {
		return giasuRepo.findAllById(ids);
	}

	@Override
	public Optional<GiaSu> findById(Integer id) {
		return giasuRepo.findById(id);
	}

	@Override
	public void deleteById(Integer id) {
		giasuRepo.deleteById(id);
	}
	
	

}
