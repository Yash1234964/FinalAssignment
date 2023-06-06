package in.ineuron.service;

import java.util.List;

import in.ineuron.model.Tourist;

public interface ITouristManagementService {
	public String registerTourist(Tourist tourist);
	public List<Tourist> fetchAllTourist();
	public Tourist fetchTouristById(Integer id) throws Exception;
	public String updateTouristByDetails(Tourist tourist) throws Exception;
	public String updateTouristById(Integer id,Float hikePercent) throws Exception;
	public String deleteTouristById(Integer id) throws Exception;
}
