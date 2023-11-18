package hcmute.vn.Services;

import java.util.List;
import java.util.Optional;

import hcmute.vn.Entity.GiaSu;

public interface IGiaSuService {

	void deleteById(Integer id);

	Optional<GiaSu> findById(Integer id);

	List<GiaSu> findAllById(Iterable<Integer> ids);

	List<GiaSu> findAll();

	<S extends GiaSu> S save(S entity);
	
}
