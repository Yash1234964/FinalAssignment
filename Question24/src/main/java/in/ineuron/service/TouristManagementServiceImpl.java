package in.ineuron.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.dao.ITouristRepo;
import in.ineuron.model.Tourist;

@Service
public class TouristManagementServiceImpl implements ITouristManagementService {

	@Autowired
	ITouristRepo repo;
	
	@Override
	public String registerTourist(Tourist tourist) {
		
		Integer tid=repo.save(tourist).getTid();
		
		
		
		return "Tourist is registered having the ticket id :: " + tid;
	}

	@Override
	public List<Tourist> fetchAllTourist() {
		List<Tourist> list=repo.findAll();
		list.sort((t1,t2)->t1.getTid().compareTo(t2.getTid()));
		return list;
	}

	@Override
	public Tourist fetchTouristById(Integer id) throws Exception {
		Optional<Tourist> optional=repo.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}else {
	      throw new Exception(id + " record not found");		
		}
	}

	@Override
	public String updateTouristByDetails(Tourist tourist) throws Exception {
		
		Optional<Tourist> optional=repo.findById(tourist.getTid());
		
		if(optional.isPresent()) {
			repo.save(tourist);
			return "Tourist with the id "+tourist.getTid()+" updated";
		}else {
			throw new Exception("Details not available");
		}
		
		
	}

	@Override
	public String updateTouristById(Integer id, Float hikePercent) throws Exception {
		Optional<Tourist> optional=repo.findById(id);
		
		if(optional.isPresent()) {
			Tourist tourist=optional.get();
			tourist.setBudget(tourist.getBudget()+tourist.getBudget()*(hikePercent/100));
			repo.save(tourist);
			return "Budget update successful";
		}else {
			throw new Exception("Tourist not found");
		}
	}

	@Override
	public String deleteTouristById(Integer id) throws Exception {
Optional<Tourist> optional=repo.findById(id);
		
		if(optional.isPresent()) {
			
			repo.deleteById(id);
			return "Delete successful "+id;
		}else {
			throw new Exception("Tourist not found");
		}
	}

}

















